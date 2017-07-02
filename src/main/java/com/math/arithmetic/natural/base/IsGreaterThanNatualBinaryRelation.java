package com.math.arithmetic.natural.base;

import com.math.BinaryRelation;
import com.math.ComparisonFunction;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsGreaterThanNatualBinaryRelation implements BinaryRelation<Natural> {
    private final ComparisonFunction<Natural> compare;

    public IsGreaterThanNatualBinaryRelation(ComparisonFunction<Natural> compare) {
        this.compare = compare;

    }

    @Override
    public boolean test(Natural a, Natural b) {
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

