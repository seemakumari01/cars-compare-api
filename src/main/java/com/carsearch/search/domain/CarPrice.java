package com.carsearch.search.domain;

public class CarPrice {

  private int minimum_Price_In_Dollars;
  private int maximum_price_In_Dollars;

  public int getMinimum_Price_In_Dollars() {
    return minimum_Price_In_Dollars;
  }

  public void setMinimum_Price_In_Dollars(int minimum_Price_In_Dollars) {
    this.minimum_Price_In_Dollars = minimum_Price_In_Dollars;
  }

  public int getMaximum_price_In_Dollars() {
    return maximum_price_In_Dollars;
  }

  public void setMaximum_price_In_Dollars(int maximum_price_In_Dollars) {
    this.maximum_price_In_Dollars = maximum_price_In_Dollars;
  }
}
