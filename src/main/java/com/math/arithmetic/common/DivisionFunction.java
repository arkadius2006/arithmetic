package com.math.arithmetic.common;

import com.math.function.BinaryFunction;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface DivisionFunction<T> extends BinaryFunction<T, T, DivisionFunction.Result<T>> {

    public static class Result<R> {
        public R quotient;
        public R remainder;
    }
}
