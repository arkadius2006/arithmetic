package com.math.natural.internal;

import com.math.BinaryOperation;
import com.math.natural.internal.algorithm.DivisionAlgorithm;
import com.math.natural.internal.algorithm.DivisionAlgorithmResult;
import com.math.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class RemainderNaturalBinaryOperation implements BinaryOperation<Natural> {
    private final DivisionAlgorithm algorithm;

    public RemainderNaturalBinaryOperation(DivisionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Natural apply(Natural dividend, Natural divisor) {
        DivisionAlgorithmResult result = algorithm.divide(dividend, divisor);
        return result.getRemainder();
    }
}
