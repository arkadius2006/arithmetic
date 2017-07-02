package com.math.arithmetic.natural.internal;

import com.math.BinaryRelation;
import com.math.arithmetic.natural.internal.algorithm.DivisionByteNaturalAlgorithm;
import com.math.arithmetic.natural.internal.algorithm.DivisionByteNaturalAlgorithmResult;

/**
 * Created by arkadiy on 02/07/17.
 */
public class MultipleNaturalBinaryRelation implements BinaryRelation<ByteNatural>{
    private final DivisionByteNaturalAlgorithm algorithm;

    public MultipleNaturalBinaryRelation(DivisionByteNaturalAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean test(ByteNatural a, ByteNatural b) {
        DivisionByteNaturalAlgorithmResult result = algorithm.divide(a, b);
        ByteNatural remainder = result.getRemainder();
        return remainder.isZero();
    }
}
