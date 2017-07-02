package com.math.arithmetic.natural.base;

import com.math.BinaryOperation;
import com.math.Operation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IncrementNaturalOperation implements Operation<Natural> {

    private final BinaryOperation<Natural> additionOperation;
    private final Natural one;

    public IncrementNaturalOperation(BinaryOperation<Natural> additionOperation, Natural one) {
        this.additionOperation = additionOperation;
        this.one = one;
    }

    @Override
    public Natural apply(Natural natural) {
        return additionOperation.apply(natural, one);
    }
}
