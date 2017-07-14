package com.tw;

public class BuzzMatcher implements Matcher {

    @Override
    public boolean isMatched(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getText() {
        return "Buzz";
    }

    @Override
    public int priority() {
        return 1;
    }
}