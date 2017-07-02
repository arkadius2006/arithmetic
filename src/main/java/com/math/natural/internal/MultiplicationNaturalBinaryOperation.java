package com.math.natural.internal;

import com.math.BinaryOperation;
import com.math.natural.internal.algorithm.MultiplicationAlgorithm;
import com.math.natural.Natural;


/**
 * Created by arkadiy on 02/07/17.
 */
public class MultiplicationNaturalBinaryOperation implements BinaryOperation<Natural> {
    private final MultiplicationAlgorithm algorithm;

    public MultiplicationNaturalBinaryOperation(MultiplicationAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Natural apply(Natural a, Natural b) {
        return algorithm.multiply(a, b);
    }
}
