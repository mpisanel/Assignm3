package com.register;

/**
 * Created by student on 2016/03/13.
 */
import junit.framework.TestCase;
import junit.framework.Assert;
public class TestLilCalculator extends TestCase
{
    LilCalculatorImpl lilC = new LilCalculatorImpl();

    public void testLilCal() throws Exception
    {
        Assert.assertEquals(lilC.add(), 17);
    }
}
