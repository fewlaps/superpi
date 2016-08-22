package com.fewlaps.superpi;

import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static junit.framework.TestCase.assertEquals;

public class ArgumentsMapperTest {

    ArgumentsMapper mapper;

    @Before
    public void setUp() {
        mapper = new ArgumentsMapper();
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldLaunchInvalidParameterException_ifOnlyOneArgumentPassed() {
        String[] args = new String[]{"onearg"};
        mapper.map(args);
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldLaunchInvalidParameterException_ifOnlyThreeArgumentsPassed() {
        String[] args = new String[]{"one", "two", "three"};
        mapper.map(args);
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldLaunchInvalidParameterException_ifFiveArgsPassed() {
        String[] args = new String[]{"one", "two", "three", "four", "five"};
        mapper.map(args);
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldLaunchInvalidParameterException_ifTwoMoronArgsPassed() {
        String[] args = new String[]{"moron", "args"};
        mapper.map(args);
    }

    @Test
    public void shouldReturn32ThreadsAnd1000000000Iterations_ifNothingPassed() {
        String[] args = new String[]{};
        Arguments result = mapper.map(args);
        assertEquals(32, result.getThreads());
        assertEquals(1000000000, result.getIterations());
    }

    @Test
    public void shouldReturn32ThreadsAnd1000000000Iterations_ifThreadsHasBeenPassed() {
        String[] args = new String[]{"-t", "32"};
        Arguments result = mapper.map(args);
        assertEquals(32, result.getThreads());
        assertEquals(1000000000, result.getIterations());
    }

    @Test
    public void shouldReturn32ThreadsAnd1000000000Iterations_ifIterationsHasBeenPassed() {
        String[] args = new String[]{"-i", "1000000000"};
        Arguments result = mapper.map(args);
        assertEquals(32, result.getThreads());
        assertEquals(1000000000, result.getIterations());
    }

    @Test
    public void shouldReturn32ThreadsAnd1000000000Iterations_ifAllHasBeenPassed() {
        String[] args = new String[]{"-t", "32", "-i", "1000000000"};
        Arguments result = mapper.map(args);
        assertEquals(32, result.getThreads());
        assertEquals(1000000000, result.getIterations());
    }

    @Test
    public void shouldReturn4ThreadsAnd6Iterations_ifAllHasBeenPassed() {
        String[] args = new String[]{"-t", "4", "-i", "6"};
        Arguments result = mapper.map(args);
        assertEquals(4, result.getThreads());
        assertEquals(6, result.getIterations());
    }

    @Test
    public void shouldReturn4ThreadsAnd1000000000Iterations_if4ThreadsHasBeenPassed() {
        String[] args = new String[]{"-t", "4"};
        Arguments result = mapper.map(args);
        assertEquals(4, result.getThreads());
        assertEquals(1000000000, result.getIterations());
    }

    @Test
    public void shouldReturn32ThreadsAnd6Iterations_if6IterationsHasBeenPassed() {
        String[] args = new String[]{"-i", "6"};
        Arguments result = mapper.map(args);
        assertEquals(32, result.getThreads());
        assertEquals(6, result.getIterations());
    }
}