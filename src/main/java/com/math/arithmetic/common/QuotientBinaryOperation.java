package com.math.arithmetic.common;

import com.math.arithmetic.DivisionFunction;
import com.math.arithmetic.common.DivisionAlgorithm;
import com.math.function.BinaryOperation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class QuotientBinaryOperation<T> implements BinaryOperation<T> {

    private final DivisionFunction<T> divisionFunction;

    public QuotientBinaryOperation(DivisionFunction<T> divisionFunction) {
        this.divisionFunction = divisionFunction;
    }

    @Override
    public T apply(T dividend, T divisor) {
        DivisionFunction.Result<T> result = divisionFunction.apply(dividend, divisor);
        return result.quotient;
    }
}
