package com.math;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface ComparisonFunction<T> extends BinaryFunction<T, T, ComparisonFunction.Result> {

    public static enum Result {
        IS_LESS_THAN,
        IS_EQUAL_TO,
        IS_GREATER_THAN
    }
}
