package com.math.arithmetic.natural.base;

import com.math.function.BinaryOperation;
import com.math.function.BinaryRelation;
import com.math.function.Relation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IsDivisorOfNaturalBinaryRelation implements BinaryRelation<Natural> {
    private final BinaryOperation<Natural> remainderOperation;
    private final Relation<Natural> isZeroRelation;

    public IsDivisorOfNaturalBinaryRelation(BinaryOperation<Natural> remainderOperation, Relation<Natural> isZeroRelation) {
        this.remainderOperation = remainderOperation;
        this.isZeroRelation = isZeroRelation;
    }

    @Override
    public boolean test(Natural a, Natural b) {
        Natural remainder = remainderOperation.apply(b, a);
        return isZeroRelation.test(remainder);
    }
}
