package com.math.arithmetic.whole.wrap;

import com.math.arithmetic.natural.Natural;
import com.math.arithmetic.whole.Whole;
import com.math.arithmetic.whole.WholeArithmetic;

/**
 * Created by arkadiy on 02/07/17.
 */
final class WrapWhole implements Whole {
    private final WrapWholeArithmetic wholeArithmetic;
    private final Signum signum;
    private final Natural natural;

    WrapWhole(WrapWholeArithmetic wholeArithmetic, Signum signum, Natural natural) {
        if (wholeArithmetic == null) {
            throw new NullPointerException();
        }

        if (signum == null) {
            throw new NullPointerException();
        }

        if (natural == null) {
            throw new NullPointerException();
        }

        // todo check: if natural is zero, signum should be zero
        // todo check: if natural is non-zero, signum should be pos or neg

        this.wholeArithmetic = wholeArithmetic;
        this.signum = signum;
        this.natural = natural;
    }

    public Signum getSignum() {
        return signum;
    }

    public Natural getNatural() {
        return natural;
    }

    @Override
    public WrapWholeArithmetic getWholeArithmetic() {
        return null;
    }
}
