package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 6, 9, -3}, {1, 6, 9, -3}, {1, 6, 9, -3}, {1, 6, 9, -3}
        });
    }

    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testSingleRootCase() {
        assertEquals(expected + "", quadraticEquation.solve(a, b, c));
    }
}