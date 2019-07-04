package com.carsearch.search.service.impl;


import com.carsearch.search.domain.CarBrand;
import com.carsearch.search.domain.Cars;
import com.carsearch.search.domain.CarsType;
import com.carsearch.search.exception.RestOperationException;
import com.carsearch.search.repository.CarsRepository;
import com.carsearch.search.service.CarsService;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Car Service Class
 */
@Service
public class CarsServiceImpl implements CarsService {
  private static final Logger LOGGER = LogManager.getLogger(CarsServiceImpl.class);

  private CarsRepository carsRepository;

  @Autowired
  public CarsServiceImpl(CarsRepository carsRepository) {
    this.carsRepository = carsRepository;
  }

  /**
   * @param carsType : car type (e.g. sedan, suv, wagon, truck)
   * @return : list of car's Details
   */
  @Override
  public List<Cars> getByPriceAndType(CarsType carsType) {
    if (Objects.isNull(carsType)) {
      throw new RestOperationException("", HttpStatus.BAD_REQUEST);
    }
    LOGGER.info("Getting list of cars with min price = {} , max price = {} and car type = {}", carsType.getMinimum_Price_In_Dollars(),
            carsType.getMaximum_price_In_Dollars(), carsType.getCarType());
    List<Cars> cars = carsRepository.getByPriceAndType(StringUtils.capitalize(carsType.getCarType().toLowerCase()), carsType.getMinimum_Price_In_Dollars(), carsType.getMaximum_price_In_Dollars());
    return cars;
  }

  /**
   * @param carBrand : car brand ( e.g. audi, mercedes, ford, dodge)
   * @return : list of car's Details
   */
  @Override
  public List<Cars> getByPriceAndBrand(CarBrand carBrand) {
    if (Objects.isNull(carBrand)) {
      throw new RestOperationException("", HttpStatus.BAD_REQUEST);
    }
    LOGGER.info("Getting list of cars with min price = {} , max price = {} and car brand = {}", carBrand.getMinimum_Price_In_Dollars(),
            carBrand.getMaximum_price_In_Dollars(), carBrand.getBrand());
    List<Cars> cars = carsRepository.getByPriceAndBrand(carBrand.getBrand().toLowerCase(), carBrand.getMinimum_Price_In_Dollars(), carBrand.getMaximum_price_In_Dollars());
    return cars;
  }


  /**
   * @return : list of all cars
   */
  @Override
  public List<Cars> getAllCars() {
    List<Cars> carsList = carsRepository.findAll();
    if (carsList.isEmpty()) {
      throw new RestOperationException("No Data Found", HttpStatus.NOT_FOUND);
    }
    return carsList;
  }

  /**
   * @param brandList : car brand (e.g.  [audi, mercedes, ford, dodge] )
   * @return
   */
  @Override
  public Map<String, List<Cars>> getModelsByBrand(List<String> brandList) {
    if (brandList.isEmpty()) {
      throw new RestOperationException("List Cannot Be Empty", HttpStatus.BAD_REQUEST);
    }
    Map<String, List<Cars>> modelsList = new HashMap<>();
    brandList.forEach(brand -> {
      List<Cars> dbModelList = carsRepository.getModelsByBrand(brand);
      modelsList.put(brand, dbModelList);
    });
    return modelsList;
  }
}
