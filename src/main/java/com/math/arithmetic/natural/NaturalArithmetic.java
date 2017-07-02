package com.math.arithmetic.natural;

import com.math.BinaryRelation;
import com.math.Relation;

import java.util.function.BinaryOperator;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface NaturalArithmetic {

    Relation<ByteNatural> isZero();

    BinaryRelation<ByteNatural> isLessThan();

    BinaryRelation<ByteNatural> isEqualTo();

    BinaryRelation<ByteNatural> isGreaterThan();

    BinaryRelation<ByteNatural> isDivisorOf();

    BinaryRelation<ByteNatural> isMultipleOf();

    BinaryOperator<ByteNatural> addition();

    BinaryOperator<ByteNatural> multiplication();

    BinaryOperator<ByteNatural> quotient();

    BinaryOperator<ByteNatural> remainder();
}
