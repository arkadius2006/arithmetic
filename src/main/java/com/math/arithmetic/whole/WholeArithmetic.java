package com.math.arithmetic.whole;

import com.math.function.*;


/**
 * Created by arkadiy on 02/07/17.
 */
public interface WholeArithmetic {

    // implementations are supposed to override this method to return covariant type
    Whole cast(Whole whole);

    // special values

    Whole zero();

    Whole one();

    // unary relations

    Relation<Whole> isNegative();

    Relation<Whole> isZero();

    Relation<Whole> isPositive();


    // unary operations

    Operation<Whole> negation();

    Operation<Whole> abs();

    Operation<Whole> increment();

    Operation<Whole> decrement();

    // binary relations

    BinaryRelation<Whole> isLessThan();

    BinaryRelation<Whole> isEqualTo();

    BinaryRelation<Whole> isGreaterThan();

    ComparisonFunction<Whole> comparison();

    BinaryRelation<Whole> isDivisorOf();

    BinaryRelation<Whole> isMultipleOf();

    // binary operations

    BinaryOperation<Whole> addition();

    BinaryOperation<Whole> substraction();

    BinaryOperation<Whole> multiplication();

    BinaryOperation<Whole> quotient();

    BinaryOperation<Whole> remainder();

    BinaryOperation<Whole> floor();

    BinaryOperation<Whole> ceil();

    BinaryOperation<Whole> gcd();

    BinaryOperation<Whole> lcm();

    // todo factory and conversion methods


}
