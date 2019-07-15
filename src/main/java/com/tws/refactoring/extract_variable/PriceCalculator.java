package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private final int BASE_COUNT = 500;
    private final double DISCOUNT=0.05;
    private final double ITEM_DISCOUNT = 0.01;
    private final double FREE_SHIPING_ON=100;
    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        return quantity * itemPrice -
            Math.max(0, calculateBasePrice(quantity)) * calculateItemPriceDiscount(itemPrice) +
                Math.min(calculateItemDiscount(quantity, itemPrice), FREE_SHIPING_ON);
    }

    private double calculateItemDiscount(int quantity, int itemPrice) {
        return quantity * itemPrice * ITEM_DISCOUNT;
    }


    private double calculateItemPriceDiscount(int itemPrice) {
        return itemPrice * DISCOUNT;
    }

    private int calculateBasePrice(int quantity) {
        return quantity - BASE_COUNT;
    }
}
