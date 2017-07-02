package com.math.arithmetic.natural.internal.algorithm;

import com.math.arithmetic.natural.ByteNatural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class DivisionByteNaturalAlgorithmResult {
    private final ByteNatural quotient;
    private final ByteNatural remainder;

    DivisionByteNaturalAlgorithmResult(ByteNatural quotient, ByteNatural remainder) {
        this.quotient = quotient;
        this.remainder = remainder;
    }

    public ByteNatural getQuotient() {
        return quotient;
    }

    public ByteNatural getRemainder() {
        return remainder;
    }
}
