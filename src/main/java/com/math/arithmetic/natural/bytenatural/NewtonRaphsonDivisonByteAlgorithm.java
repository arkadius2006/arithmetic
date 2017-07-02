package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.common.DivisionAlgorithm;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
class NewtonRaphsonDivisonByteAlgorithm implements DivisionAlgorithm<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;

    public NewtonRaphsonDivisonByteAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public Result divide(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }
}
