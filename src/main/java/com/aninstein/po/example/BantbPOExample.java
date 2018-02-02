package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.List;

public class BantbPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BantbPOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnchornameIsNull() {
            addCriterion("anchorname is null");
            return (Criteria) this;
        }

        public Criteria andAnchornameIsNotNull() {
            addCriterion("anchorname is not null");
            return (Criteria) this;
        }

        public Criteria andAnchornameEqualTo(String value) {
            addCriterion("anchorname =", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotEqualTo(String value) {
            addCriterion("anchorname <>", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameGreaterThan(String value) {
            addCriterion("anchorname >", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameGreaterThanOrEqualTo(String value) {
            addCriterion("anchorname >=", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameLessThan(String value) {
            addCriterion("anchorname <", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameLessThanOrEqualTo(String value) {
            addCriterion("anchorname <=", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameLike(String value) {
            addCriterion("anchorname like", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotLike(String value) {
            addCriterion("anchorname not like", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameIn(List<String> values) {
            addCriterion("anchorname in", values, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotIn(List<String> values) {
            addCriterion("anchorname not in", values, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameBetween(String value1, String value2) {
            addCriterion("anchorname between", value1, value2, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotBetween(String value1, String value2) {
            addCriterion("anchorname not between", value1, value2, "anchorname");
            return (Criteria) this;
        }

        public Criteria andBantypeIsNull() {
            addCriterion("bantype is null");
            return (Criteria) this;
        }

        public Criteria andBantypeIsNotNull() {
            addCriterion("bantype is not null");
            return (Criteria) this;
        }

        public Criteria andBantypeEqualTo(String value) {
            addCriterion("bantype =", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotEqualTo(String value) {
            addCriterion("bantype <>", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeGreaterThan(String value) {
            addCriterion("bantype >", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeGreaterThanOrEqualTo(String value) {
            addCriterion("bantype >=", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeLessThan(String value) {
            addCriterion("bantype <", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeLessThanOrEqualTo(String value) {
            addCriterion("bantype <=", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeLike(String value) {
            addCriterion("bantype like", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotLike(String value) {
            addCriterion("bantype not like", value, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeIn(List<String> values) {
            addCriterion("bantype in", values, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotIn(List<String> values) {
            addCriterion("bantype not in", values, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeBetween(String value1, String value2) {
            addCriterion("bantype between", value1, value2, "bantype");
            return (Criteria) this;
        }

        public Criteria andBantypeNotBetween(String value1, String value2) {
            addCriterion("bantype not between", value1, value2, "bantype");
            return (Criteria) this;
        }

        public Criteria andBanhisIsNull() {
            addCriterion("banhis is null");
            return (Criteria) this;
        }

        public Criteria andBanhisIsNotNull() {
            addCriterion("banhis is not null");
            return (Criteria) this;
        }

        public Criteria andBanhisEqualTo(Double value) {
            addCriterion("banhis =", value, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisNotEqualTo(Double value) {
            addCriterion("banhis <>", value, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisGreaterThan(Double value) {
            addCriterion("banhis >", value, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisGreaterThanOrEqualTo(Double value) {
            addCriterion("banhis >=", value, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisLessThan(Double value) {
            addCriterion("banhis <", value, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisLessThanOrEqualTo(Double value) {
            addCriterion("banhis <=", value, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisIn(List<Double> values) {
            addCriterion("banhis in", values, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisNotIn(List<Double> values) {
            addCriterion("banhis not in", values, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisBetween(Double value1, Double value2) {
            addCriterion("banhis between", value1, value2, "banhis");
            return (Criteria) this;
        }

        public Criteria andBanhisNotBetween(Double value1, Double value2) {
            addCriterion("banhis not between", value1, value2, "banhis");
            return (Criteria) this;
        }

        public Criteria andBantimeIsNull() {
            addCriterion("bantime is null");
            return (Criteria) this;
        }

        public Criteria andBantimeIsNotNull() {
            addCriterion("bantime is not null");
            return (Criteria) this;
        }

        public Criteria andBantimeEqualTo(String value) {
            addCriterion("bantime =", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeNotEqualTo(String value) {
            addCriterion("bantime <>", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeGreaterThan(String value) {
            addCriterion("bantime >", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeGreaterThanOrEqualTo(String value) {
            addCriterion("bantime >=", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeLessThan(String value) {
            addCriterion("bantime <", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeLessThanOrEqualTo(String value) {
            addCriterion("bantime <=", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeLike(String value) {
            addCriterion("bantime like", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeNotLike(String value) {
            addCriterion("bantime not like", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeIn(List<String> values) {
            addCriterion("bantime in", values, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeNotIn(List<String> values) {
            addCriterion("bantime not in", values, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeBetween(String value1, String value2) {
            addCriterion("bantime between", value1, value2, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeNotBetween(String value1, String value2) {
            addCriterion("bantime not between", value1, value2, "bantime");
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