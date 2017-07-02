package com.math.arithmetic;

/**
 * Created by arkadiy on 02/07/17.
 */
public final class Duple<T> {
    private final T first;
    private final T second;

    public Duple(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
