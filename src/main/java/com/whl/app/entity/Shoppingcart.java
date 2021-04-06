package com.whl.app.entity;

public class Shoppingcart {
    private Integer shoppingcartId;

    private Integer foodId;

    private String openId;

    private Integer count;

    private String foodspecificationids;

    private String foodspecificationnames;

    private Double foodPrice;

    private String foodName;

    public Integer getShoppingcartId() {
        return shoppingcartId;
    }

    public void setShoppingcartId(Integer shoppingcartId) {
        this.shoppingcartId = shoppingcartId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getFoodspecificationids() {
        return foodspecificationids;
    }

    public void setFoodspecificationids(String foodspecificationids) {
        this.foodspecificationids = foodspecificationids == null ? null : foodspecificationids.trim();
    }

    public String getFoodspecificationnames() {
        return foodspecificationnames;
    }

    public void setFoodspecificationnames(String foodspecificationnames) {
        this.foodspecificationnames = foodspecificationnames == null ? null : foodspecificationnames.trim();
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "Shoppingcart{" +
                "shoppingcartId=" + shoppingcartId +
                ", foodId=" + foodId +
                ", openId='" + openId + '\'' +
                ", count=" + count +
                ", foodspecificationids='" + foodspecificationids + '\'' +
                ", foodspecificationnames='" + foodspecificationnames + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodName='" + foodName + '\'' +
                '}';
    }
}