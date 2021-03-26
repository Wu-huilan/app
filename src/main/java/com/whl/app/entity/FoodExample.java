package com.whl.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("food_name =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("food_name >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("food_name <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("food_name like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("food_name not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("food_name in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdIsNull() {
            addCriterion("food_classification_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdIsNotNull() {
            addCriterion("food_classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdEqualTo(Integer value) {
            addCriterion("food_classification_id =", value, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdNotEqualTo(Integer value) {
            addCriterion("food_classification_id <>", value, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdGreaterThan(Integer value) {
            addCriterion("food_classification_id >", value, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_classification_id >=", value, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdLessThan(Integer value) {
            addCriterion("food_classification_id <", value, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_classification_id <=", value, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdIn(List<Integer> values) {
            addCriterion("food_classification_id in", values, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdNotIn(List<Integer> values) {
            addCriterion("food_classification_id not in", values, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdBetween(Integer value1, Integer value2) {
            addCriterion("food_classification_id between", value1, value2, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodClassificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_classification_id not between", value1, value2, "foodClassificationId");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNull() {
            addCriterion("food_price is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("food_price is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(Double value) {
            addCriterion("food_price =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(Double value) {
            addCriterion("food_price <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(Double value) {
            addCriterion("food_price >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("food_price >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(Double value) {
            addCriterion("food_price <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(Double value) {
            addCriterion("food_price <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<Double> values) {
            addCriterion("food_price in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<Double> values) {
            addCriterion("food_price not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(Double value1, Double value2) {
            addCriterion("food_price between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(Double value1, Double value2) {
            addCriterion("food_price not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodImgIsNull() {
            addCriterion("food_img is null");
            return (Criteria) this;
        }

        public Criteria andFoodImgIsNotNull() {
            addCriterion("food_img is not null");
            return (Criteria) this;
        }

        public Criteria andFoodImgEqualTo(String value) {
            addCriterion("food_img =", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgNotEqualTo(String value) {
            addCriterion("food_img <>", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgGreaterThan(String value) {
            addCriterion("food_img >", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgGreaterThanOrEqualTo(String value) {
            addCriterion("food_img >=", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgLessThan(String value) {
            addCriterion("food_img <", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgLessThanOrEqualTo(String value) {
            addCriterion("food_img <=", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgLike(String value) {
            addCriterion("food_img like", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgNotLike(String value) {
            addCriterion("food_img not like", value, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgIn(List<String> values) {
            addCriterion("food_img in", values, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgNotIn(List<String> values) {
            addCriterion("food_img not in", values, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgBetween(String value1, String value2) {
            addCriterion("food_img between", value1, value2, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodImgNotBetween(String value1, String value2) {
            addCriterion("food_img not between", value1, value2, "foodImg");
            return (Criteria) this;
        }

        public Criteria andFoodDescIsNull() {
            addCriterion("food_desc is null");
            return (Criteria) this;
        }

        public Criteria andFoodDescIsNotNull() {
            addCriterion("food_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFoodDescEqualTo(String value) {
            addCriterion("food_desc =", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescNotEqualTo(String value) {
            addCriterion("food_desc <>", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescGreaterThan(String value) {
            addCriterion("food_desc >", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescGreaterThanOrEqualTo(String value) {
            addCriterion("food_desc >=", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescLessThan(String value) {
            addCriterion("food_desc <", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescLessThanOrEqualTo(String value) {
            addCriterion("food_desc <=", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescLike(String value) {
            addCriterion("food_desc like", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescNotLike(String value) {
            addCriterion("food_desc not like", value, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescIn(List<String> values) {
            addCriterion("food_desc in", values, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescNotIn(List<String> values) {
            addCriterion("food_desc not in", values, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescBetween(String value1, String value2) {
            addCriterion("food_desc between", value1, value2, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodDescNotBetween(String value1, String value2) {
            addCriterion("food_desc not between", value1, value2, "foodDesc");
            return (Criteria) this;
        }

        public Criteria andFoodStatusIsNull() {
            addCriterion("food_status is null");
            return (Criteria) this;
        }

        public Criteria andFoodStatusIsNotNull() {
            addCriterion("food_status is not null");
            return (Criteria) this;
        }

        public Criteria andFoodStatusEqualTo(Integer value) {
            addCriterion("food_status =", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusNotEqualTo(Integer value) {
            addCriterion("food_status <>", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusGreaterThan(Integer value) {
            addCriterion("food_status >", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_status >=", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusLessThan(Integer value) {
            addCriterion("food_status <", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusLessThanOrEqualTo(Integer value) {
            addCriterion("food_status <=", value, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusIn(List<Integer> values) {
            addCriterion("food_status in", values, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusNotIn(List<Integer> values) {
            addCriterion("food_status not in", values, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusBetween(Integer value1, Integer value2) {
            addCriterion("food_status between", value1, value2, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("food_status not between", value1, value2, "foodStatus");
            return (Criteria) this;
        }

        public Criteria andFoodStoreIsNull() {
            addCriterion("food_store is null");
            return (Criteria) this;
        }

        public Criteria andFoodStoreIsNotNull() {
            addCriterion("food_store is not null");
            return (Criteria) this;
        }

        public Criteria andFoodStoreEqualTo(Integer value) {
            addCriterion("food_store =", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreNotEqualTo(Integer value) {
            addCriterion("food_store <>", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreGreaterThan(Integer value) {
            addCriterion("food_store >", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_store >=", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreLessThan(Integer value) {
            addCriterion("food_store <", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreLessThanOrEqualTo(Integer value) {
            addCriterion("food_store <=", value, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreIn(List<Integer> values) {
            addCriterion("food_store in", values, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreNotIn(List<Integer> values) {
            addCriterion("food_store not in", values, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreBetween(Integer value1, Integer value2) {
            addCriterion("food_store between", value1, value2, "foodStore");
            return (Criteria) this;
        }

        public Criteria andFoodStoreNotBetween(Integer value1, Integer value2) {
            addCriterion("food_store not between", value1, value2, "foodStore");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}