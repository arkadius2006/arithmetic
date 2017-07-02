package com.math.arithmetic.natural.internal;

import java.util.Arrays;

/**
 * Created by arkadiy on 02/07/17.
 */
public class ArithmeticUtils {

    public static byte[] normalize(byte[] a) {
        int n = a.length;

        while (n > 0 && a[n - 1] == 0) {
            --n;
        }

        if (n == a.length) {
            return a;
        } else {
            return Arrays.copyOf(a, n);
        }
    }


}
