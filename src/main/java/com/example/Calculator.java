package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // This method is the "Trap". We will intentionally NOT test this initially.
    public int subtract(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
}
