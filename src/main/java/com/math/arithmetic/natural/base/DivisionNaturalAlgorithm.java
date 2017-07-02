package com.math.arithmetic.natural.base;

import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface DivisionNaturalAlgorithm {

    public Result divide(Natural dividend, Natural divisor) throws ArithmeticException;

    public static class Result {
        public Natural quotient;
        public Natural remainder;
    }
}
