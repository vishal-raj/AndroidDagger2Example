package com.vishu.androiddagger2example.data.model;

import java.util.ArrayList;

/**
 * Created by Vishal on 27-12-2015.
 */
public class Category
{
    private String city_id;

    private String error;

    private String[] zone_id;

    private ArrayList<CategoryDetails> categories;

    private String msg;

    public String getCity_id ()
    {
        return city_id;
    }

    public void setCity_id (String city_id)
    {
        this.city_id = city_id;
    }

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

    public ArrayList<CategoryDetails> getCategories ()
    {
        return categories;
    }

    public void setCategories (ArrayList<CategoryDetails> categories)
    {
        this.categories = categories;
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
        return "ClassPojo [city_id = "+city_id+", error = "+error+", zone_id = "+zone_id+", categories = "+categories+", msg = "+msg+"]";
    }
}
