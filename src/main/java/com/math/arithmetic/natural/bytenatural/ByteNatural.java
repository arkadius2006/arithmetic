package com.math.arithmetic.natural.bytenatural;

import com.math.arithmetic.natural.Natural;

/**
 * 0, 1, 2, ...
 */
final class ByteNatural implements Natural {
    private final ByteNaturalArithmetic naturalArithmetic;

    // bytes are interpretered as unsigned values, e.g. from 0 to 255
    // a[0] is lowest byte, a[a.length - 1] is the most significant
    // i.e. value = a[0] + 256 * a[1] + 256^2 * a[2] + ...
    private final byte[] a;

    // todo enforce package private access
    ByteNatural(ByteNaturalArithmetic naturalArithmetic, final byte[] inputArray) { // todo optimization: provide several implementations of Natural in case of 1, 2, 4, > 4 bytes long
        if (naturalArithmetic == null) {
            throw new NullPointerException();
        }

        if (inputArray == null) {
            throw new NullPointerException();
        }

        this.naturalArithmetic = naturalArithmetic;
        this.a = ByteNaturalArithmeticUtils.normalize(inputArray); // no defensive copying since constructor is package visible
    }

    public int getArrayLength() {
        return a.length;
    }

    public byte getElement(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }

        if (i < a.length) {
            return a[i];
        } else {
            return 0;
        }
    }

    @Override
    public ByteNaturalArithmetic getNaturalArithmetic() {
        return naturalArithmetic;
    }
}
