package com.whl.app.entity;

public class FoodSpecificationDetail {
    private Integer foodSpecificationDetailId;

    private Integer foodSpecificationId;

    private Double extraPrice;

    private String foodSpecificationDetailName;

    private Integer priority;

    public Integer getFoodSpecificationDetailId() {
        return foodSpecificationDetailId;
    }

    public void setFoodSpecificationDetailId(Integer foodSpecificationDetailId) {
        this.foodSpecificationDetailId = foodSpecificationDetailId;
    }

    public Integer getFoodSpecificationId() {
        return foodSpecificationId;
    }

    public void setFoodSpecificationId(Integer foodSpecificationId) {
        this.foodSpecificationId = foodSpecificationId;
    }

    public Double getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(Double extraPrice) {
        this.extraPrice = extraPrice;
    }

    public String getFoodSpecificationDetailName() {
        return foodSpecificationDetailName;
    }

    public void setFoodSpecificationDetailName(String foodSpecificationDetailName) {
        this.foodSpecificationDetailName = foodSpecificationDetailName == null ? null : foodSpecificationDetailName.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "FoodSpecificationDetail{" +
                "foodSpecificationDetailId=" + foodSpecificationDetailId +
                ", foodSpecificationId=" + foodSpecificationId +
                ", extraPrice=" + extraPrice +
                ", foodSpecificationDetailName='" + foodSpecificationDetailName + '\'' +
                ", priority=" + priority +
                '}';
    }
}