package com.whl.app.entity;

import java.util.Date;

public class Food {
    private Integer foodId;

    private String foodName;

    private Integer foodClassificationId;

    private Double foodPrice;

    private String foodImg;

    private String foodDesc;

    private Integer foodStatus;

    private Integer foodStore;

    private Date createTime;

    private Date updateTime;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public Integer getFoodClassificationId() {
        return foodClassificationId;
    }

    public void setFoodClassificationId(Integer foodClassificationId) {
        this.foodClassificationId = foodClassificationId;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg == null ? null : foodImg.trim();
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc == null ? null : foodDesc.trim();
    }

    public Integer getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(Integer foodStatus) {
        this.foodStatus = foodStatus;
    }

    public Integer getFoodStore() {
        return foodStore;
    }

    public void setFoodStore(Integer foodStore) {
        this.foodStore = foodStore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}