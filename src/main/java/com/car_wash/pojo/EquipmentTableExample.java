package com.car_wash.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentTableExample() {
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

        public Criteria andEquipmentNumberIsNull() {
            addCriterion("equipment_number is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIsNotNull() {
            addCriterion("equipment_number is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberEqualTo(String value) {
            addCriterion("equipment_number =", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotEqualTo(String value) {
            addCriterion("equipment_number <>", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThan(String value) {
            addCriterion("equipment_number >", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_number >=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThan(String value) {
            addCriterion("equipment_number <", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThanOrEqualTo(String value) {
            addCriterion("equipment_number <=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLike(String value) {
            addCriterion("equipment_number like", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotLike(String value) {
            addCriterion("equipment_number not like", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIn(List<String> values) {
            addCriterion("equipment_number in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotIn(List<String> values) {
            addCriterion("equipment_number not in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberBetween(String value1, String value2) {
            addCriterion("equipment_number between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotBetween(String value1, String value2) {
            addCriterion("equipment_number not between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteIsNull() {
            addCriterion("equipment_site is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteIsNotNull() {
            addCriterion("equipment_site is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteEqualTo(String value) {
            addCriterion("equipment_site =", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotEqualTo(String value) {
            addCriterion("equipment_site <>", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteGreaterThan(String value) {
            addCriterion("equipment_site >", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_site >=", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteLessThan(String value) {
            addCriterion("equipment_site <", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteLessThanOrEqualTo(String value) {
            addCriterion("equipment_site <=", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteLike(String value) {
            addCriterion("equipment_site like", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotLike(String value) {
            addCriterion("equipment_site not like", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteIn(List<String> values) {
            addCriterion("equipment_site in", values, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotIn(List<String> values) {
            addCriterion("equipment_site not in", values, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteBetween(String value1, String value2) {
            addCriterion("equipment_site between", value1, value2, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotBetween(String value1, String value2) {
            addCriterion("equipment_site not between", value1, value2, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterIsNull() {
            addCriterion("equipment_parameter is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterIsNotNull() {
            addCriterion("equipment_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterEqualTo(String value) {
            addCriterion("equipment_parameter =", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterNotEqualTo(String value) {
            addCriterion("equipment_parameter <>", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterGreaterThan(String value) {
            addCriterion("equipment_parameter >", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_parameter >=", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterLessThan(String value) {
            addCriterion("equipment_parameter <", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterLessThanOrEqualTo(String value) {
            addCriterion("equipment_parameter <=", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterLike(String value) {
            addCriterion("equipment_parameter like", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterNotLike(String value) {
            addCriterion("equipment_parameter not like", value, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterIn(List<String> values) {
            addCriterion("equipment_parameter in", values, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterNotIn(List<String> values) {
            addCriterion("equipment_parameter not in", values, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterBetween(String value1, String value2) {
            addCriterion("equipment_parameter between", value1, value2, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentParameterNotBetween(String value1, String value2) {
            addCriterion("equipment_parameter not between", value1, value2, "equipmentParameter");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceIsNull() {
            addCriterion("equipment_price is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceIsNotNull() {
            addCriterion("equipment_price is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceEqualTo(Long value) {
            addCriterion("equipment_price =", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceNotEqualTo(Long value) {
            addCriterion("equipment_price <>", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceGreaterThan(Long value) {
            addCriterion("equipment_price >", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment_price >=", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceLessThan(Long value) {
            addCriterion("equipment_price <", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceLessThanOrEqualTo(Long value) {
            addCriterion("equipment_price <=", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceIn(List<Long> values) {
            addCriterion("equipment_price in", values, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceNotIn(List<Long> values) {
            addCriterion("equipment_price not in", values, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceBetween(Long value1, Long value2) {
            addCriterion("equipment_price between", value1, value2, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceNotBetween(Long value1, Long value2) {
            addCriterion("equipment_price not between", value1, value2, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeIsNull() {
            addCriterion("equipment_describe is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeIsNotNull() {
            addCriterion("equipment_describe is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeEqualTo(String value) {
            addCriterion("equipment_describe =", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotEqualTo(String value) {
            addCriterion("equipment_describe <>", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeGreaterThan(String value) {
            addCriterion("equipment_describe >", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_describe >=", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeLessThan(String value) {
            addCriterion("equipment_describe <", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeLessThanOrEqualTo(String value) {
            addCriterion("equipment_describe <=", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeLike(String value) {
            addCriterion("equipment_describe like", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotLike(String value) {
            addCriterion("equipment_describe not like", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeIn(List<String> values) {
            addCriterion("equipment_describe in", values, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotIn(List<String> values) {
            addCriterion("equipment_describe not in", values, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeBetween(String value1, String value2) {
            addCriterion("equipment_describe between", value1, value2, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotBetween(String value1, String value2) {
            addCriterion("equipment_describe not between", value1, value2, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNull() {
            addCriterion("equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNotNull() {
            addCriterion("equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeEqualTo(String value) {
            addCriterion("equipment_type =", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotEqualTo(String value) {
            addCriterion("equipment_type <>", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThan(String value) {
            addCriterion("equipment_type >", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_type >=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThan(String value) {
            addCriterion("equipment_type <", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThanOrEqualTo(String value) {
            addCriterion("equipment_type <=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLike(String value) {
            addCriterion("equipment_type like", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotLike(String value) {
            addCriterion("equipment_type not like", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIn(List<String> values) {
            addCriterion("equipment_type in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotIn(List<String> values) {
            addCriterion("equipment_type not in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeBetween(String value1, String value2) {
            addCriterion("equipment_type between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotBetween(String value1, String value2) {
            addCriterion("equipment_type not between", value1, value2, "equipmentType");
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