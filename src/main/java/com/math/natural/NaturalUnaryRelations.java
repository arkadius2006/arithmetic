package com.math.natural;

import com.math.UnaryRelation;
import com.math.natural.internal.ZeroNaturalUnaryRelation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class NaturalUnaryRelations {

    private static final NaturalUnaryRelations INSTANCE = new NaturalUnaryRelations();

    private final UnaryRelation<Natural> zero;


    public static NaturalUnaryRelations getInstance() {
        return INSTANCE;
    }

    private NaturalUnaryRelations() {
        zero = new ZeroNaturalUnaryRelation();
    }

    public boolean isZero(Natural a) {
        return zero.test(a);
    }

}
