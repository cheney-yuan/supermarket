package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInExample() {
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

        public Criteria andPiIdIsNull() {
            addCriterion("pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPiIdIsNotNull() {
            addCriterion("pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiIdEqualTo(String value) {
            addCriterion("pi_id =", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotEqualTo(String value) {
            addCriterion("pi_id <>", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThan(String value) {
            addCriterion("pi_id >", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThanOrEqualTo(String value) {
            addCriterion("pi_id >=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThan(String value) {
            addCriterion("pi_id <", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThanOrEqualTo(String value) {
            addCriterion("pi_id <=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLike(String value) {
            addCriterion("pi_id like", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotLike(String value) {
            addCriterion("pi_id not like", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdIn(List<String> values) {
            addCriterion("pi_id in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotIn(List<String> values) {
            addCriterion("pi_id not in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdBetween(String value1, String value2) {
            addCriterion("pi_id between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotBetween(String value1, String value2) {
            addCriterion("pi_id not between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiDateIsNull() {
            addCriterion("pi_date is null");
            return (Criteria) this;
        }

        public Criteria andPiDateIsNotNull() {
            addCriterion("pi_date is not null");
            return (Criteria) this;
        }

        public Criteria andPiDateEqualTo(Date value) {
            addCriterion("pi_date =", value, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateNotEqualTo(Date value) {
            addCriterion("pi_date <>", value, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateGreaterThan(Date value) {
            addCriterion("pi_date >", value, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_date >=", value, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateLessThan(Date value) {
            addCriterion("pi_date <", value, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateLessThanOrEqualTo(Date value) {
            addCriterion("pi_date <=", value, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateIn(List<Date> values) {
            addCriterion("pi_date in", values, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateNotIn(List<Date> values) {
            addCriterion("pi_date not in", values, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateBetween(Date value1, Date value2) {
            addCriterion("pi_date between", value1, value2, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiDateNotBetween(Date value1, Date value2) {
            addCriterion("pi_date not between", value1, value2, "piDate");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceIsNull() {
            addCriterion("pi_allprice is null");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceIsNotNull() {
            addCriterion("pi_allprice is not null");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceEqualTo(Double value) {
            addCriterion("pi_allprice =", value, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceNotEqualTo(Double value) {
            addCriterion("pi_allprice <>", value, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceGreaterThan(Double value) {
            addCriterion("pi_allprice >", value, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pi_allprice >=", value, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceLessThan(Double value) {
            addCriterion("pi_allprice <", value, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceLessThanOrEqualTo(Double value) {
            addCriterion("pi_allprice <=", value, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceIn(List<Double> values) {
            addCriterion("pi_allprice in", values, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceNotIn(List<Double> values) {
            addCriterion("pi_allprice not in", values, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceBetween(Double value1, Double value2) {
            addCriterion("pi_allprice between", value1, value2, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiAllpriceNotBetween(Double value1, Double value2) {
            addCriterion("pi_allprice not between", value1, value2, "piAllprice");
            return (Criteria) this;
        }

        public Criteria andPiPaywayIsNull() {
            addCriterion("pi_payway is null");
            return (Criteria) this;
        }

        public Criteria andPiPaywayIsNotNull() {
            addCriterion("pi_payway is not null");
            return (Criteria) this;
        }

        public Criteria andPiPaywayEqualTo(String value) {
            addCriterion("pi_payway =", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayNotEqualTo(String value) {
            addCriterion("pi_payway <>", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayGreaterThan(String value) {
            addCriterion("pi_payway >", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("pi_payway >=", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayLessThan(String value) {
            addCriterion("pi_payway <", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayLessThanOrEqualTo(String value) {
            addCriterion("pi_payway <=", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayLike(String value) {
            addCriterion("pi_payway like", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayNotLike(String value) {
            addCriterion("pi_payway not like", value, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayIn(List<String> values) {
            addCriterion("pi_payway in", values, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayNotIn(List<String> values) {
            addCriterion("pi_payway not in", values, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayBetween(String value1, String value2) {
            addCriterion("pi_payway between", value1, value2, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPaywayNotBetween(String value1, String value2) {
            addCriterion("pi_payway not between", value1, value2, "piPayway");
            return (Criteria) this;
        }

        public Criteria andPiPayIsNull() {
            addCriterion("pi_Pay is null");
            return (Criteria) this;
        }

        public Criteria andPiPayIsNotNull() {
            addCriterion("pi_Pay is not null");
            return (Criteria) this;
        }

        public Criteria andPiPayEqualTo(String value) {
            addCriterion("pi_Pay =", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayNotEqualTo(String value) {
            addCriterion("pi_Pay <>", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayGreaterThan(String value) {
            addCriterion("pi_Pay >", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayGreaterThanOrEqualTo(String value) {
            addCriterion("pi_Pay >=", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayLessThan(String value) {
            addCriterion("pi_Pay <", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayLessThanOrEqualTo(String value) {
            addCriterion("pi_Pay <=", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayLike(String value) {
            addCriterion("pi_Pay like", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayNotLike(String value) {
            addCriterion("pi_Pay not like", value, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayIn(List<String> values) {
            addCriterion("pi_Pay in", values, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayNotIn(List<String> values) {
            addCriterion("pi_Pay not in", values, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayBetween(String value1, String value2) {
            addCriterion("pi_Pay between", value1, value2, "piPay");
            return (Criteria) this;
        }

        public Criteria andPiPayNotBetween(String value1, String value2) {
            addCriterion("pi_Pay not between", value1, value2, "piPay");
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