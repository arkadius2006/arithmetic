package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.common.SubstractionAlgorithm;
import com.math.arithmetic.natural.Natural;
import com.math.function.ComparisonFunction;

/**
 * Created by arkadiy on 02/07/17.
 */
class ByteNaturalSubstractionAlgorithm implements SubstractionAlgorithm<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;
    private final ComparisonFunction<Natural> comparisonFunction;

    public ByteNaturalSubstractionAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
        this.comparisonFunction = naturalArithmetic.comparison();
    }

    @Override
    public Natural difference(Natural minuend, Natural substrahend) { // todo optimize: we do not need pre-compare
        ByteNatural a = naturalArithmetic.cast(minuend);
        ByteNatural b = naturalArithmetic.cast(substrahend);

        ComparisonFunction.Result result = comparisonFunction.apply(a, b);

        switch (result) {
            case IS_LESS_THAN:
                throw new ArithmeticException("Cannot substract: minuend value is less than substrahend");
        }

        throw new UnsupportedOperationException("Not implemented yet"); // todo implement substraction
    }
}
