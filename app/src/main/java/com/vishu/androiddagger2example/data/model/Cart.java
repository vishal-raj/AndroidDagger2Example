package com.vishu.androiddagger2example.data.model;

/**
 * Created by User on 23-10-2015.
 */
public class Cart {
    String productId, storeId, quantity, totalPrice;

    public Cart(){}

    public Cart(String productId, String storeId, String quantity, String totalPrice) {
        this.productId = productId;
        this.storeId = storeId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
