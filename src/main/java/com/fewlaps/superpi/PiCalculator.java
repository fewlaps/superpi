package com.fewlaps.superpi;

class PiCalculator {
    public double gaussLegendre(long iterations) {
        double a = 1.0f;
        double b = 1.0f / Math.sqrt(2);
        double t = 1.0f / 4.0f;
        double p = 1.0f;

        for (int i = 0; i < iterations; i++) {
            double aNext = (a + b) / 2;
            double bNext = Math.sqrt(a * b);
            double tNext = t - p * Math.pow(a - aNext, 2);
            double pNext = 2 * p;
            a = aNext;
            b = bNext;
            t = tNext;
            p = pNext;
        }

        return Math.pow(a + b, 2) / (4 * t);
    }
}