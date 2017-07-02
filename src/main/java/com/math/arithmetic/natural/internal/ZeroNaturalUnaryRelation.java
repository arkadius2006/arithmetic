package com.math.arithmetic.natural.internal;

import com.math.UnaryRelation;
import com.math.arithmetic.natural.Natural;


/**
 * Created by arkadiy on 02/07/17.
 */
public class ZeroNaturalUnaryRelation implements UnaryRelation<Natural> {
    
    @Override
    public boolean test(Natural natural) {
        return natural.isZero();
    }
}
