package com.math.arithmetic.common;

import com.math.function.BinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class MultiplicationBinaryOperation<T> implements BinaryOperation<T> {
    private final MultiplicationAlgorithm<T> algorithm;

    public MultiplicationBinaryOperation(MultiplicationAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public T apply(T a, T b) {
        return algorithm.multiply(a, b);
    }
}
