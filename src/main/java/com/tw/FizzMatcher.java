package com.tw;

public class FizzMatcher implements Matcher {
    public FizzMatcher() {
    }

    @Override
    public boolean isMatched(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getText() {
        return "Fizz";
    }

    @Override
    public int priority() {
        return 1;
    }
}