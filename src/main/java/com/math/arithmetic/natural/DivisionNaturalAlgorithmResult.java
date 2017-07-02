package com.math.arithmetic.natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class DivisionNaturalAlgorithmResult {
    private final Natural quotient;
    private final Natural remainder;

    DivisionNaturalAlgorithmResult(Natural quotient, Natural remainder) {
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
