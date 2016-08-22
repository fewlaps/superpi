package com.fewlaps.superpi;

import java.security.InvalidParameterException;

public class ArgumentsMapper {

    public static final String T_THREADS = "-t";
    public static final String I_ITERATIONS = "-i";

    public static final int DEFAULT_THREADS = 32;
    public static final int DEFAULT_ITERATIONS = 1000000000;

    public Arguments map(String[] args) {
        int argsCount = args.length;

        if (argsCount != 0 && argsCount != 2 && argsCount != 4) {
            throwException();
        } else if (argsCount == 0) {
            return new Arguments(DEFAULT_THREADS, DEFAULT_ITERATIONS);
        } else {
            long threads = DEFAULT_THREADS;
            long iterations = DEFAULT_ITERATIONS;

            if (args[0].equals(T_THREADS)) {
                threads = readLong(args, 1);
            } else if (args[0].equals(I_ITERATIONS)) {
                iterations = readLong(args, 1);
            } else {
                throwException();
            }

            if (argsCount == 4) {
                if (args[2].equals(T_THREADS)) {
                    threads = readLong(args, 3);
                } else if (args[2].equals(I_ITERATIONS)) {
                    iterations = readLong(args, 3);
                }
            }

            return new Arguments(threads, iterations);
        }
        return null;
    }

    private void throwException() {
        throw new InvalidParameterException("Correct syntax: -t threads -i iterations");
    }

    private long readLong(String[] args, int position) {
        return Long.parseLong(args[position]);
    }
}