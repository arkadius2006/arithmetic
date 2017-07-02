package com.math.function;

/**
 * Created by arkadiy on 02/07/17.
 */
public class ReducedBySecondOperandBinaryRelation<T> implements Relation<T> {
    private final BinaryRelation<T> binaryRelation;
    private final T secondOperandValue;

    public ReducedBySecondOperandBinaryRelation(BinaryRelation<T> binaryRelation, T secondOperandValue) {
        this.binaryRelation = binaryRelation;
        this.secondOperandValue = secondOperandValue;
    }

    @Override
    public boolean test(T operand) {
        return binaryRelation.test(operand, secondOperandValue);
    }
}
