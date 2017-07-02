package com.math.arithmetic.common;

import com.math.arithmetic.DivisionFunction;
import com.math.arithmetic.common.DivisionAlgorithm;
import com.math.function.BinaryOperation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class RemainderBinaryOperation<T> implements BinaryOperation<T> {
    private final DivisionFunction<T> divisionFunction;

    public RemainderBinaryOperation(DivisionFunction<T> divisionFunction) {
        this.divisionFunction = divisionFunction;
    }

    @Override
    public T apply(T a, T b) {
        DivisionFunction.Result<T> result = divisionFunction.apply(a, b);
        return result.remainder;
    }
}