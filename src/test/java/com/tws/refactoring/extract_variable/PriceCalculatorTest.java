package com.tws.refactoring.extract_variable;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceCalculatorTest {

  @Test
  public void should_get_25050_when_given_quantity_is_499_AND_itemPrice_is_50(){
    //given
      int itemPrice = 50;
      int quantity = 499;
      PriceCalculator priceCalculator = new PriceCalculator();
    //when
      double result = priceCalculator.getPrice(quantity,itemPrice);
    //then
    assertEquals(25050.0,result,0.01);
  }
  @Test
  public void should_get_25100_when_given_quantity_is_500_AND_itemPrice_is_50(){
    //given
    int itemPrice = 50;
    int quantity = 500;
    PriceCalculator priceCalculator = new PriceCalculator();
    //when
    double result = priceCalculator.getPrice(quantity,itemPrice);
    //then
    assertEquals(25100.0,result,0.01);
  }
}