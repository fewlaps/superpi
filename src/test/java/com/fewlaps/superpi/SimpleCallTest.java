package com.fewlaps.superpi;

import org.junit.Before;
import org.junit.Test;

public class SimpleCallTest {

    PiCalculator calculator;

    @Before
    public void setUp() {
        calculator = new PiCalculator();
    }

    @Test
    public void shouldWork_forInput1() {
        int input = 1;
        calculator.gaussLegendre(input);
    }

    @Test
    public void shouldWork_forInput2() {
        int input = 2;
        calculator.gaussLegendre(input);
    }

    @Test
    public void shouldWork_forInput3() {
        int input = 3;
        calculator.gaussLegendre(input);
    }
}