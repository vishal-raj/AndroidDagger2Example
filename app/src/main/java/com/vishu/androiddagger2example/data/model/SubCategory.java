package com.vishu.androiddagger2example.data.model;

import java.util.ArrayList;

/**
 * Created by Vishal on 29-12-2015.
 */
public class SubCategory
{
    private String city_id;

    //private Subscribe[] subscribe;

    private String error;

    private String[] zone_id;

    private ArrayList<List> list;

    private String msg;

    public String getCity_id ()
    {
        return city_id;
    }

    public void setCity_id (String city_id)
    {
        this.city_id = city_id;
    }
    /*
    public Subscribe[] getSubscribe ()
    {
        return subscribe;
    }

    public void setSubscribe (Subscribe[] subscribe)
    {
        this.subscribe = subscribe;
    }
    */

    public String getError ()
    {
        return error;
    }

    public void setError (String error)
    {
        this.error = error;
    }

    public String[] getZone_id ()
    {
        return zone_id;
    }

    public void setZone_id (String[] zone_id)
    {
        this.zone_id = zone_id;
    }

    public ArrayList<List> getList ()
    {
        return list;
    }

    public void setList (ArrayList<List> list)
    {
        this.list = list;
    }

    public String getMsg ()
    {
        return msg;
    }

    public void setMsg (String msg)
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [city_id = "+city_id+", error = "+error+", zone_id = "+zone_id+", list = "+list+", msg = "+msg+"]";
    }
}
