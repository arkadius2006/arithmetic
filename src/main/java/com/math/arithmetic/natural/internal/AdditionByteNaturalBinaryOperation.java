package com.math.arithmetic.natural.internal;

import com.math.BinaryOperation;

import java.util.Arrays;

/**
 * Created by arkadiy on 02/07/17.
 */
public class AdditionByteNaturalBinaryOperation implements BinaryOperation<ByteNatural> {

    @Override
    public ByteNatural apply(ByteNatural a, ByteNatural b) {
        int an = a.getArrayLength();
        int bn = b.getArrayLength();

        int maxn = Integer.max(an, bn);

        byte[] c = new byte[maxn];
        byte overflow = 0;
        for (int i = 0; i < maxn; i++) {
            final int sum = a.getElement(i) + b.getElement(i) + overflow;
            c[i] = (byte) sum;
            overflow = (c[i] == sum) ? 0 : (byte) 1;
        }

        if (overflow == 0) {
            return new ByteNatural(c);
        } else {
            byte[] res = Arrays.copyOf(c, c.length + 1);
            res[c.length] = 1;
            return new ByteNatural(res);
        }
    }
}
