package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.common.DivisionFunction;
import com.math.arithmetic.common.*;
import com.math.arithmetic.natural.Natural;
import com.math.arithmetic.natural.NaturalArithmetic;
import com.math.function.*;


/**
 * Created by arkadiy on 02/07/17.
 */
public class ByteNaturalArithmetic implements NaturalArithmetic {

    private final Relation<Natural> isZeroRelation;
    private final ComparisonFunction<Natural> comparisonFunction;
    private final BinaryRelation<Natural> isLessThanRelation;
    private final BinaryRelation<Natural> isEqualToRelation;
    private final BinaryRelation<Natural> isGreaterThanRelation;
    private final BinaryOperation<Natural> additionOperation;
    private final BinaryOperation<Natural> substractionOperation;
    private final Operation<Natural> incrementOperation;
    private final Operation<Natural> decrementOperation;


    private final MultiplicationAlgorithm<Natural> multiplicationAlgorithm;
    private final BinaryOperation<Natural> multiplicationOperation;

    private final DivisionFunction<Natural> divisionFunction;

    private final DivisionAlgorithm<Natural> divisionAlgorithm;
    private final BinaryOperation<Natural> quotientOperation;
    private final BinaryOperation<Natural> remainderOperation;
    private final BinaryRelation<Natural> isDivisorOfRelation;
    private final BinaryRelation<Natural> isMultipleOfRelation;

    private final Natural zero;
    private final Natural one;

    public ByteNaturalArithmetic() {

        this.zero = newValue(new byte[]{});
        this.one = newValue(new byte[]{1});

        this.comparisonFunction = new ByteNaturalComparisonFunction(this);
        this.isLessThanRelation = new IsLessThanBinaryRelation<Natural>(comparisonFunction);
        this.isEqualToRelation = new IsEqualToBinaryRelation<Natural>(comparisonFunction);
        this.isGreaterThanRelation = new IsGreaterThanBinaryRelation<Natural>(comparisonFunction);

        this.isZeroRelation = new ReducedBySecondOperandBinaryRelation<Natural>(isEqualToRelation, zero);

        this.additionOperation = new AdditionByteNaturalBinaryOperation(this);
        this.substractionOperation = new SubstractionByteNaturalBinaryOperation(this);
        this.incrementOperation = new ReducedBySecondOperandBinaryOperation<Natural>(additionOperation, one);
        this.decrementOperation = new ReducedBySecondOperandBinaryOperation<Natural>(substractionOperation, one);

        this.multiplicationAlgorithm = new LongMultiplicationByteAlgorithm(this);
        this.multiplicationOperation = new MultiplicationBinaryOperation<Natural>(multiplicationAlgorithm);


        this.divisionAlgorithm = new NewtonRaphsonDivisonByteAlgorithm(this);

        this.divisionFunction = new BaseDivisionFunction<Natural>(divisionAlgorithm);

        this.quotientOperation = new QuotientBinaryOperation<Natural>(divisionFunction);
        this.remainderOperation = new RemainderBinaryOperation<Natural>(divisionFunction);
        this.isDivisorOfRelation = new IsDivisorOfBinaryRelation<Natural>(remainderOperation, isZeroRelation);
        this.isMultipleOfRelation = new IsMultipleOfBinaryRelation<Natural>(remainderOperation, isZeroRelation);
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
        return isDivisorOfRelation;
    }

    @Override
    public BinaryRelation<Natural> isMultipleOf() {
        return isMultipleOfRelation;
    }

    @Override
    public BinaryOperation<Natural> addition() {
        return additionOperation;
    }

    @Override
    public BinaryOperation<Natural> substraction() {
        return substractionOperation;
    }

    @Override
    public Operation<Natural> increment() {
        return incrementOperation;
    }

    @Override
    public Operation<Natural> decrement() {
        return decrementOperation;
    }

    @Override
    public BinaryOperation<Natural> multiplication() {
        return multiplicationOperation;
    }

    @Override
    public BinaryOperation<Natural> quotient() {
        return quotientOperation;
    }

    @Override
    public BinaryOperation<Natural> remainder() {
        return remainderOperation;
    }

    @Override
    public Natural zero() {
        return zero;
    }

    @Override
    public Natural one() {
        return one;
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
