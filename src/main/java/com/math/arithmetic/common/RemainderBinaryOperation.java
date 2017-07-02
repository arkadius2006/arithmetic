package com.math.arithmetic.common;

import com.math.function.BinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class RemainderBinaryOperation<T> implements BinaryOperation<T> {
    private final DivisionAlgorithm<T> algorithm;

    public RemainderBinaryOperation(DivisionAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public T apply(T dividend, T divisor) {
        return algorithm.remainder(dividend, divisor);
    }
}
