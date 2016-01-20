package com.vishu.androiddagger2example.data.model;

/**
 * Created by Vishal on 29-12-2015.
 */
public class List
{
    private String[] categoryid;

    private String[] category;

    private String measure;

    private String product_id;

    private String name;

    private String mrp;

    private String brand;

    private String image;

    private String store_id;

    private int count;

    public List(String product_id, String mrp, String store_id, String image, String measure, String brand, String name) {
        this.measure = measure;
        this.product_id = product_id;
        this.name = name;
        this.mrp = mrp;
        this.brand = brand;
        this.image = image;
        this.store_id = store_id;
        this.count = 0;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    public String[] getCategoryid ()
    {
        return categoryid;
    }

    public void setCategoryid (String[] categoryid)
    {
        this.categoryid = categoryid;
    }

    public String[] getCategory ()
    {
        return category;
    }

    public void setCategory (String[] category)
    {
        this.category = category;
    }

    public String getMeasure ()
    {
        return measure;
    }

    public void setMeasure (String measure)
    {
        this.measure = measure;
    }

    public String getProduct_id ()
    {
        return product_id;
    }

    public void setProduct_id (String product_id)
    {
        this.product_id = product_id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getMrp ()
    {
        return mrp;
    }

    public void setMrp (String mrp)
    {
        this.mrp = mrp;
    }

    public String getBrand ()
    {
        return brand;
    }

    public void setBrand (String brand)
    {
        this.brand = brand;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getStore_id ()
    {
        return store_id;
    }

    public void setStore_id (String store_id)
    {
        this.store_id = store_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [categoryid = "+categoryid+", category = "+category+", measure = "+measure+", product_id = "+product_id+", name = "+name+", mrp = "+mrp+", brand = "+brand+", image = "+image+", store_id = "+store_id+"]";
    }
}
