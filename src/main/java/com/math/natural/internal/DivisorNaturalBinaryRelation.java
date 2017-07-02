package com.math.natural.internal;

import com.math.BinaryRelation;
import com.math.natural.internal.algorithm.DivisionAlgorithm;
import com.math.natural.internal.algorithm.DivisionAlgorithmResult;
import com.math.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class DivisorNaturalBinaryRelation implements BinaryRelation<Natural> {
    private final DivisionAlgorithm algorithm;

    public DivisorNaturalBinaryRelation(DivisionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean test(Natural a, Natural b) {
        DivisionAlgorithmResult result = algorithm.divide(b, a);
        Natural remainder = result.getRemainder();
        return remainder.isZero();
    }
}