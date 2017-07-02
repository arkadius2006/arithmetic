package com.math.arithmetic.natural.internal;

import com.math.ComparisonFunction;
import com.math.ComparisonResult;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class NaturalComparisonFunction implements ComparisonFunction<Natural> {

    @Override
    public ComparisonResult apply(Natural a, Natural b) {
        int n = a.getArrayLength();
        int m = b.getArrayLength();

        if (n < m) {
            return ComparisonResult.IS_LESS_THAN;
        } else if (n > m) {
            return ComparisonResult.IS_GREATER_THAN;
        }

        for (int i = n - 1; i >= 0; --i) {
            byte ai = a.getElement(i);
            byte bi = b.getElement(i);

            if (ai < bi) {
                return ComparisonResult.IS_LESS_THAN;
            } else if (ai > bi) {
                return ComparisonResult.IS_GREATER_THAN;
            }
        }

        return ComparisonResult.IS_EQUAL_TO;
    }
}
