package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffHomeIsNull() {
            addCriterion("staff_home is null");
            return (Criteria) this;
        }

        public Criteria andStaffHomeIsNotNull() {
            addCriterion("staff_home is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHomeEqualTo(String value) {
            addCriterion("staff_home =", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeNotEqualTo(String value) {
            addCriterion("staff_home <>", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeGreaterThan(String value) {
            addCriterion("staff_home >", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_home >=", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeLessThan(String value) {
            addCriterion("staff_home <", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeLessThanOrEqualTo(String value) {
            addCriterion("staff_home <=", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeLike(String value) {
            addCriterion("staff_home like", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeNotLike(String value) {
            addCriterion("staff_home not like", value, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeIn(List<String> values) {
            addCriterion("staff_home in", values, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeNotIn(List<String> values) {
            addCriterion("staff_home not in", values, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeBetween(String value1, String value2) {
            addCriterion("staff_home between", value1, value2, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffHomeNotBetween(String value1, String value2) {
            addCriterion("staff_home not between", value1, value2, "staffHome");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaIsNull() {
            addCriterion("staff_diploma is null");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaIsNotNull() {
            addCriterion("staff_diploma is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaEqualTo(String value) {
            addCriterion("staff_diploma =", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaNotEqualTo(String value) {
            addCriterion("staff_diploma <>", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaGreaterThan(String value) {
            addCriterion("staff_diploma >", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("staff_diploma >=", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaLessThan(String value) {
            addCriterion("staff_diploma <", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaLessThanOrEqualTo(String value) {
            addCriterion("staff_diploma <=", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaLike(String value) {
            addCriterion("staff_diploma like", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaNotLike(String value) {
            addCriterion("staff_diploma not like", value, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaIn(List<String> values) {
            addCriterion("staff_diploma in", values, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaNotIn(List<String> values) {
            addCriterion("staff_diploma not in", values, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaBetween(String value1, String value2) {
            addCriterion("staff_diploma between", value1, value2, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffDiplomaNotBetween(String value1, String value2) {
            addCriterion("staff_diploma not between", value1, value2, "staffDiploma");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsNull() {
            addCriterion("staff_salary is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsNotNull() {
            addCriterion("staff_salary is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryEqualTo(Double value) {
            addCriterion("staff_salary =", value, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryNotEqualTo(Double value) {
            addCriterion("staff_salary <>", value, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryGreaterThan(Double value) {
            addCriterion("staff_salary >", value, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("staff_salary >=", value, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryLessThan(Double value) {
            addCriterion("staff_salary <", value, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryLessThanOrEqualTo(Double value) {
            addCriterion("staff_salary <=", value, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIn(List<Double> values) {
            addCriterion("staff_salary in", values, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryNotIn(List<Double> values) {
            addCriterion("staff_salary not in", values, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryBetween(Double value1, Double value2) {
            addCriterion("staff_salary between", value1, value2, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryNotBetween(Double value1, Double value2) {
            addCriterion("staff_salary not between", value1, value2, "staffSalary");
            return (Criteria) this;
        }

        public Criteria andStaffDutyIsNull() {
            addCriterion("staff_duty is null");
            return (Criteria) this;
        }

        public Criteria andStaffDutyIsNotNull() {
            addCriterion("staff_duty is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDutyEqualTo(String value) {
            addCriterion("staff_duty =", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyNotEqualTo(String value) {
            addCriterion("staff_duty <>", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyGreaterThan(String value) {
            addCriterion("staff_duty >", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyGreaterThanOrEqualTo(String value) {
            addCriterion("staff_duty >=", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyLessThan(String value) {
            addCriterion("staff_duty <", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyLessThanOrEqualTo(String value) {
            addCriterion("staff_duty <=", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyLike(String value) {
            addCriterion("staff_duty like", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyNotLike(String value) {
            addCriterion("staff_duty not like", value, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyIn(List<String> values) {
            addCriterion("staff_duty in", values, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyNotIn(List<String> values) {
            addCriterion("staff_duty not in", values, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyBetween(String value1, String value2) {
            addCriterion("staff_duty between", value1, value2, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffDutyNotBetween(String value1, String value2) {
            addCriterion("staff_duty not between", value1, value2, "staffDuty");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNull() {
            addCriterion("staff_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNotNull() {
            addCriterion("staff_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneEqualTo(String value) {
            addCriterion("staff_phone =", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotEqualTo(String value) {
            addCriterion("staff_phone <>", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThan(String value) {
            addCriterion("staff_phone >", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_phone >=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThan(String value) {
            addCriterion("staff_phone <", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_phone <=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLike(String value) {
            addCriterion("staff_phone like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotLike(String value) {
            addCriterion("staff_phone not like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIn(List<String> values) {
            addCriterion("staff_phone in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotIn(List<String> values) {
            addCriterion("staff_phone not in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneBetween(String value1, String value2) {
            addCriterion("staff_phone between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotBetween(String value1, String value2) {
            addCriterion("staff_phone not between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNull() {
            addCriterion("staff_address is null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNotNull() {
            addCriterion("staff_address is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressEqualTo(String value) {
            addCriterion("staff_address =", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotEqualTo(String value) {
            addCriterion("staff_address <>", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThan(String value) {
            addCriterion("staff_address >", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_address >=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThan(String value) {
            addCriterion("staff_address <", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThanOrEqualTo(String value) {
            addCriterion("staff_address <=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLike(String value) {
            addCriterion("staff_address like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotLike(String value) {
            addCriterion("staff_address not like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIn(List<String> values) {
            addCriterion("staff_address in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotIn(List<String> values) {
            addCriterion("staff_address not in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressBetween(String value1, String value2) {
            addCriterion("staff_address between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotBetween(String value1, String value2) {
            addCriterion("staff_address not between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIsNull() {
            addCriterion("staff_idcard is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIsNotNull() {
            addCriterion("staff_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardEqualTo(String value) {
            addCriterion("staff_idcard =", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotEqualTo(String value) {
            addCriterion("staff_idcard <>", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardGreaterThan(String value) {
            addCriterion("staff_idcard >", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("staff_idcard >=", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLessThan(String value) {
            addCriterion("staff_idcard <", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLessThanOrEqualTo(String value) {
            addCriterion("staff_idcard <=", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardLike(String value) {
            addCriterion("staff_idcard like", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotLike(String value) {
            addCriterion("staff_idcard not like", value, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardIn(List<String> values) {
            addCriterion("staff_idcard in", values, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotIn(List<String> values) {
            addCriterion("staff_idcard not in", values, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardBetween(String value1, String value2) {
            addCriterion("staff_idcard between", value1, value2, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffIdcardNotBetween(String value1, String value2) {
            addCriterion("staff_idcard not between", value1, value2, "staffIdcard");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateIsNull() {
            addCriterion("staff_hiredate is null");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateIsNotNull() {
            addCriterion("staff_hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateEqualTo(Date value) {
            addCriterion("staff_hiredate =", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateNotEqualTo(Date value) {
            addCriterion("staff_hiredate <>", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateGreaterThan(Date value) {
            addCriterion("staff_hiredate >", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_hiredate >=", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateLessThan(Date value) {
            addCriterion("staff_hiredate <", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateLessThanOrEqualTo(Date value) {
            addCriterion("staff_hiredate <=", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateIn(List<Date> values) {
            addCriterion("staff_hiredate in", values, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateNotIn(List<Date> values) {
            addCriterion("staff_hiredate not in", values, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateBetween(Date value1, Date value2) {
            addCriterion("staff_hiredate between", value1, value2, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateNotBetween(Date value1, Date value2) {
            addCriterion("staff_hiredate not between", value1, value2, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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