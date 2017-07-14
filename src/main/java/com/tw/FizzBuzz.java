package com.tw;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

public class FizzBuzz {
    private List<Matcher> matchers = Arrays.asList(Matcher.buzz(), Matcher.fizz(), Matcher.whizz());
    private final List<DigitMatcher> digitMatchers = Arrays.asList(DigitMatcher.fizz(), DigitMatcher.buzz(), DigitMatcher.whizz());

    public FizzBuzz() {
        //noinspection unchecked
        sort(matchers);
    }

    public String count(int number) {
        String digitMatchResult = getDigitMatchersResult(number);
        if (!digitMatchResult.isEmpty()) return digitMatchResult;

        String matcherResult = getModMatchersResult(number);
        return (matcherResult.isEmpty()) ? String.valueOf(number) : matcherResult;
    }

    private String getModMatchersResult(int number) {
        StringBuilder result = new StringBuilder();
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                result.append(matcher.getText());
            }
        }
        return result.toString();
    }

    private String getDigitMatchersResult(int number) {
        String[] digits = String.valueOf(number).split("");
        for (String digit : digits) {
            for (DigitMatcher digitMatcher : digitMatchers) {
                if (digitMatcher.isMatched(digit)) {
                    return digitMatcher.getText();
                }
            }
        }
        return "";
    }

}