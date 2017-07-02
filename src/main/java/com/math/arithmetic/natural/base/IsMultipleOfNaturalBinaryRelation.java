package com.math.arithmetic.natural.base;

import com.math.function.BinaryOperation;
import com.math.function.BinaryRelation;
import com.math.function.Relation;
import com.math.arithmetic.natural.Natural;

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
