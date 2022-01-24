package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class LeapYearCalculatorTest<LeapYearCalculator> {
    private final LeapYearCalculator calculator = new LeapYearCalculator();
    @ParameterizedTest
    public void testIsLeapYear(int year, boolean expected) {
        boolean result = calculator.isLeapYear(year);
        Assertions.assertEquals(expected, result);
    }

}