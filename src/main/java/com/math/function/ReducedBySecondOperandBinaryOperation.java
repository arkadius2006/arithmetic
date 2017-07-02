package com.math.function;

/**
 * Created by arkadiy on 02/07/17.
 */
public class ReducedBySecondOperandBinaryOperation<T> implements Operation<T> {
    private final BinaryOperation<T> binaryOperation;
    private final T secondOperandValue;

    public ReducedBySecondOperandBinaryOperation(BinaryOperation<T> binaryOperation, T secondOperandValue) {
        this.binaryOperation = binaryOperation;
        this.secondOperandValue = secondOperandValue;
    }

    @Override
    public T apply(T operand) {
        return binaryOperation.apply(operand, secondOperandValue);
    }
}
