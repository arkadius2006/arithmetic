package com.math.arithmetic.common;

import com.math.function.BinaryOperation;
import com.math.function.Operation;

/**
 * Created by arkadiy on 02/07/17.
 */
public class DecrementOperation<T> implements Operation<T> { // todo more general name e.g. substraction not binary operation
    private final BinaryOperation<T> substractionOperation;
    private final T value;

    public DecrementOperation(BinaryOperation<T> substractionOperation, T value) {
        this.substractionOperation = substractionOperation;
        this.value = value;
    }

    @Override
    public T apply(T natural) {
        return substractionOperation.apply(natural, value);
    }
}
