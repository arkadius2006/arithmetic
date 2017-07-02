package com.math.arithmetic.natural.base;

import com.math.BinaryOperation;
import com.math.Operation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class DecrementNaturalOperation implements Operation<Natural> {
    private final BinaryOperation<Natural> substractionOperation;
    private final Natural one;

    public DecrementNaturalOperation(BinaryOperation<Natural> substractionOperation, Natural one) {
        this.substractionOperation = substractionOperation;
        this.one = one;
    }

    @Override
    public Natural apply(Natural natural) {
        return substractionOperation.apply(natural, one);
    }
}
