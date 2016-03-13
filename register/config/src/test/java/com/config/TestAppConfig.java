package com.config;

/**
 * Created by student on 2016/03/13.
 */

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAppConfig extends TestCase
{

    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCalCon.class);
    private AppConfig conA = (AppConfig)ctx.getBean("calc");

    public void testAppCon() throws Exception
    {
        int result = conA.add(8,5);
        assertEquals(result,13);
    }
}
