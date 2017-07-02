package com.math.arithmetic.natural.internal;

import com.math.BinaryOperation;
import com.math.arithmetic.natural.internal.algorithm.MultiplicationByteNaturalAlgorithm;


/**
 * Created by arkadiy on 02/07/17.
 */
public class MultiplicationByteNaturalBinaryOperation implements BinaryOperation<ByteNatural> {
    private final MultiplicationByteNaturalAlgorithm algorithm;

    public MultiplicationByteNaturalBinaryOperation(MultiplicationByteNaturalAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public ByteNatural apply(ByteNatural a, ByteNatural b) {
        return algorithm.multiply(a, b);
    }
}
