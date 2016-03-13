package com.mape;

/**
 * Created by student on 2016/03/13.
 */
import java.util.HashMap;
import java.util.Map;

public class EmployeeNamesImpl implements EmployeeNames
{
    public Map<String, String> names() {

    Map mp = new HashMap();

    mp.put("Zizo","7th year");
    mp.put("Zuzu","23th year");
    mp.put("Lulu","18th year");

    return mp;
}
}
