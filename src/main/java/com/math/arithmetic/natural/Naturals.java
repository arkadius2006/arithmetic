package com.math.arithmetic.natural;

/**
 * Provide convertion method between Natural and primitive number classes as well as strings with 2, 10, 16 radix
 */
public class Naturals {

    private Naturals() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static ByteNatural of(byte value) {
        throw new UnsupportedOperationException();
    }

    public static ByteNatural of(int value) {
        throw new UnsupportedOperationException();
    }

    public static ByteNatural of(long value) {
        throw new UnsupportedOperationException();
    }

    public static ByteNatural ofDecimal(String value) throws NumberFormatException {
        throw new UnsupportedOperationException();
    }

    public static ByteNatural ofBinary(String value) throws NumberFormatException {
        throw new UnsupportedOperationException();
    }

    public static ByteNatural ofHexidecimal(String value) throws NumberFormatException {
        throw new UnsupportedOperationException();
    }

    public static boolean isWithinByteRange(ByteNatural value) {
        throw new UnsupportedOperationException();
    }

    public static byte toByte(ByteNatural value) throws ArithmeticException {
        throw new UnsupportedOperationException();
    }

    public static boolean isWithinIntRange(ByteNatural value) {
        throw new UnsupportedOperationException();
    }

    public static int toInt(ByteNatural value) throws ArithmeticException {
        throw new UnsupportedOperationException();
    }

    public static boolean isWithinLongRange(ByteNatural value) {
        throw new UnsupportedOperationException();
    }

    public static long toLong(ByteNatural value) throws ArithmeticException {
        throw new UnsupportedOperationException();
    }

    public static String toDecimal(ByteNatural value) {
        throw new UnsupportedOperationException();
    }

    public static String toBinary(ByteNatural value) {
        throw new UnsupportedOperationException();
    }

    public static String toHexidecimal(ByteNatural value) {
        throw new UnsupportedOperationException();
    }
}
