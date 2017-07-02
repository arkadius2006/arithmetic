package com.math.function;

/**
 * Created by arkadiy on 02/07/17.
 */
public class ReducedByFirstOperandBinaryOperation<T> implements Operation<T> {
    private final BinaryOperation<T> binaryOperation;
    private final T firstOperandValue;

    public ReducedByFirstOperandBinaryOperation(BinaryOperation<T> binaryOperation, T firstOperandValue) {
        this.binaryOperation = binaryOperation;
        this.firstOperandValue = firstOperandValue;
    }

    @Override
    public T apply(T operand) {
        return binaryOperation.apply(firstOperandValue, operand);
    }
}
