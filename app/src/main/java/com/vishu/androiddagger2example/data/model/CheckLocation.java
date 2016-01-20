package com.vishu.androiddagger2example.data.model;

import java.util.ArrayList;

/**
 * Created by Vishal on 27-12-2015.
 */
public class CheckLocation
{
    private String error;

    private String zoneid;

    private String society;

    private String street;

    private String state;

    private String addr;

    private String postcode;

    private ArrayList<Apartment> apartments;

    private String msg;

    private String cityid;

    private String city;

    private String tower;

    private String route;

    private String locality;

    private String[] sublocality;

    private String[] local;

    public String getError ()
    {
        return error;
    }

    public void setError (String error)
    {
        this.error = error;
    }

    public String getZoneid ()
    {
        return zoneid;
    }

    public void setZoneid (String zoneid)
    {
        this.zoneid = zoneid;
    }

    public String getSociety ()
    {
        return society;
    }

    public void setSociety (String society)
    {
        this.society = society;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getAddr ()
    {
        return addr;
    }

    public void setAddr (String addr)
    {
        this.addr = addr;
    }

    public String getPostcode ()
    {
        return postcode;
    }

    public void setPostcode (String postcode)
    {
        this.postcode = postcode;
    }

    public ArrayList<Apartment> getApartments ()
    {
        return apartments;
    }

    public void setApartments (ArrayList<Apartment> apartments)
    {
        this.apartments = apartments;
    }

    public String getMsg ()
    {
        return msg;
    }

    public void setMsg (String msg)
    {
        this.msg = msg;
    }

    public String getCityid ()
    {
        return cityid;
    }

    public void setCityid (String cityid)
    {
        this.cityid = cityid;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getTower ()
    {
        return tower;
    }

    public void setTower (String tower)
    {
        this.tower = tower;
    }

    public String getRoute ()
    {
        return route;
    }

    public void setRoute (String route)
    {
        this.route = route;
    }

    public String getLocality ()
    {
        return locality;
    }

    public void setLocality (String locality)
    {
        this.locality = locality;
    }

    public String[] getSublocality ()
    {
        return sublocality;
    }

    public void setSublocality (String[] sublocality)
    {
        this.sublocality = sublocality;
    }

    public String[] getLocal ()
    {
        return local;
    }

    public void setLocal (String[] local)
    {
        this.local = local;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [error = "+error+", zoneid = "+zoneid+", society = "+society+", street = "+street+", state = "+state+", addr = "+addr+", postcode = "+postcode+", apartments = "+apartments+", msg = "+msg+", cityid = "+cityid+", city = "+city+", tower = "+tower+", route = "+route+", locality = "+locality+", sublocality = "+sublocality+", local = "+local+"]";
    }
}
