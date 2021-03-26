package com.whl.app.entity;

import java.util.ArrayList;
import java.util.List;

public class FoodSpecificationDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodSpecificationDetailExample() {
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

        public Criteria andFoodSpecificationDetailIdIsNull() {
            addCriterion("food_specification_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdIsNotNull() {
            addCriterion("food_specification_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdEqualTo(Integer value) {
            addCriterion("food_specification_detail_id =", value, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdNotEqualTo(Integer value) {
            addCriterion("food_specification_detail_id <>", value, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdGreaterThan(Integer value) {
            addCriterion("food_specification_detail_id >", value, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_specification_detail_id >=", value, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdLessThan(Integer value) {
            addCriterion("food_specification_detail_id <", value, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_specification_detail_id <=", value, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdIn(List<Integer> values) {
            addCriterion("food_specification_detail_id in", values, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdNotIn(List<Integer> values) {
            addCriterion("food_specification_detail_id not in", values, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("food_specification_detail_id between", value1, value2, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_specification_detail_id not between", value1, value2, "foodSpecificationDetailId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdIsNull() {
            addCriterion("food_specification_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdIsNotNull() {
            addCriterion("food_specification_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdEqualTo(Integer value) {
            addCriterion("food_specification_id =", value, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdNotEqualTo(Integer value) {
            addCriterion("food_specification_id <>", value, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdGreaterThan(Integer value) {
            addCriterion("food_specification_id >", value, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_specification_id >=", value, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdLessThan(Integer value) {
            addCriterion("food_specification_id <", value, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_specification_id <=", value, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdIn(List<Integer> values) {
            addCriterion("food_specification_id in", values, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdNotIn(List<Integer> values) {
            addCriterion("food_specification_id not in", values, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdBetween(Integer value1, Integer value2) {
            addCriterion("food_specification_id between", value1, value2, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_specification_id not between", value1, value2, "foodSpecificationId");
            return (Criteria) this;
        }

        public Criteria andExtraPriceIsNull() {
            addCriterion("extra_price is null");
            return (Criteria) this;
        }

        public Criteria andExtraPriceIsNotNull() {
            addCriterion("extra_price is not null");
            return (Criteria) this;
        }

        public Criteria andExtraPriceEqualTo(Double value) {
            addCriterion("extra_price =", value, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceNotEqualTo(Double value) {
            addCriterion("extra_price <>", value, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceGreaterThan(Double value) {
            addCriterion("extra_price >", value, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("extra_price >=", value, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceLessThan(Double value) {
            addCriterion("extra_price <", value, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceLessThanOrEqualTo(Double value) {
            addCriterion("extra_price <=", value, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceIn(List<Double> values) {
            addCriterion("extra_price in", values, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceNotIn(List<Double> values) {
            addCriterion("extra_price not in", values, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceBetween(Double value1, Double value2) {
            addCriterion("extra_price between", value1, value2, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andExtraPriceNotBetween(Double value1, Double value2) {
            addCriterion("extra_price not between", value1, value2, "extraPrice");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameIsNull() {
            addCriterion("food_specification_detail_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameIsNotNull() {
            addCriterion("food_specification_detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameEqualTo(String value) {
            addCriterion("food_specification_detail_name =", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameNotEqualTo(String value) {
            addCriterion("food_specification_detail_name <>", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameGreaterThan(String value) {
            addCriterion("food_specification_detail_name >", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_specification_detail_name >=", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameLessThan(String value) {
            addCriterion("food_specification_detail_name <", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameLessThanOrEqualTo(String value) {
            addCriterion("food_specification_detail_name <=", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameLike(String value) {
            addCriterion("food_specification_detail_name like", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameNotLike(String value) {
            addCriterion("food_specification_detail_name not like", value, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameIn(List<String> values) {
            addCriterion("food_specification_detail_name in", values, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameNotIn(List<String> values) {
            addCriterion("food_specification_detail_name not in", values, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameBetween(String value1, String value2) {
            addCriterion("food_specification_detail_name between", value1, value2, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andFoodSpecificationDetailNameNotBetween(String value1, String value2) {
            addCriterion("food_specification_detail_name not between", value1, value2, "foodSpecificationDetailName");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
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