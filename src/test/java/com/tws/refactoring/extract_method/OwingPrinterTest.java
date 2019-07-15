package com.tws.refactoring.extract_method;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OwingPrinterTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void printOwing() {
    String name = "gio";
    double amount = 888.0;
    OwingPrinter owingPrinter = new OwingPrinter();
    Order order = new Order(amount);
    List<Order> orderList = new ArrayList<>();
    orderList.add(order);
    owingPrinter.printOwing(name, orderList);
  }

  @Test
  public void should_get_owing_when_give_name_and_two_order() {
    OwingPrinter owingPrinter = new OwingPrinter();
    Order firstOrder = new Order(5);
    Order secondOrder = new Order(6);
    List<Order> orderList = new ArrayList<Order>() {{
      add(firstOrder);
      add(secondOrder);
    }};

    //when
    owingPrinter.printOwing("apple", orderList);
    String expectedResult = "*****************************\r\n" +
        "****** Customer totals ******\r\n" +
        "*****************************\r\n" +
        "name: apple\r\n" +
        "amount: 11.0\r\n";

    //then
    assertEquals(expectedResult, outContent.toString());

  }
}