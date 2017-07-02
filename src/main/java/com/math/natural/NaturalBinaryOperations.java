package com.math.natural;

import com.math.BinaryOperation;
import com.math.natural.internal.algorithm.DivisionAlgorithm;
import com.math.natural.internal.algorithm.LongMultiplicationAlgorithm;
import com.math.natural.internal.algorithm.MultiplicationAlgorithm;
import com.math.natural.internal.algorithm.NewtonRaphsonDivisonAlgorithm;
import com.math.natural.internal.AdditionNaturalBinaryOperation;
import com.math.natural.internal.MultiplicationNaturalBinaryOperation;
import com.math.natural.internal.QuotientNatualBinaryOperation;
import com.math.natural.internal.RemainderNaturalBinaryOperation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class NaturalBinaryOperations {

    private final static NaturalBinaryOperations INSTANCE = new NaturalBinaryOperations();

    private final BinaryOperation<Natural> addition;
    private final BinaryOperation<Natural> multiplication;
    private final BinaryOperation<Natural> quotiention;
    private final BinaryOperation<Natural> remaindertion;


    public static NaturalBinaryOperations getInstance() {
        return INSTANCE;
    }

    private NaturalBinaryOperations() {
        addition = new AdditionNaturalBinaryOperation();

        MultiplicationAlgorithm multiplicationAlgorithm = new LongMultiplicationAlgorithm();
        multiplication = new MultiplicationNaturalBinaryOperation(multiplicationAlgorithm);

        DivisionAlgorithm divisionAlgorithm = new NewtonRaphsonDivisonAlgorithm();
        quotiention = new QuotientNatualBinaryOperation(divisionAlgorithm);
        remaindertion = new RemainderNaturalBinaryOperation(divisionAlgorithm);
    }

    public Natural sum(Natural a, Natural b) {
        return addition.apply(a, b);
    }

    public Natural product(Natural a, Natural b) {
        return multiplication.apply(a, b);
    }

    public Natural quotient(Natural dividend, Natural divisor) {
        return quotiention.apply(dividend, divisor);
    }

    public Natural remainder(Natural dividend, Natural divisor) {
        return remaindertion.apply(dividend, dividend);
    }

}
