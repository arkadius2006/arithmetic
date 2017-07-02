package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.natural.Natural;
import com.math.function.BinaryOperation;
import com.math.function.ComparisonFunction;

/**
 * Created by arkadiy on 02/07/17.
 */
class SubstractionByteNaturalBinaryOperation implements BinaryOperation<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;
    private final ComparisonFunction<Natural> comparisonFunction;

    public SubstractionByteNaturalBinaryOperation(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
        this.comparisonFunction = naturalArithmetic.comparison();
    }

    @Override
    public Natural apply(Natural first, Natural second) { // todo optimize: we do not need pre-compare
        ByteNatural a = naturalArithmetic.cast(first);
        ByteNatural b = naturalArithmetic.cast(second);

        ComparisonFunction.Result result = comparisonFunction.apply(a, b);

        switch (result) {
            case IS_LESS_THAN:
                throw new ArithmeticException("Cannot substract: first value is less than second");
        }

        throw new UnsupportedOperationException("Not implemented yet"); // todo implement substraction
    }
}
