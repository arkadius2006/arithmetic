package com.math.arithmetic.natural.internal;

import com.math.BinaryOperation;
import com.math.arithmetic.natural.ByteNatural;
import com.math.arithmetic.natural.internal.algorithm.DivisionByteNaturalAlgorithm;
import com.math.arithmetic.natural.internal.algorithm.DivisionByteNaturalAlgorithmResult;

/**
 * Created by arkadiy on 02/07/17.
 */
public class RemainderByteNaturalBinaryOperation implements BinaryOperation<ByteNatural> {
    private final DivisionByteNaturalAlgorithm algorithm;

    public RemainderByteNaturalBinaryOperation(DivisionByteNaturalAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public ByteNatural apply(ByteNatural dividend, ByteNatural divisor) {
        DivisionByteNaturalAlgorithmResult result = algorithm.divide(dividend, divisor);
        return result.getRemainder();
    }
}
