package com.math.arithmetic.natural.internal;

import com.math.BinaryRelation;
import com.math.ComparisonFunction;
import com.math.Relation;
import com.math.arithmetic.natural.Natural;
import com.math.arithmetic.natural.NaturalArithmetic;
import com.math.arithmetic.natural.base.IsEqualToNaturalBinaryRelation;
import com.math.arithmetic.natural.base.IsGreaterThanNatualBinaryRelation;
import com.math.arithmetic.natural.base.IsLessThanNaturalBinaryRelation;

import java.util.function.BinaryOperator;

/**
 * Created by arkadiy on 02/07/17.
 */
public class ByteNaturalArithmetic implements NaturalArithmetic {

    private final Relation<Natural> isZeroRelation;
    private final ComparisonFunction<Natural> comparisonFunction;
    private final BinaryRelation<Natural> isLessThanRelation;
    private final BinaryRelation<Natural> isEqualToRelation;
    private final BinaryRelation<Natural> isGreaterThanRelation;


    public ByteNaturalArithmetic() {
        this.isZeroRelation = new IsZeroByteNaturalRelation(this);
        this.comparisonFunction = new ByteNaturalComparisonFunction(this);
        this.isLessThanRelation = new IsLessThanNaturalBinaryRelation(comparisonFunction);
        this.isEqualToRelation = new IsEqualToNaturalBinaryRelation(comparisonFunction);
        this.isGreaterThanRelation = new IsGreaterThanNatualBinaryRelation(comparisonFunction);
    }

    // factory method specific to this implementation
    public ByteNatural newValue(byte[] a) {
        return new ByteNatural(this, a);
    }

    @Override
    public ByteNatural cast(Natural value) {
        if (value == null) {
            throw new NullPointerException();
        }

        if (!(value instanceof ByteNatural)) {
            throw new ClassCastException();
        }

        ByteNatural a = (ByteNatural) value;

        if (a.getNaturalArithmetic() != this) {
            throw new IllegalArgumentException();
        }

        return a;
    }

    @Override
    public Relation<Natural> isZero() {
        return isZeroRelation;
    }

    @Override
    public BinaryRelation<Natural> isLessThan() {
        return isLessThanRelation;
    }

    @Override
    public BinaryRelation<Natural> isEqualTo() {
        return isEqualToRelation;
    }

    @Override
    public BinaryRelation<Natural> isGreaterThan() {
        return isGreaterThanRelation;
    }

    @Override
    public ComparisonFunction<Natural> comparison() {
        return comparisonFunction;
    }

    @Override
    public BinaryRelation<Natural> isDivisorOf() {
        return null;
    }

    @Override
    public BinaryRelation<Natural> isMultipleOf() {
        return null;
    }

    @Override
    public BinaryOperator<Natural> addition() {
        return null;
    }

    @Override
    public BinaryOperator<Natural> multiplication() {
        return null;
    }

    @Override
    public BinaryOperator<Natural> quotient() {
        return null;
    }

    @Override
    public BinaryOperator<Natural> remainder() {
        return null;
    }

    @Override
    public Natural of(byte value) {
        return null;
    }

    @Override
    public Natural of(int value) {
        return null;
    }

    @Override
    public Natural of(long value) {
        return null;
    }

    @Override
    public Natural ofDecimal(String value) throws NumberFormatException {
        return null;
    }

    @Override
    public Natural ofBinary(String value) throws NumberFormatException {
        return null;
    }

    @Override
    public Natural ofHexidecimal(String value) throws NumberFormatException {
        return null;
    }

    @Override
    public byte toByte(Natural value) throws ArithmeticException {
        return 0;
    }

    @Override
    public int toInt(Natural value) throws ArithmeticException {
        return 0;
    }

    @Override
    public long toLong(Natural value) throws ArithmeticException {
        return 0;
    }

    @Override
    public String toDecimal(Natural value) {
        return null;
    }

    @Override
    public String toBinary(Natural value) {
        return null;
    }

    @Override
    public String toHexidecimal(Natural value) {
        return null;
    }
}
