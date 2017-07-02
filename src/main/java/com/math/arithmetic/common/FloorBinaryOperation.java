package com.math.arithmetic.common;

import com.math.function.BinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class FloorBinaryOperation<T> implements BinaryOperation<T> {
    private final DivisionAlgorithm<T> algorithm;

    public FloorBinaryOperation(DivisionAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public T apply(T dividend, T divisor) {
        return algorithm.floor(dividend, divisor);
    }
}
