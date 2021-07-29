package com.car_wash.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordTableExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIsNull() {
            addCriterion("record_user is null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIsNotNull() {
            addCriterion("record_user is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUserEqualTo(String value) {
            addCriterion("record_user =", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotEqualTo(String value) {
            addCriterion("record_user <>", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserGreaterThan(String value) {
            addCriterion("record_user >", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserGreaterThanOrEqualTo(String value) {
            addCriterion("record_user >=", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLessThan(String value) {
            addCriterion("record_user <", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLessThanOrEqualTo(String value) {
            addCriterion("record_user <=", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLike(String value) {
            addCriterion("record_user like", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotLike(String value) {
            addCriterion("record_user not like", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserIn(List<String> values) {
            addCriterion("record_user in", values, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotIn(List<String> values) {
            addCriterion("record_user not in", values, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserBetween(String value1, String value2) {
            addCriterion("record_user between", value1, value2, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotBetween(String value1, String value2) {
            addCriterion("record_user not between", value1, value2, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordSiteIsNull() {
            addCriterion("record_site is null");
            return (Criteria) this;
        }

        public Criteria andRecordSiteIsNotNull() {
            addCriterion("record_site is not null");
            return (Criteria) this;
        }

        public Criteria andRecordSiteEqualTo(String value) {
            addCriterion("record_site =", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteNotEqualTo(String value) {
            addCriterion("record_site <>", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteGreaterThan(String value) {
            addCriterion("record_site >", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteGreaterThanOrEqualTo(String value) {
            addCriterion("record_site >=", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteLessThan(String value) {
            addCriterion("record_site <", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteLessThanOrEqualTo(String value) {
            addCriterion("record_site <=", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteLike(String value) {
            addCriterion("record_site like", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteNotLike(String value) {
            addCriterion("record_site not like", value, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteIn(List<String> values) {
            addCriterion("record_site in", values, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteNotIn(List<String> values) {
            addCriterion("record_site not in", values, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteBetween(String value1, String value2) {
            addCriterion("record_site between", value1, value2, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordSiteNotBetween(String value1, String value2) {
            addCriterion("record_site not between", value1, value2, "recordSite");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodIsNull() {
            addCriterion("record_payment_method is null");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodIsNotNull() {
            addCriterion("record_payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodEqualTo(String value) {
            addCriterion("record_payment_method =", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodNotEqualTo(String value) {
            addCriterion("record_payment_method <>", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodGreaterThan(String value) {
            addCriterion("record_payment_method >", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("record_payment_method >=", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodLessThan(String value) {
            addCriterion("record_payment_method <", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("record_payment_method <=", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodLike(String value) {
            addCriterion("record_payment_method like", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodNotLike(String value) {
            addCriterion("record_payment_method not like", value, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodIn(List<String> values) {
            addCriterion("record_payment_method in", values, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodNotIn(List<String> values) {
            addCriterion("record_payment_method not in", values, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodBetween(String value1, String value2) {
            addCriterion("record_payment_method between", value1, value2, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("record_payment_method not between", value1, value2, "recordPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeIsNull() {
            addCriterion("record_consumption_type is null");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeIsNotNull() {
            addCriterion("record_consumption_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeEqualTo(String value) {
            addCriterion("record_consumption_type =", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeNotEqualTo(String value) {
            addCriterion("record_consumption_type <>", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeGreaterThan(String value) {
            addCriterion("record_consumption_type >", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("record_consumption_type >=", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeLessThan(String value) {
            addCriterion("record_consumption_type <", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeLessThanOrEqualTo(String value) {
            addCriterion("record_consumption_type <=", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeLike(String value) {
            addCriterion("record_consumption_type like", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeNotLike(String value) {
            addCriterion("record_consumption_type not like", value, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeIn(List<String> values) {
            addCriterion("record_consumption_type in", values, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeNotIn(List<String> values) {
            addCriterion("record_consumption_type not in", values, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeBetween(String value1, String value2) {
            addCriterion("record_consumption_type between", value1, value2, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionTypeNotBetween(String value1, String value2) {
            addCriterion("record_consumption_type not between", value1, value2, "recordConsumptionType");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountIsNull() {
            addCriterion("record_consumption_amount is null");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountIsNotNull() {
            addCriterion("record_consumption_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountEqualTo(Long value) {
            addCriterion("record_consumption_amount =", value, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountNotEqualTo(Long value) {
            addCriterion("record_consumption_amount <>", value, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountGreaterThan(Long value) {
            addCriterion("record_consumption_amount >", value, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("record_consumption_amount >=", value, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountLessThan(Long value) {
            addCriterion("record_consumption_amount <", value, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountLessThanOrEqualTo(Long value) {
            addCriterion("record_consumption_amount <=", value, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountIn(List<Long> values) {
            addCriterion("record_consumption_amount in", values, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountNotIn(List<Long> values) {
            addCriterion("record_consumption_amount not in", values, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountBetween(Long value1, Long value2) {
            addCriterion("record_consumption_amount between", value1, value2, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordConsumptionAmountNotBetween(Long value1, Long value2) {
            addCriterion("record_consumption_amount not between", value1, value2, "recordConsumptionAmount");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeIsNull() {
            addCriterion("record_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeIsNotNull() {
            addCriterion("record_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeEqualTo(Date value) {
            addCriterion("record_payment_time =", value, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeNotEqualTo(Date value) {
            addCriterion("record_payment_time <>", value, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeGreaterThan(Date value) {
            addCriterion("record_payment_time >", value, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_payment_time >=", value, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeLessThan(Date value) {
            addCriterion("record_payment_time <", value, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_payment_time <=", value, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeIn(List<Date> values) {
            addCriterion("record_payment_time in", values, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeNotIn(List<Date> values) {
            addCriterion("record_payment_time not in", values, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("record_payment_time between", value1, value2, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_payment_time not between", value1, value2, "recordPaymentTime");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNull() {
            addCriterion("record_type is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("record_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(String value) {
            addCriterion("record_type =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(String value) {
            addCriterion("record_type <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(String value) {
            addCriterion("record_type >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("record_type >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(String value) {
            addCriterion("record_type <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(String value) {
            addCriterion("record_type <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLike(String value) {
            addCriterion("record_type like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotLike(String value) {
            addCriterion("record_type not like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<String> values) {
            addCriterion("record_type in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<String> values) {
            addCriterion("record_type not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(String value1, String value2) {
            addCriterion("record_type between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(String value1, String value2) {
            addCriterion("record_type not between", value1, value2, "recordType");
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