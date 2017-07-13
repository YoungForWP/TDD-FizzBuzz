package com.tw;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzMatcher implements Matcher {

    private final List<Matcher> matchers;

    FizzBuzzMatcher(Matcher... matchers) {
        this.matchers = Arrays.asList(matchers);
    }

    @Override
    public boolean isMatched(int number) {
        if (this.matchers.isEmpty()) {
            return false;
        }
        for (Matcher matcher : this.matchers) {
            if (!matcher.isMatched(number)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Matcher matcher : this.matchers) {
            stringBuilder.append(matcher.getText());
        }
        return stringBuilder.toString();
    }

    @Override
    public int priority() {
        int result = 0;
        for (Matcher matcher : this.matchers) {
            result += matcher.priority();
        }
        return result;
    }
}