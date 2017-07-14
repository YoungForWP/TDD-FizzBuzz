package com.tw;

public class Matcher implements Comparable {
    private final int priority;
    private final String text;
    private final int modulus;

    private Matcher(int modulus, String text, int priority) {
        this.priority = priority;
        this.text = text;
        this.modulus = modulus;
    }

    static Matcher fizz() {
        return new Matcher(3, "Fizz", 0);
    }

    static Matcher buzz() {
        return new Matcher(5, "Buzz", 1);
    }

    static Matcher whizz() {
        return new Matcher(7, "Whizz", 2);
    }

    boolean isMatched(int number) {
        return number % modulus == 0;
    }

    String getText() {
        return text;
    }

    private int priority() {
        return priority;
    }

    @Override
    public int compareTo(Object o) {
        Matcher other = (Matcher) o;
        return Integer.compare(priority(), other.priority());
    }
}
