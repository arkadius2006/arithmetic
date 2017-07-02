package com.math.arithmetic.common;

import com.math.arithmetic.natural.Natural;
import com.math.function.BinaryRelation;
import com.math.function.ComparisonFunction;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsEqualToBinaryRelation<T> implements BinaryRelation<T> {
    private final ComparisonFunction<T> compare;

    public IsEqualToBinaryRelation(ComparisonFunction<T> compare) {
        this.compare = compare;

    }

    @Override
    public boolean test(T a, T b) {
        ComparisonFunction.Result result = compare.apply(a, b);

        switch (result) {
            case IS_LESS_THAN:
                return false;
            case IS_EQUAL_TO:
                return true;
            case IS_GREATER_THAN:
                return false;
            default:
                throw new AssertionError();
        }
    }
}
