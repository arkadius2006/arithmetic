package com.math.arithmetic.natural.internal;

import com.math.Relation;
import com.math.arithmetic.natural.ByteNatural;


/**
 * Created by arkadiy on 02/07/17.
 */
public class ZeroByteNaturalRelation implements Relation<ByteNatural> {
    
    @Override
    public boolean test(ByteNatural byteNatural) {
        return byteNatural.isZero();
    }
}
