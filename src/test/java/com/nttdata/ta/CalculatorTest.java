package com.nttdata.ta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{
    @Test
    public void areaIsProductOfSides()
    {
        Calculator calc = new Calculator();
        int area = calc.area(20,30);
        assertEquals(600,area);
    }

    @Test
    public void areaInMetersIsAreaInFeetXConversion()
    {
        Calculator calc = new Calculator();
        double meters = calc.sqft2sqm(600);
        double expected = 600 * 0.09290304;
        assertEquals(expected, meters, 0.001);
    }
}