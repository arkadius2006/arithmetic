package com.math.arithmetic.common;

import com.math.function.BinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class LeastCommonMultipleBinaryOperation<T> implements BinaryOperation<T> {
    private final DivisionAlgorithm<T> algorithm;

    public LeastCommonMultipleBinaryOperation(DivisionAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public T apply(T operand1, T operand2) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
