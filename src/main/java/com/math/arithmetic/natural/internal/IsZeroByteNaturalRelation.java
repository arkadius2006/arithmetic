package com.math.arithmetic.natural.internal;

import com.math.Relation;
import com.math.arithmetic.natural.Natural;


/**
 * Created by arkadiy on 02/07/17.
 */
public class IsZeroByteNaturalRelation implements Relation<Natural> {

    private final ByteNaturalArithmetic naturalArithmetic;

    public IsZeroByteNaturalRelation(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public boolean test(Natural value) {
        ByteNatural a = naturalArithmetic.cast(value);

        return a.isZero();
    }
}
