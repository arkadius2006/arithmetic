package com.math.arithmetic.whole.wrap;

import com.math.arithmetic.whole.Whole;
import com.math.function.Operation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class NegationWrapWholeOperation implements Operation<Whole> {
    private final WrapWholeArithmetic wholeArithmetic;

    public NegationWrapWholeOperation(WrapWholeArithmetic wholeArithmetic) {
        this.wholeArithmetic = wholeArithmetic;
    }

    @Override
    public Whole apply(Whole whole) {
        WrapWhole a = wholeArithmetic.cast(whole);

        Signum signum = a.getSignum();
        switch (signum) {
            case ZERO:
                return a;
            case POSITIVE:
                return wholeArithmetic.newValue(Signum.NEGATIVE, a.getNatural());
            case NEGATIVE:
                return wholeArithmetic.newValue(Signum.POSITIVE, a.getNatural());
            default:
                throw new AssertionError();
        }
    }
}
