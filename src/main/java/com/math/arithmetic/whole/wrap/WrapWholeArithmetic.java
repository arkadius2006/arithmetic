package com.math.arithmetic.whole.wrap;

import com.math.arithmetic.DivisionFunction;
import com.math.arithmetic.common.*;
import com.math.arithmetic.natural.Natural;
import com.math.arithmetic.natural.NaturalArithmetic;
import com.math.arithmetic.whole.Whole;
import com.math.arithmetic.whole.WholeArithmetic;
import com.math.function.*;

/**
 * Created by arkadiy on 02/07/17.
 */
public class WrapWholeArithmetic implements WholeArithmetic {
    private final NaturalArithmetic naturalArithmetic;

    private final Whole zeroValue;
    private final Whole oneValue;


    private final ComparisonFunction<Whole> comparisonFunction;
    private final BinaryRelation<Whole> isLessThanBinaryRelation;
    private final BinaryRelation<Whole> isEqualToBinaryRelation;
    private final BinaryRelation<Whole> isGreaterThanBinaryRelation;

    private final Relation<Whole> isNegativeRelation;
    private final Relation<Whole> isZeroRelation;
    private final Relation<Whole> isPositiveRelation;

    private final Operation<Whole> negationOperation;
    private final Operation<Whole> absOperation;


    public WrapWholeArithmetic(NaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;

        this.zeroValue = newValue(Signum.ZERO, naturalArithmetic.zero());
        this.oneValue = newValue(Signum.POSITIVE, naturalArithmetic.one());

        this.comparisonFunction = new WrapWholeComparisonFunction(this);
        this.isLessThanBinaryRelation = new IsLessThanBinaryRelation<Whole>(comparisonFunction);
        this.isEqualToBinaryRelation = new IsEqualToBinaryRelation<Whole>(comparisonFunction);
        this.isGreaterThanBinaryRelation = new IsGreaterThanBinaryRelation<Whole>(comparisonFunction);

        this.isNegativeRelation = new ReducedBySecondOperandBinaryRelation<Whole>(isLessThanBinaryRelation, zeroValue);
        this.isZeroRelation = new ReducedBySecondOperandBinaryRelation<Whole>(isEqualToBinaryRelation, zeroValue);
        this.isPositiveRelation = new ReducedBySecondOperandBinaryRelation<Whole>(isGreaterThanBinaryRelation, zeroValue);

        this.negationOperation = new NegationWrapWholeOperation(this);
        this.absOperation = new AbsWrapWholeOperation(this);

    }

    // specific to this implementation
    public WrapWhole newValue(Signum signum, Natural natural) {
        return new WrapWhole(this, signum, natural);
    }

    @Override
    public WrapWhole cast(Whole whole) {
        if (whole == null) {
            throw new NullPointerException();
        }

        if (!(whole instanceof WrapWhole)) {
            throw new ClassCastException();
        }

        WrapWhole ww = (WrapWhole) whole;

        if (ww.getWholeArithmetic() != this) {
            throw new IllegalArgumentException();
        }

        return ww;
    }

    @Override
    public Whole zero() {
        return zeroValue;
    }

    @Override
    public Whole one() {
        return oneValue;
    }

    @Override
    public Relation<Whole> isNegative() {
        return isNegativeRelation;
    }

    @Override
    public Relation<Whole> isZero() {
        return isZeroRelation;
    }

    @Override
    public Relation<Whole> isPositive() {
        return isPositiveRelation;
    }

    @Override
    public Operation<Whole> negation() {
        return negationOperation;
    }

    @Override
    public Operation<Whole> abs() {
        return absOperation;
    }

    @Override
    public Operation<Whole> increment() {
        return null;
    }

    @Override
    public Operation<Whole> decrement() {
        return null;
    }

    @Override
    public BinaryRelation<Whole> isLessThan() {
        return isLessThanBinaryRelation;
    }

    @Override
    public BinaryRelation<Whole> isEqualTo() {
        return isEqualToBinaryRelation;
    }

    @Override
    public BinaryRelation<Whole> isGreaterThan() {
        return isGreaterThanBinaryRelation;
    }

    @Override
    public ComparisonFunction<Whole> comparison() {
        return comparisonFunction;
    }

    @Override
    public BinaryRelation<Whole> isDivisorOf() {
        return null;
    }

    @Override
    public BinaryRelation<Whole> isMultipleOf() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> addition() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> substraction() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> multiplication() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> quotient() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> remainder() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> floor() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> ceil() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> gcd() {
        return null;
    }

    @Override
    public BinaryOperation<Whole> lcm() {
        return null;
    }

    @Override
    public DivisionFunction<Whole> division() {
        return null;
    }

    public NaturalArithmetic getNaturalArithmetic() {
        return naturalArithmetic;
    }
}
