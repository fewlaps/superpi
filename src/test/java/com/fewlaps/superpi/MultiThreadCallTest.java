package com.fewlaps.superpi;

import org.junit.Test;

public class MultiThreadCallTest {

    PiThread piThread;

    @Test
    public void shouldWork_forInput1() throws InterruptedException {
        int input = 1;
        piThread = new PiThread(input);
        piThread.start();

        while (!piThread.hasEnded()) {
            Thread.sleep(10);
        }
    }

    @Test
    public void shouldWork_forInput2() throws InterruptedException {
        int input = 2;
        piThread = new PiThread(input);
        piThread.start();

        while (!piThread.hasEnded()) {
            Thread.sleep(10);
        }
    }

    @Test
    public void shouldWork_forInput3() throws InterruptedException {
        int input = 3;
        piThread = new PiThread(input);
        piThread.start();

        while (!piThread.hasEnded()) {
            Thread.sleep(10);
        }
    }
}