package com.carsearch.search.service;

import com.carsearch.search.domain.CarBrand;
import com.carsearch.search.domain.Cars;
import com.carsearch.search.domain.CarsType;

import java.util.List;
import java.util.Map;

public interface CarsService {
  List<Cars> getByPriceAndType(CarsType carsType);

  List<Cars> getByPriceAndBrand(CarBrand carBrand);

  List<Cars> getAllCars();

  Map<String, List<Cars>> getModelsByBrand(List<String> brandList);
}
