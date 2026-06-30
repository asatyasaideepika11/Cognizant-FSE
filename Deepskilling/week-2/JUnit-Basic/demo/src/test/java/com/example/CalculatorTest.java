package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator c = new Calculator();

        assertEquals(15, c.add(10,5));

    }
}