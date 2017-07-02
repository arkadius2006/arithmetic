package com.math.arithmetic.common;

/**
 * Created by arkadiy on 02/07/17.
 */
public class BaseDivisionFunction<T> implements DivisionFunction<T> {
    private final DivisionAlgorithm<T> algorithm;

    public BaseDivisionFunction(DivisionAlgorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Result<T> apply(T dividend, T divisor) {
        DivisionAlgorithm.Result<T> result = algorithm.divide(dividend, divisor);
        return toDivisionFunctionResult(result);
    }

    private Result<T> toDivisionFunctionResult(DivisionAlgorithm.Result<T> dar) {
        Result<T> dfr = new Result<T>();
        dfr.quotient = dar.quotient;
        dfr.remainder = dar.remainder;
        return dfr;
    }
}
