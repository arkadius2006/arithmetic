package com.math.arithmetic.natural.internal.algorithm;

import com.math.arithmetic.natural.DivisionNaturalAlgorithm;
import com.math.arithmetic.natural.Natural;
import com.math.arithmetic.natural.internal.ByteNaturalArithmetic;

/**
 * Created by arkadiy on 02/07/17.
 */
public class NewtonRaphsonDivisonByteNaturalAlgorithm implements DivisionNaturalAlgorithm {
    private final ByteNaturalArithmetic naturalArithmetic;

    public NewtonRaphsonDivisonByteNaturalAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public Result divide(Natural dividend, Natural divisor) throws ArithmeticException {
        throw new UnsupportedOperationException("Not implmented");
    }
}
