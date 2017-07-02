package com.math.arithmetic.whole.wrap;

import com.math.arithmetic.whole.Whole;
import com.math.function.ComparisonFunction;

/**
 * Created by arkadiy on 02/07/17.
 */
public class WrapWholeComparisonFunction implements ComparisonFunction<Whole> {
    private final WrapWholeArithmetic wholeArithmetic;

    public WrapWholeComparisonFunction(WrapWholeArithmetic wholeArithmetic) {
        this.wholeArithmetic = wholeArithmetic;
    }

    @Override
    public Result apply(Whole whole, Whole whole2) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
