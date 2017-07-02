package com.math.arithmetic.natural.internal;

import com.math.BinaryRelation;
import com.math.arithmetic.natural.internal.algorithm.DivisionAlgorithm;
import com.math.arithmetic.natural.internal.algorithm.DivisionAlgorithmResult;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class MultipleNaturalBinaryRelation implements BinaryRelation<Natural>{
    private final DivisionAlgorithm algorithm;

    public MultipleNaturalBinaryRelation(DivisionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean test(Natural a, Natural b) {
        DivisionAlgorithmResult result = algorithm.divide(a, b);
        Natural remainder = result.getRemainder();
        return remainder.isZero();
    }
}
