package com.vishu.androiddagger2example.data.model;

/**
 * Created by Vishal on 27-12-2015.
 */
public class Apartment {
    private String apartment_id;

    private String name;

    private String code;

    public String getApartment_id ()
    {
        return apartment_id;
    }

    public void setApartment_id (String apartment_id)
    {
        this.apartment_id = apartment_id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [apartment_id = "+apartment_id+", name = "+name+", code = "+code+"]";
    }
}
