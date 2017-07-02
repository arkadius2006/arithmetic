package com.math.arithmetic.natural;

import com.math.function.*;


/**
 * Created by arkadiy on 02/07/17.
 */
public interface NaturalArithmetic {

    // implementations are supposed to override this method to return covariant type
    Natural cast(Natural value);

    // relations and operations

    Relation<Natural> isZero();

    BinaryRelation<Natural> isLessThan();

    BinaryRelation<Natural> isEqualTo();

    BinaryRelation<Natural> isGreaterThan();

    ComparisonFunction<Natural> comparison();

    BinaryRelation<Natural> isDivisorOf();

    BinaryRelation<Natural> isMultipleOf();

    BinaryOperation<Natural> addition();

    BinaryOperation<Natural> substraction();

    Operation<Natural> increment();

    Operation<Natural> decrement();

    BinaryOperation<Natural> multiplication();

    BinaryOperation<Natural> quotient();

    BinaryOperation<Natural> remainder();

    BinaryOperation<Natural> floor();

    BinaryOperation<Natural> ceil();

    // special values

    Natural zero();

    Natural one();

    // factory methods

    Natural of(byte value);

    Natural of(int value);

    Natural of(long value);

    Natural ofDecimal(String value) throws NumberFormatException;

    Natural ofBinary(String value) throws NumberFormatException;

    Natural ofHexidecimal(String value) throws NumberFormatException;


    // convertion back to java primitives methods

    byte toByte(Natural value) throws ArithmeticException;

    int toInt(Natural value) throws ArithmeticException;

    long toLong(Natural value) throws ArithmeticException;

    String toDecimal(Natural value);

    String toBinary(Natural value);

    String toHexidecimal(Natural value);
}
