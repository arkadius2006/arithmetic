package com.math.arithmetic.natural.base;

import com.math.BinaryOperation;
import com.math.BinaryRelation;
import com.math.Relation;
import com.math.arithmetic.natural.DivisionNaturalAlgorithm;
import com.math.arithmetic.natural.DivisionNaturalAlgorithmResult;
import com.math.arithmetic.natural.Natural;
import com.math.arithmetic.natural.internal.ByteNatural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsMultipleOfNaturalBinaryRelation implements BinaryRelation<Natural> {
    private final BinaryOperation<Natural> remainderOperation;
    private final Relation<Natural> isZeroRelation;

    public IsMultipleOfNaturalBinaryRelation(BinaryOperation<Natural> remainderOperation, Relation<Natural> isZeroRelation) {
        this.remainderOperation = remainderOperation;
        this.isZeroRelation = isZeroRelation;
    }

    @Override
    public boolean test(Natural a, Natural b) {
        Natural remainder = remainderOperation.apply(a, b);
        return isZeroRelation.test(remainder);
    }
}
