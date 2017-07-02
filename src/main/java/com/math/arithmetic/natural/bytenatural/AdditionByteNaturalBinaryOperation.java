package com.math.arithmetic.natural.bytenatural;

import com.math.function.BinaryOperation;
import com.math.arithmetic.natural.Natural;

import java.util.Arrays;

/**
 * Created by arkadiy on 02/07/17.
 */
class AdditionByteNaturalBinaryOperation implements BinaryOperation<Natural> {
    private final ByteNaturalArithmetic naturalArithmetic;

    public AdditionByteNaturalBinaryOperation(ByteNaturalArithmetic naturalArithmetic) {
        this.naturalArithmetic = naturalArithmetic;
    }

    @Override
    public ByteNatural apply(Natural first, Natural second) {
        ByteNatural a = naturalArithmetic.cast(first);
        ByteNatural b = naturalArithmetic.cast(second);

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
            return naturalArithmetic.newValue(c);
        } else {
            byte[] res = Arrays.copyOf(c, c.length + 1);
            res[c.length] = 1;
            return naturalArithmetic.newValue(res);
        }
    }
}
