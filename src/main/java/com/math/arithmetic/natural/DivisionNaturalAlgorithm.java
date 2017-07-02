package com.math.arithmetic.natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface DivisionNaturalAlgorithm {

    Result divide(Natural dividend, Natural divisor) throws ArithmeticException;

    public static class Result {
        public Natural quotient;
        public Natural remainder;
    }
}
