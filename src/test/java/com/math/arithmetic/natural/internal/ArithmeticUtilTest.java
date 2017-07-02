package com.math.arithmetic.natural.internal;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by arkadiy on 02/07/17.
 */
public class ArithmeticUtilTest {

    @Test
    public void emptyArray() {
        byte[] a = {};
        byte[] b = ByteNaturalArithmeticUtils.normalize(a);
        Assert.assertEquals(0, b.length);
    }

    @Test
    public void oneElementZero() {
        byte[] a = {0};
        byte[] b = ByteNaturalArithmeticUtils.normalize(a);
        Assert.assertEquals(0, b.length);
    }

    @Test
    public void oneElementNonZero() {
        byte[] a = {6};
        byte[] b = ByteNaturalArithmeticUtils.normalize(a);
        Assert.assertEquals(1, b.length);
        Assert.assertEquals(6, b[0]);
    }

    @Test
    public void twoElementsBothZeros() {
        byte[] a = {0, 0};
        byte[] b = ByteNaturalArithmeticUtils.normalize(a);
        Assert.assertEquals(0, b.length);
    }

    @Test
    public void twoElementsHighZero() {
        byte[] a = {6, 0};
        byte[] b = ByteNaturalArithmeticUtils.normalize(a);
        Assert.assertEquals(1, b.length);
        Assert.assertEquals(6, b[0]);
    }

    @Test
    public void twoElementsLowZero() {
        byte[] a = {0, 7};
        byte[] b = ByteNaturalArithmeticUtils.normalize(a);
        Assert.assertEquals(2, b.length);
        Assert.assertEquals(0, b[0]);
        Assert.assertEquals(7, b[1]);
    }

    @Test
    public void twoElementsBothNonZero() {
        byte[] a = {6, 7};
        byte[] b = ByteNaturalArithmeticUtils.normalize(a);
        Assert.assertEquals(2, b.length);
        Assert.assertEquals(6, b[0]);
        Assert.assertEquals(7, b[1]);
    }
}
