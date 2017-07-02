package com.math.arithmetic.natural;

import com.math.BinaryRelation;
import com.math.arithmetic.natural.internal.algorithm.DivisionAlgorithm;
import com.math.arithmetic.natural.internal.algorithm.NewtonRaphsonDivisonAlgorithm;
import com.math.arithmetic.natural.internal.*;

/**
 * Created by arkadiy on 02/07/17.
 */
public class NaturalBinaryRelations {
    private final static NaturalBinaryRelations INSTANCE = new NaturalBinaryRelations();

    private final BinaryRelation<Natural> equality;
    private final BinaryRelation<Natural> less;
    private final BinaryRelation<Natural> greater;
    private final BinaryRelation<Natural> divisor;
    private final BinaryRelation<Natural> multiple;

    public static NaturalBinaryRelations getInstance() {
        return INSTANCE;
    }

    private NaturalBinaryRelations() {
        equality = new EqualityNaturalBinaryRelation();
        less = new LessNaturalBinaryRelation();
        greater = new GreaterNatualBinaryRelation();

        DivisionAlgorithm divisionAlgorithm = new NewtonRaphsonDivisonAlgorithm();
        divisor = new DivisorNaturalBinaryRelation(divisionAlgorithm);
        multiple = new MultipleNaturalBinaryRelation(divisionAlgorithm);
    }

    public boolean isEqualTo(Natural a, Natural b) {
        return equality.test(a, b);
    }

    public boolean isLessThan(Natural a, Natural b) {
        return less.test(a, b);
    }

    public boolean isGreaterThan(Natural a, Natural b) {
        return greater.test(a, b);
    }

    public boolean isDivisorOf(Natural a, Natural b) {
        return divisor.test(a, b);
    }

    public boolean isMultipleOf(Natural a, Natural b) {
        return multiple.test(a, b);
    }
}
