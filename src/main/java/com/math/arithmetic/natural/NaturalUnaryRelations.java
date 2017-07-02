package com.math.arithmetic.natural;

import com.math.Relation;
import com.math.arithmetic.natural.internal.ZeroNaturalRelation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class NaturalUnaryRelations {

    private static final NaturalUnaryRelations INSTANCE = new NaturalUnaryRelations();

    private final Relation<Natural> zero;


    public static NaturalUnaryRelations getInstance() {
        return INSTANCE;
    }

    private NaturalUnaryRelations() {
        zero = new ZeroNaturalRelation();
    }

    public boolean isZero(Natural a) {
        return zero.test(a);
    }

}
