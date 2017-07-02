package com.math.arithmetic.natural;

import com.math.BinaryRelation;
import com.math.Relation;

import java.util.function.BinaryOperator;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface NaturalArithmetic {

    Relation<Natural> isZero();

    BinaryRelation<Natural> isLessThan();

    BinaryRelation<Natural> isEqualTo();

    BinaryRelation<Natural> isGreaterThan();

    BinaryRelation<Natural> isDivisorOf();

    BinaryRelation<Natural> isMultipleOf();

    BinaryOperator<Natural> addition();

    BinaryOperator<Natural> multiplication();

    BinaryOperator<Natural> quotient();

    BinaryOperator<Natural> remainder();
}
