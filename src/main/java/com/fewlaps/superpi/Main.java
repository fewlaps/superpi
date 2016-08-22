package com.fewlaps.superpi;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArgumentsMapper argumentsMapper = new ArgumentsMapper();
        Arguments arguments = argumentsMapper.map(args);

        System.out.println("Test started with " + arguments.getThreads() + " threads and " + arguments.getIterations() + " iterations");

        PiStresser stresser = new PiStresser(arguments.getThreads(), arguments.getIterations());
        long startTime = System.currentTimeMillis();
        stresser.start();
        long tookTime = System.currentTimeMillis() - startTime;

        System.out.println("Test finished in " + NumberFormat.getNumberInstance().format(tookTime) + " ms");
    }

}
