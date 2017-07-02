package com.math.arithmetic.common;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface DivisionAlgorithm<T> {

    T quotient(T dividend, T divisor) throws ArithmeticException;

    T remainder(T dividend, T divisor) throws ArithmeticException;

    T floor(T dividend, T divisor) throws ArithmeticException;

    T ceil(T dividend, T divisor) throws ArithmeticException;

    Result<T> divide(T dividend, T divisor) throws ArithmeticException;

    public static class Result<R> {
        public R quotient;
        public R remainder;
    }
}
