package com.setp;

/**
 * Created by student on 2016/03/13.
 */
import java.util.Set;
import java.util.HashSet;
public class PartyNamesImpl implements PartyNames
{
    public Set<String> names()
    {
        Set<String> stp = new HashSet<String>();
        stp.add("ANC");
        stp.add("DA");
        stp.add("IFP");

        return stp;
    }
}
