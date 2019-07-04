package com.carsearch.search.repository;

import com.carsearch.search.domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Car Repository
 *
 * @purpose - It is used to get the data from database
 */
@Repository
public interface CarsRepository extends JpaRepository<Cars, String> {

  /**
   * @param carType  : car type (e.g. sedan, suv, wagon, truck)
   * @param minPrice : car minimum price
   * @param maxPrice : car maximum price
   * @return : list of car's details
   * @impl : it gets the details of car on the basis of minimum and maximum price and type of car.
   */
  @Query(value = "SELECT * FROM Cars t WHERE t.type=?1  and t.invoice BETWEEN ?2 And ?3",
          nativeQuery = true)
  List<Cars> getByPriceAndType(String carType, int minPrice, int maxPrice);


  /**
   * @param brand    : car brand (e.g. audi, mercedes, ford, dodge)
   * @param minPrice :  car minimum price
   * @param maxPrice : car maximum price
   * @return : list of car's details
   * @impl : it gets the details of car on the basis of minimum and maximum price and brand of car.
   */
  @Query(value = "SELECT c.* FROM ft_search_data(?1,0,0) ft inner join cars c on c.model = ft.keys[1] where invoice between ?2 and ?3",
          nativeQuery = true)
  List<Cars> getByPriceAndBrand(String brand, int minPrice, int maxPrice);


  /**
   * @param brand : car brand ( audi, mercedes, ford, dodge)
   * @return : list of car's detail
   */
  @Query(value = "SELECT c.* FROM ft_search_data(?1,0,0) ft inner join cars c on c.model = ft.keys[1]", nativeQuery = true)
  List<Cars> getModelsByBrand(String brand);
}
