package com.carsearch.search.rest.RestController;

import com.carsearch.search.Constants;
import com.carsearch.search.domain.CarBrand;
import com.carsearch.search.domain.Cars;
import com.carsearch.search.domain.CarsType;
import com.carsearch.search.service.CarsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api(tags = "Cars-Search")
@RestController
@RequestMapping(Constants.API_BASE_URL + "/cars")
public class CarsRestController {

  private CarsService carsService;

  @Autowired
  public CarsRestController(CarsService carsService) {
    this.carsService = carsService;
  }

  @PostMapping(value = "/search-by-type")
  @ApiOperation(value = "Search Car By Price and Type")
  public List<Cars> getByPriceAndType(@RequestBody CarsType carsType) {
    return carsService.getByPriceAndType(carsType);
  }

  @PostMapping(value = "/search-by-brand")
  @ApiOperation(value = "Search Car By Price and Brand")
  public List<Cars> getByPriceAndBrand(@RequestBody CarBrand carBrand) {
    return carsService.getByPriceAndBrand(carBrand);
  }

  @GetMapping(value = "/")
  @ApiOperation(value = "Details Of All Cars")
  public List<Cars> getAll() {
    return carsService.getAllCars();
  }

  @PostMapping(value = "/get-cars-by-brand")
  @ApiOperation(value = "Get cars details by Brands")
  public Map<String, List<Cars>> getModelsByBrand(@RequestBody List<String> brandList) {
    return carsService.getModelsByBrand(brandList);
  }
}
