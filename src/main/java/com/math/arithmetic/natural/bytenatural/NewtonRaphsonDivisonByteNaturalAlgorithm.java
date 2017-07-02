package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.common.DivisionAlgorithm;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
class NewtonRaphsonDivisonByteNaturalAlgorithm implements DivisionAlgorithm<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;

    public NewtonRaphsonDivisonByteNaturalAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public Natural quotient(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }

    @Override
    public Natural remainder(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }

    @Override
    public Natural floor(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }

    @Override
    public Natural ceil(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }

    @Override
    public Result divide(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }
}
