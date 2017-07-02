package com.math.arithmetic.natural.base;

import com.math.function.BinaryRelation;
import com.math.function.Relation;
import com.math.arithmetic.natural.Natural;


/**
 * Created by arkadiy on 02/07/17.
 */
public class IsZeroNaturalRelation implements Relation<Natural> {

    private final BinaryRelation<Natural> isEqualToRelation;
    private final Natural zero;

    public IsZeroNaturalRelation(BinaryRelation<Natural> isEqualToRelation, Natural zero) {
        this.isEqualToRelation = isEqualToRelation;
        this.zero = zero;
    }

    @Override
    public boolean test(Natural value) {
        return isEqualToRelation.test(value, zero);
    }
}
