package com.math.arithmetic.common;

import com.math.function.BinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class AdditionBinaryOperation<T> implements BinaryOperation<T> {
    private final AdditionAlgorithm<T> algorithm;

    public AdditionBinaryOperation(AdditionAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public T apply(T operand1, T operand2) {
        return algorithm.sum(operand1, operand2);
    }
}
