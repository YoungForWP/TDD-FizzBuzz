package com.tw.test;

import com.tw.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_when_number_is_1() throws Exception {
        assertEquals("1", fizzBuzz.count(1));
    }

    @Test
    public void test_when_number_is_2() throws Exception {
        assertEquals("2", fizzBuzz.count(2));
    }

    @Test
    public void test_when_number_is_3() throws Exception {
        assertEquals("Fizz", fizzBuzz.count(3));
    }

    @Test
    public void test_when_number_is_5() throws Exception {
        assertEquals("Buzz", fizzBuzz.count(5));
    }

    @Test
    public void test_when_number_is_15() throws Exception {
        assertEquals("FizzBuzz", fizzBuzz.count(15));
    }
}
