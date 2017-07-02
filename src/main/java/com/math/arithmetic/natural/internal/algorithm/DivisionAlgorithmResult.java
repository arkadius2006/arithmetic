package com.math.arithmetic.natural.internal.algorithm;

import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class DivisionAlgorithmResult {
    private final Natural quotient;
    private final Natural remainder;

    DivisionAlgorithmResult(Natural quotient, Natural remainder) {
        this.quotient = quotient;
        this.remainder = remainder;
    }

    public Natural getQuotient() {
        return quotient;
    }

    public Natural getRemainder() {
        return remainder;
    }
}
