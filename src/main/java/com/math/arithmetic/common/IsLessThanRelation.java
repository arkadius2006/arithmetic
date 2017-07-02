package com.math.arithmetic.common;

import com.math.function.BinaryRelation;
import com.math.function.Relation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsLessThanRelation<T> implements Relation<T> {
    private final BinaryRelation<T> binaryRelation;
    private final T value;

    public IsLessThanRelation(BinaryRelation<T> binaryRelation, T value) {
        this.binaryRelation = binaryRelation;
        this.value = value;
    }

    @Override
    public boolean test(T operand) {
        return binaryRelation.test(operand, value);
    }
}
