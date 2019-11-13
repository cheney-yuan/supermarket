package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductBackExample() {
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

        public Criteria andPbIdIsNull() {
            addCriterion("pb_id is null");
            return (Criteria) this;
        }

        public Criteria andPbIdIsNotNull() {
            addCriterion("pb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPbIdEqualTo(String value) {
            addCriterion("pb_id =", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotEqualTo(String value) {
            addCriterion("pb_id <>", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThan(String value) {
            addCriterion("pb_id >", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThanOrEqualTo(String value) {
            addCriterion("pb_id >=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThan(String value) {
            addCriterion("pb_id <", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThanOrEqualTo(String value) {
            addCriterion("pb_id <=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLike(String value) {
            addCriterion("pb_id like", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotLike(String value) {
            addCriterion("pb_id not like", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdIn(List<String> values) {
            addCriterion("pb_id in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotIn(List<String> values) {
            addCriterion("pb_id not in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdBetween(String value1, String value2) {
            addCriterion("pb_id between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotBetween(String value1, String value2) {
            addCriterion("pb_id not between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceIsNull() {
            addCriterion("pb_allprice is null");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceIsNotNull() {
            addCriterion("pb_allprice is not null");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceEqualTo(Double value) {
            addCriterion("pb_allprice =", value, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceNotEqualTo(Double value) {
            addCriterion("pb_allprice <>", value, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceGreaterThan(Double value) {
            addCriterion("pb_allprice >", value, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pb_allprice >=", value, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceLessThan(Double value) {
            addCriterion("pb_allprice <", value, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceLessThanOrEqualTo(Double value) {
            addCriterion("pb_allprice <=", value, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceIn(List<Double> values) {
            addCriterion("pb_allprice in", values, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceNotIn(List<Double> values) {
            addCriterion("pb_allprice not in", values, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceBetween(Double value1, Double value2) {
            addCriterion("pb_allprice between", value1, value2, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbAllpriceNotBetween(Double value1, Double value2) {
            addCriterion("pb_allprice not between", value1, value2, "pbAllprice");
            return (Criteria) this;
        }

        public Criteria andPbDateIsNull() {
            addCriterion("pb_date is null");
            return (Criteria) this;
        }

        public Criteria andPbDateIsNotNull() {
            addCriterion("pb_date is not null");
            return (Criteria) this;
        }

        public Criteria andPbDateEqualTo(Date value) {
            addCriterion("pb_date =", value, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateNotEqualTo(Date value) {
            addCriterion("pb_date <>", value, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateGreaterThan(Date value) {
            addCriterion("pb_date >", value, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pb_date >=", value, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateLessThan(Date value) {
            addCriterion("pb_date <", value, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateLessThanOrEqualTo(Date value) {
            addCriterion("pb_date <=", value, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateIn(List<Date> values) {
            addCriterion("pb_date in", values, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateNotIn(List<Date> values) {
            addCriterion("pb_date not in", values, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateBetween(Date value1, Date value2) {
            addCriterion("pb_date between", value1, value2, "pbDate");
            return (Criteria) this;
        }

        public Criteria andPbDateNotBetween(Date value1, Date value2) {
            addCriterion("pb_date not between", value1, value2, "pbDate");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
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