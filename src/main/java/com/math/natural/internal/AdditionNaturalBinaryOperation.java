package com.math.natural.internal;

import com.math.BinaryOperation;
import com.math.natural.Natural;

import java.util.Arrays;

/**
 * Created by arkadiy on 02/07/17.
 */
public class AdditionNaturalBinaryOperation implements BinaryOperation<Natural> {

    @Override
    public Natural apply(Natural a, Natural b) {
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
            return new Natural(c);
        } else {
            byte[] res = Arrays.copyOf(c, c.length + 1);
            res[c.length] = 1;
            return new Natural(res);
        }
    }
}
