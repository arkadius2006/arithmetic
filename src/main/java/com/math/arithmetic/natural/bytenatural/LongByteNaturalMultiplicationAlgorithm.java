package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.common.MultiplicationAlgorithm;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
class LongByteNaturalMultiplicationAlgorithm implements MultiplicationAlgorithm<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;

    public LongByteNaturalMultiplicationAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public ByteNatural multiply(Natural multiplicand, Natural multiplier) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
