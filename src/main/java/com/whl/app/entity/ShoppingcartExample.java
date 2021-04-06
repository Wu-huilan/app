package com.whl.app.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingcartExample() {
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

        public Criteria andShoppingcartIdIsNull() {
            addCriterion("shoppingCart_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdIsNotNull() {
            addCriterion("shoppingCart_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdEqualTo(Integer value) {
            addCriterion("shoppingCart_id =", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdNotEqualTo(Integer value) {
            addCriterion("shoppingCart_id <>", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdGreaterThan(Integer value) {
            addCriterion("shoppingCart_id >", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingCart_id >=", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdLessThan(Integer value) {
            addCriterion("shoppingCart_id <", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingCart_id <=", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdIn(List<Integer> values) {
            addCriterion("shoppingCart_id in", values, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdNotIn(List<Integer> values) {
            addCriterion("shoppingCart_id not in", values, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdBetween(Integer value1, Integer value2) {
            addCriterion("shoppingCart_id between", value1, value2, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingCart_id not between", value1, value2, "shoppingcartId");
            return (Criteria) this;
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

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsIsNull() {
            addCriterion("foodSpecificationIds is null");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsIsNotNull() {
            addCriterion("foodSpecificationIds is not null");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsEqualTo(String value) {
            addCriterion("foodSpecificationIds =", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsNotEqualTo(String value) {
            addCriterion("foodSpecificationIds <>", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsGreaterThan(String value) {
            addCriterion("foodSpecificationIds >", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsGreaterThanOrEqualTo(String value) {
            addCriterion("foodSpecificationIds >=", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsLessThan(String value) {
            addCriterion("foodSpecificationIds <", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsLessThanOrEqualTo(String value) {
            addCriterion("foodSpecificationIds <=", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsLike(String value) {
            addCriterion("foodSpecificationIds like", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsNotLike(String value) {
            addCriterion("foodSpecificationIds not like", value, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsIn(List<String> values) {
            addCriterion("foodSpecificationIds in", values, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsNotIn(List<String> values) {
            addCriterion("foodSpecificationIds not in", values, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsBetween(String value1, String value2) {
            addCriterion("foodSpecificationIds between", value1, value2, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationidsNotBetween(String value1, String value2) {
            addCriterion("foodSpecificationIds not between", value1, value2, "foodspecificationids");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesIsNull() {
            addCriterion("foodSpecificationNames is null");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesIsNotNull() {
            addCriterion("foodSpecificationNames is not null");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesEqualTo(String value) {
            addCriterion("foodSpecificationNames =", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesNotEqualTo(String value) {
            addCriterion("foodSpecificationNames <>", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesGreaterThan(String value) {
            addCriterion("foodSpecificationNames >", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesGreaterThanOrEqualTo(String value) {
            addCriterion("foodSpecificationNames >=", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesLessThan(String value) {
            addCriterion("foodSpecificationNames <", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesLessThanOrEqualTo(String value) {
            addCriterion("foodSpecificationNames <=", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesLike(String value) {
            addCriterion("foodSpecificationNames like", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesNotLike(String value) {
            addCriterion("foodSpecificationNames not like", value, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesIn(List<String> values) {
            addCriterion("foodSpecificationNames in", values, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesNotIn(List<String> values) {
            addCriterion("foodSpecificationNames not in", values, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesBetween(String value1, String value2) {
            addCriterion("foodSpecificationNames between", value1, value2, "foodspecificationnames");
            return (Criteria) this;
        }

        public Criteria andFoodspecificationnamesNotBetween(String value1, String value2) {
            addCriterion("foodSpecificationNames not between", value1, value2, "foodspecificationnames");
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