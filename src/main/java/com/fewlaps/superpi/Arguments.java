package com.fewlaps.superpi;

public class Arguments {

    private final long threads;
    private final long iterations;

    public Arguments(long threads, long iterations) {
        this.threads = threads;
        this.iterations = iterations;
    }

    public long getThreads() {
        return threads;
    }

    public long getIterations() {
        return iterations;
    }
}
