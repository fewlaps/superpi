package com.fewlaps.superpi;

import org.junit.Test;

public class PiStresserTest {

    PiStresser stresser;

    @Test
    public void shouldWork_for1thread_and1Iteration() throws InterruptedException {
        long threads = 1;
        long iterations = 1;
        stresser = new PiStresser(threads, iterations);
        stresser.start();
    }

    @Test
    public void shouldWork_for10threads_and10Iterations() throws InterruptedException {
        long threads = 10;
        long iterations = 10;
        stresser = new PiStresser(threads, iterations);
        stresser.start();
    }

    @Test
    public void shouldWork_for100threads_and100Iterations() throws InterruptedException {
        long threads = 100;
        long iterations = 100;
        stresser = new PiStresser(threads, iterations);
        stresser.start();
    }

    @Test
    public void shouldWork_for1000threads_and1000Iterations() throws InterruptedException {
        long threads = 1000;
        long iterations = 1000;
        stresser = new PiStresser(threads, iterations);
        stresser.start();
    }

    @Test
    public void shouldWork_for10000threads_and10000Iterations() throws InterruptedException {
        long threads = 10000;
        long iterations = 10000;
        stresser = new PiStresser(threads, iterations);
        stresser.start();
    }
}