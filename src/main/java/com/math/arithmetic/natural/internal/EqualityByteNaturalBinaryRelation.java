package com.math.arithmetic.natural.internal;

import com.math.BinaryRelation;
import com.math.ComparisonFunction;
import com.math.ComparisonResult;

/**
 * Created by arkadiy on 02/07/17.
 */
public class EqualityByteNaturalBinaryRelation implements BinaryRelation<ByteNatural> {

    private final ComparisonFunction<ByteNatural> compare = new ByteNaturalComparisonFunction();

    @Override
    public boolean test(ByteNatural a, ByteNatural b) {
        ComparisonResult result = compare.apply(a, b);

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
