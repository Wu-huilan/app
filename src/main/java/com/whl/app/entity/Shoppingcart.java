package com.whl.app.entity;

public class Shoppingcart {
    private Integer shppingcartId;

    private Integer foodId;

    private String openId;

    private Integer count;

    private String foodspecificationids;

    private Double foodPrice;

    private String foodName;

    public Integer getShppingcartId() {
        return shppingcartId;
    }

    public void setShppingcartId(Integer shppingcartId) {
        this.shppingcartId = shppingcartId;
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
                "shppingcartId=" + shppingcartId +
                ", foodId=" + foodId +
                ", openId='" + openId + '\'' +
                ", count=" + count +
                ", foodspecificationids='" + foodspecificationids + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}