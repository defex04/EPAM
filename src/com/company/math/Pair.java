package com.company.math;

class Pair<A,B> {

    private final A a;
    private final B b;

    Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    A getA() {
        return a;
    }

    B getB() {
        return b;
    }
}
