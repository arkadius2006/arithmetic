package com.math.arithmetic.common;

import com.math.function.BinaryRelation;
import com.math.function.ComparisonFunction;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsGreaterThanBinaryRelation<T> implements BinaryRelation<T> {
    private final ComparisonFunction<T> compare;

    public IsGreaterThanBinaryRelation(ComparisonFunction<T> compare) {
        this.compare = compare;

    }

    @Override
    public boolean test(T a, T b) {
        ComparisonFunction.Result result = compare.apply(a, b);

        switch (result) {
            case IS_LESS_THAN:
                return false;
            case IS_EQUAL_TO:
                return false;
            case IS_GREATER_THAN:
                return true;
            default:
                throw new AssertionError();
        }

    }
}
