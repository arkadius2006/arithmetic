package com.math.arithmetic.natural.internal;

import com.math.Relation;
import com.math.arithmetic.natural.Natural;


/**
 * Created by arkadiy on 02/07/17.
 */
public class ZeroNaturalRelation implements Relation<Natural> {
    
    @Override
    public boolean test(Natural natural) {
        return natural.isZero();
    }
}
