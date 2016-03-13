package com.setp;

/**
 * Created by student on 2016/03/13.
 */
import junit.framework.Assert;
import junit.framework.TestCase;
import java.util.HashSet;
import java.util.Set;

public class TestPartyNames extends TestCase
{
    PartyNamesImpl prt = new PartyNamesImpl();

    public void testPartyNames() throws Exception
    {
        Set<String> set2 = new HashSet<String>();
        set2.add("ANC");
        set2.add("DA");
        set2.add("IFP");

        Assert.assertEquals(prt.names(),set2);

    }


}
