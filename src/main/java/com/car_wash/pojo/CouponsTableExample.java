package com.car_wash.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponsTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponsTableExample() {
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

        public Criteria andCouponsIdIsNull() {
            addCriterion("coupons_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponsIdIsNotNull() {
            addCriterion("coupons_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsIdEqualTo(Integer value) {
            addCriterion("coupons_id =", value, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdNotEqualTo(Integer value) {
            addCriterion("coupons_id <>", value, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdGreaterThan(Integer value) {
            addCriterion("coupons_id >", value, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupons_id >=", value, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdLessThan(Integer value) {
            addCriterion("coupons_id <", value, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupons_id <=", value, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdIn(List<Integer> values) {
            addCriterion("coupons_id in", values, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdNotIn(List<Integer> values) {
            addCriterion("coupons_id not in", values, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdBetween(Integer value1, Integer value2) {
            addCriterion("coupons_id between", value1, value2, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupons_id not between", value1, value2, "couponsId");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIsNull() {
            addCriterion("coupons_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIsNotNull() {
            addCriterion("coupons_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeEqualTo(String value) {
            addCriterion("coupons_type =", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotEqualTo(String value) {
            addCriterion("coupons_type <>", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeGreaterThan(String value) {
            addCriterion("coupons_type >", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coupons_type >=", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLessThan(String value) {
            addCriterion("coupons_type <", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLessThanOrEqualTo(String value) {
            addCriterion("coupons_type <=", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLike(String value) {
            addCriterion("coupons_type like", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotLike(String value) {
            addCriterion("coupons_type not like", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIn(List<String> values) {
            addCriterion("coupons_type in", values, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotIn(List<String> values) {
            addCriterion("coupons_type not in", values, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeBetween(String value1, String value2) {
            addCriterion("coupons_type between", value1, value2, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotBetween(String value1, String value2) {
            addCriterion("coupons_type not between", value1, value2, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceIsNull() {
            addCriterion("coupons_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceIsNotNull() {
            addCriterion("coupons_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceEqualTo(Long value) {
            addCriterion("coupons_price =", value, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceNotEqualTo(Long value) {
            addCriterion("coupons_price <>", value, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceGreaterThan(Long value) {
            addCriterion("coupons_price >", value, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("coupons_price >=", value, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceLessThan(Long value) {
            addCriterion("coupons_price <", value, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceLessThanOrEqualTo(Long value) {
            addCriterion("coupons_price <=", value, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceIn(List<Long> values) {
            addCriterion("coupons_price in", values, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceNotIn(List<Long> values) {
            addCriterion("coupons_price not in", values, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceBetween(Long value1, Long value2) {
            addCriterion("coupons_price between", value1, value2, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsPriceNotBetween(Long value1, Long value2) {
            addCriterion("coupons_price not between", value1, value2, "couponsPrice");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyIsNull() {
            addCriterion("coupons_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyIsNotNull() {
            addCriterion("coupons_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyEqualTo(Long value) {
            addCriterion("coupons_money =", value, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyNotEqualTo(Long value) {
            addCriterion("coupons_money <>", value, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyGreaterThan(Long value) {
            addCriterion("coupons_money >", value, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("coupons_money >=", value, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyLessThan(Long value) {
            addCriterion("coupons_money <", value, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyLessThanOrEqualTo(Long value) {
            addCriterion("coupons_money <=", value, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyIn(List<Long> values) {
            addCriterion("coupons_money in", values, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyNotIn(List<Long> values) {
            addCriterion("coupons_money not in", values, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyBetween(Long value1, Long value2) {
            addCriterion("coupons_money between", value1, value2, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsMoneyNotBetween(Long value1, Long value2) {
            addCriterion("coupons_money not between", value1, value2, "couponsMoney");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeIsNull() {
            addCriterion("coupons_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeIsNotNull() {
            addCriterion("coupons_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeEqualTo(Date value) {
            addCriterion("coupons_failure_time =", value, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeNotEqualTo(Date value) {
            addCriterion("coupons_failure_time <>", value, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeGreaterThan(Date value) {
            addCriterion("coupons_failure_time >", value, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupons_failure_time >=", value, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeLessThan(Date value) {
            addCriterion("coupons_failure_time <", value, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("coupons_failure_time <=", value, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeIn(List<Date> values) {
            addCriterion("coupons_failure_time in", values, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeNotIn(List<Date> values) {
            addCriterion("coupons_failure_time not in", values, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeBetween(Date value1, Date value2) {
            addCriterion("coupons_failure_time between", value1, value2, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("coupons_failure_time not between", value1, value2, "couponsFailureTime");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantIsNull() {
            addCriterion("coupons_merchant is null");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantIsNotNull() {
            addCriterion("coupons_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantEqualTo(String value) {
            addCriterion("coupons_merchant =", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantNotEqualTo(String value) {
            addCriterion("coupons_merchant <>", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantGreaterThan(String value) {
            addCriterion("coupons_merchant >", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantGreaterThanOrEqualTo(String value) {
            addCriterion("coupons_merchant >=", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantLessThan(String value) {
            addCriterion("coupons_merchant <", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantLessThanOrEqualTo(String value) {
            addCriterion("coupons_merchant <=", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantLike(String value) {
            addCriterion("coupons_merchant like", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantNotLike(String value) {
            addCriterion("coupons_merchant not like", value, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantIn(List<String> values) {
            addCriterion("coupons_merchant in", values, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantNotIn(List<String> values) {
            addCriterion("coupons_merchant not in", values, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantBetween(String value1, String value2) {
            addCriterion("coupons_merchant between", value1, value2, "couponsMerchant");
            return (Criteria) this;
        }

        public Criteria andCouponsMerchantNotBetween(String value1, String value2) {
            addCriterion("coupons_merchant not between", value1, value2, "couponsMerchant");
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