package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.natural.base.DivisionNaturalAlgorithm;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
class NewtonRaphsonDivisonByteNaturalAlgorithm implements DivisionNaturalAlgorithm {
    private final ByteNaturalArithmetic naturalArithmetic;

    public NewtonRaphsonDivisonByteNaturalAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public Result divide(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }
}
