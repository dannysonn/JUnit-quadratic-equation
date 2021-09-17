package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2, 1, -3, "1.0 -1.5"}, {2, 1, -3, "1.0 -1.5"}, {2, 1, -3, "1.0 -1.5"}, {2, 1, -3, "1.0 -1.5"}
        });
    }

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testTwoRootsCase() {
        String result = quadraticEquation.solve(a, b, c);
        String[] strings = result.split(" ");
        if (!result.equals(expected) && strings.length > 1){
            String newRes = strings[1] + " " + strings[0];
            assertEquals(expected, newRes);
        }
        else {
            assertEquals(expected, quadraticEquation.solve(a, b, c));
        }
    }
}
