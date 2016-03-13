package com.mape;

/**
 * Created by student on 2016/03/13.
 */
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestEmployeeNames extends TestCase
{
    EmployeeNamesImpl emp = new EmployeeNamesImpl();

    public void testEmpNames() throws Exception {

        Assert.assertEquals(emp.names().get("Zizo"),
                emp.names().get("Zizo"));
    }
}
