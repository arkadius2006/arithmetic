package com.math.arithmetic.natural.internal.algorithm;

import com.math.arithmetic.natural.internal.ByteNatural;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface DivisionByteNaturalAlgorithm {

    DivisionByteNaturalAlgorithmResult divide(ByteNatural dividend, ByteNatural divisor) throws ArithmeticException;
}
