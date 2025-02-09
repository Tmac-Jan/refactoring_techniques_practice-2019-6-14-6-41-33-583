package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {

  void printOwing(String name, List<Order> orders) {
    printBanner();
    printNameAndAmount(name, calculateOutstanding(orders));

  }

  private double calculateOutstanding(List<Order> orders) {
    double outstanding = 0.0;
    Iterator<Order> elements = orders.iterator();
    while (elements.hasNext()) {
      Order each = (Order) elements.next();
      outstanding += each.getAmount();
    }
    return outstanding;
  }

  private void printNameAndAmount(String name, double amount) {
    System.out.println("name: " + name);
    System.out.println("amount: " + amount);
  }

  private void printBanner() {
    System.out.println("*****************************");
    System.out.println("****** Customer totals ******");
    System.out.println("*****************************");
  }
}

class Order {

  private final double amount;

  public Order(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }
}
