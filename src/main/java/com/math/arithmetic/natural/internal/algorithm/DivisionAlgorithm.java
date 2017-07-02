package com.math.arithmetic.natural.internal.algorithm;

import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface DivisionAlgorithm {

    DivisionAlgorithmResult divide(Natural dividend, Natural divisor) throws ArithmeticException;
}
