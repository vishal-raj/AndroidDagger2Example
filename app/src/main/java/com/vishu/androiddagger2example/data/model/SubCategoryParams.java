package com.vishu.androiddagger2example.data.model;

/**
 * Created by Vishal on 29-12-2015.
 */
public class SubCategoryParams {
    String city_id, zone_id, category;

    public SubCategoryParams(String city_id, String zone_id, String category) {
        this.city_id = city_id;
        this.zone_id = zone_id;
        this.category = category;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getZone_id() {
        return zone_id;
    }

    public void setZone_id(String zone_id) {
        this.zone_id = zone_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
