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
       owingPrinter.printOwing(name,orderList);
    }
}