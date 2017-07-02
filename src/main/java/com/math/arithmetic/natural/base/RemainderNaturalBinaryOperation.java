package com.math.arithmetic.natural.base;

import com.math.function.BinaryOperation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class RemainderNaturalBinaryOperation implements BinaryOperation<Natural> {
    private final DivisionNaturalAlgorithm algorithm;

    public RemainderNaturalBinaryOperation(DivisionNaturalAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Natural apply(Natural a, Natural b) {
        DivisionNaturalAlgorithm.Result result = algorithm.divide(a, b);
        return result.remainder;
    }
}
