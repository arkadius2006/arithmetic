package com.math.function;

/**
 * Created by arkadiy on 02/07/17.
 */
public interface BinaryFunction<T, U, R> {

    R apply(T t, U u);
}
