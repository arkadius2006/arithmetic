package com.math.arithmetic.common;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface DivisionAlgorithm<T> {

    public Result<T> divide(T dividend, T divisor) throws ArithmeticException;

    public static class Result<R> {
        public R quotient;
        public R remainder;
    }
}
