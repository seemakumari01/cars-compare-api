package com.carsearch.search.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cars {
  private String brand;
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private String model;
  private String type;
  private String origin;
  private String driveTrain;
  private String msrp;
  private String invoice;
  private String engineSize;
  private String cyclinders;
  private String horsepower;
  private String mpg_city;
  private String mpg_highway;
  private String weight;
  private String wheelbase;
  private String length;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public String getMsrp() {
    return msrp;
  }

  public void setMsrp(String msrp) {
    this.msrp = msrp;
  }

  public String getInvoice() {
    return invoice;
  }

  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }

  public String getEngineSize() {
    return engineSize;
  }

  public void setEngineSize(String engineSize) {
    this.engineSize = engineSize;
  }

  public String getCyclinders() {
    return cyclinders;
  }

  public void setCyclinders(String cyclinders) {
    this.cyclinders = cyclinders;
  }

  public String getHorsepower() {
    return horsepower;
  }

  public void setHorsepower(String horsepower) {
    this.horsepower = horsepower;
  }

  public String getMpg_city() {
    return mpg_city;
  }

  public void setMpg_city(String mpg_city) {
    this.mpg_city = mpg_city;
  }

  public String getMpg_highway() {
    return mpg_highway;
  }

  public void setMpg_highway(String mpg_highway) {
    this.mpg_highway = mpg_highway;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getWheelbase() {
    return wheelbase;
  }

  public void setWheelbase(String wheelbase) {
    this.wheelbase = wheelbase;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }
}
