package com.tw;

public interface Matcher extends Comparable {
    boolean isMatched(int number);

    String getText();

    int priority();

    @Override
    default int compareTo(Object o) {
        Matcher other = (Matcher) o;
        return Integer.compare(other.priority(), priority());
    }
}
