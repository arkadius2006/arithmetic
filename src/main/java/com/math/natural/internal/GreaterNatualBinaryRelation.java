package com.math.natural.internal;

import com.math.BinaryRelation;
import com.math.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class GreaterNatualBinaryRelation implements BinaryRelation<Natural> {

    @Override
    public boolean test(Natural a, Natural b) {
        int n = a.getArrayLength();
        int m = b.getArrayLength();

        if (n > m) {
            return true;
        } else if (n < m) {
            return false;
        }

        for (int i = n - 1; i >= 0; --i) {
            byte ai = a.getElement(i);
            byte bi = b.getElement(i);

            if (ai > bi) {
                return true;
            } else if (ai < bi) {
                return false;
            }
        }

        return false;
    }
}
