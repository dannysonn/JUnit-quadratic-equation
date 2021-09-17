package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0){
            throw new IllegalArgumentException();
        }

        Double D = b * b - 4 * a * c;

        if (D > 0){
            double x1;
            double x2;

            x1 = (-b + Math.sqrt(D))/(2 * a);
            x2 = (-b - Math.sqrt(D))/(2 * a);

            return x1 + " " + x2;
        }
        else if (D == 0) {
            double x;

            x = (-b)/(2 * a);

            return String.valueOf(x);
        }
        else{
            return "no roots";
        }

    }

}