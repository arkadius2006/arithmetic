package com.math.natural;

/**
 * Provide convertion method between Natural and primitive number classes as well as strings with 2, 10, 16 radix
 */
public class Naturals {

    private Naturals() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static Natural of(byte value) {
        throw new UnsupportedOperationException();
    }

    public static Natural of(int value) {
        throw new UnsupportedOperationException();
    }

    public static Natural of(long value) {
        throw new UnsupportedOperationException();
    }

    public static Natural ofDecimal(String value) throws NumberFormatException {
        throw new UnsupportedOperationException();
    }

    public static Natural ofBinary(String value) throws NumberFormatException {
        throw new UnsupportedOperationException();
    }

    public static Natural ofHexidecimal(String value) throws NumberFormatException {
        throw new UnsupportedOperationException();
    }

    public static boolean isWithinByteRange(Natural value) {
        throw new UnsupportedOperationException();
    }

    public static byte toByte(Natural value) throws ByteOverflowException {
        throw new UnsupportedOperationException();
    }

    public static boolean isWithinIntRange(Natural value) {
        throw new UnsupportedOperationException();
    }

    public static int toInt(Natural value) throws IntOverflowException {
        throw new UnsupportedOperationException();
    }

    public static boolean isWithinLongRange(Natural value) {
        throw new UnsupportedOperationException();
    }

    public static long toLong(Natural value) throws LongOverflowException {
        throw new UnsupportedOperationException();
    }

    public static String toDecimal(Natural value) {
        throw new UnsupportedOperationException();
    }

    public static String toBinary(Natural value) {
        throw new UnsupportedOperationException();
    }

    public static String toHexidecimal(Natural value) {
        throw new UnsupportedOperationException();
    }
}
