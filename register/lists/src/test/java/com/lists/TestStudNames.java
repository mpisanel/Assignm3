package com.lists;

/**
 * Created by student on 2016/03/13.
 */
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestStudNames extends TestCase
{
    StudNamesImpl stud = new StudNamesImpl();

    public void testStudNames() throws Exception
    {
        Assert.assertEquals(stud.names().get(0),
                stud.names().get(0));

    }
}
