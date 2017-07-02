package com.math.natural;

import com.math.natural.internal.ArithmeticUtils;

/**
 * 0, 1, 2, ...
 */
public class Natural {
    // bytes are interpretered as unsigned values, e.g. from 0 to 255
    // a[0] is lowest byte, a[a.length - 1] is the most significant
    // i.e. value = a[0] + 256 * a[1] + 256^2 * a[2] + ...
    private final byte[] a;

    // todo enforce package private access
    public Natural(final byte[] inputArray) { // todo optimization: provide several implementations of Natural in case of 1, 2, 4, > 4 bytes long
        if (inputArray == null) {
            throw new NullPointerException();
        }

        // no defensive copying since constructor is package visible
        this.a = ArithmeticUtils.normalize(inputArray);
    }

    public boolean isZero() {
        return a.length == 0; // since array is normalized
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
}
