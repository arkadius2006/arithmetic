package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.natural.base.MultiplicationNaturalAlgorithm;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class LongMultiplicationByteNaturalAlgorithm implements MultiplicationNaturalAlgorithm {
    private final ByteNaturalArithmetic naturalArithmetic;

    public LongMultiplicationByteNaturalAlgorithm(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public ByteNatural multiply(Natural a, Natural b) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
