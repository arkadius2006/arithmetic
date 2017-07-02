package com.math.arithmetic.common;

import com.math.function.BinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class QuotientBinaryOperation<T> implements BinaryOperation<T> {

    private final DivisionAlgorithm<T> algorithm;

    public QuotientBinaryOperation(DivisionAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public T apply(T dividend, T divisor) {
        return algorithm.quotient(dividend, divisor);
    }
}
