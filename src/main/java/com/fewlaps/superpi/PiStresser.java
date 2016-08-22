package com.fewlaps.superpi;

import java.util.ArrayList;
import java.util.List;

public class PiStresser {

    private final long requestedThreads;
    private final long requestesIterations;

    public PiStresser(long requestedThreads, long requestesIterations) {
        this.requestedThreads = requestedThreads;
        this.requestesIterations = requestesIterations;
    }

    public void start() throws InterruptedException {
        List<PiThread> threads = new ArrayList<PiThread>();
        for (int i = 0; i < requestedThreads; i++) {
            threads.add(new PiThread(requestesIterations));
        }

        for (PiThread thread : threads) {
            thread.start();
        }

        while (!allThreadsEnded(threads)) {
            Thread.sleep(10);
        }
    }

    private boolean allThreadsEnded(List<PiThread> threads) {
        for (PiThread thread : threads) {
            if (!thread.hasEnded()) {
                return false;
            }
        }
        return true;
    }
}
