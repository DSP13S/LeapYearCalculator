package edu.bsu.cs222;

// class constructor LeapYear(int)
public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        return isDivisibleBy(year, 4) && !isDivisibleBy(year, 100)
                || isDivisibleBy(year, 400);
    }
    public boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }
}