package com.lists;

/**
 * Created by student on 2016/03/13.
 */
import java.util.ArrayList;
import java.util.List;
public class StudNamesImpl implements StudNames
{
    public List<String> names()
    {
        List lst = new ArrayList();

        lst.add("Luxolo");
        lst.add("Mpisane");

        return lst;
    }
}
