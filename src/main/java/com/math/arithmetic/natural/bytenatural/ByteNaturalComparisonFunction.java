package com.math.arithmetic.natural.bytenatural;

import com.math.function.ComparisonFunction;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
class ByteNaturalComparisonFunction implements ComparisonFunction<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;

    public ByteNaturalComparisonFunction(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public Result apply(Natural first, Natural second) {
        ByteNatural a = naturalArithmetic.cast(first);
        ByteNatural b = naturalArithmetic.cast(second);

        int n = a.getArrayLength();
        int m = b.getArrayLength();

        if (n < m) {
            return Result.IS_LESS_THAN;
        } else if (n > m) {
            return Result.IS_GREATER_THAN;
        }

        for (int i = n - 1; i >= 0; --i) {
            byte ai = a.getElement(i);
            byte bi = b.getElement(i);

            if (ai < bi) {
                return Result.IS_LESS_THAN;
            } else if (ai > bi) {
                return Result.IS_GREATER_THAN;
            }
        }

        return Result.IS_EQUAL_TO;
    }
}
