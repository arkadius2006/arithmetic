package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.common.MultiplicationAlgorithm;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
class LongMultiplicationByteAlgorithm implements MultiplicationAlgorithm<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;

    public LongMultiplicationByteAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public ByteNatural multiply(Natural a, Natural b) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
