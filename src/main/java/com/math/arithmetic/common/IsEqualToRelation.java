package com.math.arithmetic.common;

import com.math.function.BinaryRelation;
import com.math.function.Relation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsEqualToRelation<T> implements Relation<T> { // todo instead of 3 classes create one "project" class
    private final BinaryRelation<T> binaryRelation;
    private final T value;

    public IsEqualToRelation(BinaryRelation<T> binaryRelation, T value) {
        this.binaryRelation = binaryRelation;
        this.value = value;
    }

    @Override
    public boolean test(T operand) {
        return binaryRelation.test(operand, value);
    }
}
