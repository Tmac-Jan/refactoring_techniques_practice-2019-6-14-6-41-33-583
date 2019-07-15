package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private final int BASE_COUNT = 500;
    private final double DISCOUNT=0.05;
    private final double ITEM_DISCOUNT = 0.01;
    private final double MAX_NUM=100;
    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        return quantity * itemPrice -
                Math.max(0, quantity - BASE_COUNT) * itemPrice * DISCOUNT +
                Math.min(quantity * itemPrice * ITEM_DISCOUNT, MAX_NUM);
    }
}
