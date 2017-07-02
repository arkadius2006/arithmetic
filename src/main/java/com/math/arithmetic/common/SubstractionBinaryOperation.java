package com.math.arithmetic.common;

import com.math.function.BinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class SubstractionBinaryOperation<T> implements BinaryOperation<T> {
    private final SubstractionAlgorithm<T> algorithm;

    public SubstractionBinaryOperation(SubstractionAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public T apply(T operand1, T operand2) {
        return algorithm.difference(operand1, operand2);
    }
}
