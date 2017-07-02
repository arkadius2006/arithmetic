package com.math.arithmetic.natural.base;

import com.math.function.BinaryOperation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class QuotientNaturalBinaryOperation implements BinaryOperation<Natural> {

    private final DivisionNaturalAlgorithm algorithm;

    public QuotientNaturalBinaryOperation(DivisionNaturalAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Natural apply(Natural dividend, Natural divisor) {
        DivisionNaturalAlgorithm.Result result = algorithm.divide(dividend, divisor);
        return result.quotient;
    }
}
