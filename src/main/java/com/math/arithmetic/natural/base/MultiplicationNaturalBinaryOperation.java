package com.math.arithmetic.natural.base;

import com.math.BinaryOperation;
import com.math.arithmetic.natural.Natural;
import com.math.arithmetic.natural.MultiplicationNaturalAlgorithm;


/**
 * Created by arkadiy on 02/07/17.
 */
public class MultiplicationNaturalBinaryOperation implements BinaryOperation<Natural> {
    private final MultiplicationNaturalAlgorithm algorithm;

    public MultiplicationNaturalBinaryOperation(MultiplicationNaturalAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Natural apply(Natural a, Natural b) {
        return algorithm.multiply(a, b);
    }
}
