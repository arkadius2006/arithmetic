package com.math.arithmetic.common;

import com.math.function.BinaryOperation;
import com.math.function.Operation;
import com.math.arithmetic.natural.Natural;

/**
 * Created by arkadiy on 02/07/17.
 */
public class IncrementOperation<T> implements Operation<T> { // todo rename to more general like addition operation (not binary)
    private final BinaryOperation<T> additionOperation;
    private final T value;

    public IncrementOperation(BinaryOperation<T> additionOperation, T value) {
        this.additionOperation = additionOperation;
        this.value = value;
    }

    @Override
    public T apply(T natural) {
        return additionOperation.apply(natural, value);
    }
}
