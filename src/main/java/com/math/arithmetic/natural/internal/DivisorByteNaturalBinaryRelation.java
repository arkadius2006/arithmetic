package com.math.arithmetic.natural.internal;

import com.math.BinaryRelation;
import com.math.arithmetic.natural.ByteNatural;
import com.math.arithmetic.natural.internal.algorithm.DivisionByteNaturalAlgorithm;
import com.math.arithmetic.natural.internal.algorithm.DivisionByteNaturalAlgorithmResult;

/**
 * Created by arkadiy on 02/07/17.
 */
public class DivisorByteNaturalBinaryRelation implements BinaryRelation<ByteNatural> {
    private final DivisionByteNaturalAlgorithm algorithm;

    public DivisorByteNaturalBinaryRelation(DivisionByteNaturalAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean test(ByteNatural a, ByteNatural b) {
        DivisionByteNaturalAlgorithmResult result = algorithm.divide(b, a);
        ByteNatural remainder = result.getRemainder();
        return remainder.isZero();
    }
}
