package com.math.function;

/**
 * Created by arkadiy on 02/07/17.
 */
public class ReducedByFirstOperandBinaryRelation<T> implements Relation<T> {
    private final BinaryRelation<T> binaryRelation;
    private final T firstOperandValue;

    public ReducedByFirstOperandBinaryRelation(BinaryRelation<T> binaryRelation, T firstOperandValue) {
        this.binaryRelation = binaryRelation;
        this.firstOperandValue = firstOperandValue;
    }

    @Override
    public boolean test(T operand) {
        return binaryRelation.test(firstOperandValue, operand);
    }
}
