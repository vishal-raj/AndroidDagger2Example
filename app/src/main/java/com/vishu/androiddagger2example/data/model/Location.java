package com.vishu.androiddagger2example.data.model;

/**
 * Created by Vishal on 27-12-2015.
 */
public class Location {
    String lat,lng;

    public Location(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
