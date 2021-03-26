package com.whl.app.entity;

import java.util.Date;
import java.util.List;

public class FoodClassification {
    private Integer foodClassificationId;

    private String foodClassificationName;

    private String foodClassificationImg;

    private Integer priority;

    private Date createTime;

    private List<Food> foodList;

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public Integer getFoodClassificationId() {
        return foodClassificationId;
    }

    public void setFoodClassificationId(Integer foodClassificationId) {
        this.foodClassificationId = foodClassificationId;
    }

    public String getFoodClassificationName() {
        return foodClassificationName;
    }

    public void setFoodClassificationName(String foodClassificationName) {
        this.foodClassificationName = foodClassificationName == null ? null : foodClassificationName.trim();
    }

    public String getFoodClassificationImg() {
        return foodClassificationImg;
    }

    public void setFoodClassificationImg(String foodClassificationImg) {
        this.foodClassificationImg = foodClassificationImg == null ? null : foodClassificationImg.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FoodClassification{" +
                "foodClassificationId=" + foodClassificationId +
                ", foodClassificationName='" + foodClassificationName + '\'' +
                ", foodClassificationImg='" + foodClassificationImg + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", foodList=" + foodList +
                '}';
    }
}