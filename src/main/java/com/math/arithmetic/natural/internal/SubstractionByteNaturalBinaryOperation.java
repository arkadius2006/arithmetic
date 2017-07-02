package com.math.arithmetic.natural.internal;

import com.math.BinaryOperation;
import com.math.ComparisonFunction;
import com.math.ComparisonResult;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class SubstractionByteNaturalBinaryOperation implements BinaryOperation<Natural> {
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

        ComparisonResult comparisonResult = comparisonFunction.apply(a, b);

        switch (comparisonResult) {
            case IS_LESS_THAN:
                throw new ArithmeticException("Cannot substract: first value is less than second");
        }

        throw new UnsupportedOperationException("Not implemented yet"); // todo implement substraction
    }
}
