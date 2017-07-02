package com.math.arithmetic.common;

import com.math.function.BinaryOperation;
import com.math.function.BinaryRelation;
import com.math.function.Relation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsMultipleOfBinaryRelation<T> implements BinaryRelation<T> {
    private final BinaryOperation<T> remainderOperation;
    private final Relation<T> isZeroRelation;

    public IsMultipleOfBinaryRelation(BinaryOperation<T> remainderOperation, Relation<T> isZeroRelation) {
        this.remainderOperation = remainderOperation;
        this.isZeroRelation = isZeroRelation;
    }

    @Override
    public boolean test(T a, T b) {
        T remainder = remainderOperation.apply(a, b);
        return isZeroRelation.test(remainder);
    }
}
