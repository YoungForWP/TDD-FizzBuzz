package com.tw;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

public class FizzBuzz {
    private List<Matcher> matchers = Arrays.asList(Matcher.buzz(), Matcher.fizz(), Matcher.whizz());

    public FizzBuzz() {
        //noinspection unchecked
        sort(matchers);
    }

    public String count(int number) {
        StringBuilder result = new StringBuilder();
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                result.append(matcher.getText());
            }
        }
        return (result.length() == 0) ? String.valueOf(number) : result.toString();
    }

}