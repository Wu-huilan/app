package com.whl.app.entity;

import java.util.List;

public class FoodSpecification {
    private Integer foodSpecificationId;

    private String foodSpecificationName;

    private Integer foodId;

    private Integer priority;

    private List<FoodSpecificationDetail> foodSpecificationDetails;

    public List<FoodSpecificationDetail> getFoodSpecificationDetails() {
        return foodSpecificationDetails;
    }

    public void setFoodSpecificationDetails(List<FoodSpecificationDetail> foodSpecificationDetails) {
        this.foodSpecificationDetails = foodSpecificationDetails;
    }

    public Integer getFoodSpecificationId() {
        return foodSpecificationId;
    }

    public void setFoodSpecificationId(Integer foodSpecificationId) {
        this.foodSpecificationId = foodSpecificationId;
    }

    public String getFoodSpecificationName() {
        return foodSpecificationName;
    }

    public void setFoodSpecificationName(String foodSpecificationName) {
        this.foodSpecificationName = foodSpecificationName == null ? null : foodSpecificationName.trim();
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "FoodSpecification{" +
                "foodSpecificationId=" + foodSpecificationId +
                ", foodSpecificationName='" + foodSpecificationName + '\'' +
                ", foodId=" + foodId +
                ", priority=" + priority +
                ", foodSpecificationDetails=" + foodSpecificationDetails +
                '}';
    }
}