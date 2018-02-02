package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.List;

public class MonitortbPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonitortbPOExample() {
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

        public Criteria andManameIsNull() {
            addCriterion("MAname is null");
            return (Criteria) this;
        }

        public Criteria andManameIsNotNull() {
            addCriterion("MAname is not null");
            return (Criteria) this;
        }

        public Criteria andManameEqualTo(String value) {
            addCriterion("MAname =", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotEqualTo(String value) {
            addCriterion("MAname <>", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameGreaterThan(String value) {
            addCriterion("MAname >", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameGreaterThanOrEqualTo(String value) {
            addCriterion("MAname >=", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameLessThan(String value) {
            addCriterion("MAname <", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameLessThanOrEqualTo(String value) {
            addCriterion("MAname <=", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameLike(String value) {
            addCriterion("MAname like", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotLike(String value) {
            addCriterion("MAname not like", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameIn(List<String> values) {
            addCriterion("MAname in", values, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotIn(List<String> values) {
            addCriterion("MAname not in", values, "maname");
            return (Criteria) this;
        }

        public Criteria andManameBetween(String value1, String value2) {
            addCriterion("MAname between", value1, value2, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotBetween(String value1, String value2) {
            addCriterion("MAname not between", value1, value2, "maname");
            return (Criteria) this;
        }

        public Criteria andMaroomIsNull() {
            addCriterion("MAroom is null");
            return (Criteria) this;
        }

        public Criteria andMaroomIsNotNull() {
            addCriterion("MAroom is not null");
            return (Criteria) this;
        }

        public Criteria andMaroomEqualTo(String value) {
            addCriterion("MAroom =", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomNotEqualTo(String value) {
            addCriterion("MAroom <>", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomGreaterThan(String value) {
            addCriterion("MAroom >", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomGreaterThanOrEqualTo(String value) {
            addCriterion("MAroom >=", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomLessThan(String value) {
            addCriterion("MAroom <", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomLessThanOrEqualTo(String value) {
            addCriterion("MAroom <=", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomLike(String value) {
            addCriterion("MAroom like", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomNotLike(String value) {
            addCriterion("MAroom not like", value, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomIn(List<String> values) {
            addCriterion("MAroom in", values, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomNotIn(List<String> values) {
            addCriterion("MAroom not in", values, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomBetween(String value1, String value2) {
            addCriterion("MAroom between", value1, value2, "maroom");
            return (Criteria) this;
        }

        public Criteria andMaroomNotBetween(String value1, String value2) {
            addCriterion("MAroom not between", value1, value2, "maroom");
            return (Criteria) this;
        }

        public Criteria andMastateIsNull() {
            addCriterion("MAstate is null");
            return (Criteria) this;
        }

        public Criteria andMastateIsNotNull() {
            addCriterion("MAstate is not null");
            return (Criteria) this;
        }

        public Criteria andMastateEqualTo(String value) {
            addCriterion("MAstate =", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateNotEqualTo(String value) {
            addCriterion("MAstate <>", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateGreaterThan(String value) {
            addCriterion("MAstate >", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateGreaterThanOrEqualTo(String value) {
            addCriterion("MAstate >=", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateLessThan(String value) {
            addCriterion("MAstate <", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateLessThanOrEqualTo(String value) {
            addCriterion("MAstate <=", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateLike(String value) {
            addCriterion("MAstate like", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateNotLike(String value) {
            addCriterion("MAstate not like", value, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateIn(List<String> values) {
            addCriterion("MAstate in", values, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateNotIn(List<String> values) {
            addCriterion("MAstate not in", values, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateBetween(String value1, String value2) {
            addCriterion("MAstate between", value1, value2, "mastate");
            return (Criteria) this;
        }

        public Criteria andMastateNotBetween(String value1, String value2) {
            addCriterion("MAstate not between", value1, value2, "mastate");
            return (Criteria) this;
        }

        public Criteria andMapeopleIsNull() {
            addCriterion("MApeople is null");
            return (Criteria) this;
        }

        public Criteria andMapeopleIsNotNull() {
            addCriterion("MApeople is not null");
            return (Criteria) this;
        }

        public Criteria andMapeopleEqualTo(String value) {
            addCriterion("MApeople =", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleNotEqualTo(String value) {
            addCriterion("MApeople <>", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleGreaterThan(String value) {
            addCriterion("MApeople >", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleGreaterThanOrEqualTo(String value) {
            addCriterion("MApeople >=", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleLessThan(String value) {
            addCriterion("MApeople <", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleLessThanOrEqualTo(String value) {
            addCriterion("MApeople <=", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleLike(String value) {
            addCriterion("MApeople like", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleNotLike(String value) {
            addCriterion("MApeople not like", value, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleIn(List<String> values) {
            addCriterion("MApeople in", values, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleNotIn(List<String> values) {
            addCriterion("MApeople not in", values, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleBetween(String value1, String value2) {
            addCriterion("MApeople between", value1, value2, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMapeopleNotBetween(String value1, String value2) {
            addCriterion("MApeople not between", value1, value2, "mapeople");
            return (Criteria) this;
        }

        public Criteria andMahisIsNull() {
            addCriterion("MAhis is null");
            return (Criteria) this;
        }

        public Criteria andMahisIsNotNull() {
            addCriterion("MAhis is not null");
            return (Criteria) this;
        }

        public Criteria andMahisEqualTo(Double value) {
            addCriterion("MAhis =", value, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisNotEqualTo(Double value) {
            addCriterion("MAhis <>", value, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisGreaterThan(Double value) {
            addCriterion("MAhis >", value, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisGreaterThanOrEqualTo(Double value) {
            addCriterion("MAhis >=", value, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisLessThan(Double value) {
            addCriterion("MAhis <", value, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisLessThanOrEqualTo(Double value) {
            addCriterion("MAhis <=", value, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisIn(List<Double> values) {
            addCriterion("MAhis in", values, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisNotIn(List<Double> values) {
            addCriterion("MAhis not in", values, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisBetween(Double value1, Double value2) {
            addCriterion("MAhis between", value1, value2, "mahis");
            return (Criteria) this;
        }

        public Criteria andMahisNotBetween(Double value1, Double value2) {
            addCriterion("MAhis not between", value1, value2, "mahis");
            return (Criteria) this;
        }

        public Criteria andManowIsNull() {
            addCriterion("MAnow is null");
            return (Criteria) this;
        }

        public Criteria andManowIsNotNull() {
            addCriterion("MAnow is not null");
            return (Criteria) this;
        }

        public Criteria andManowEqualTo(Double value) {
            addCriterion("MAnow =", value, "manow");
            return (Criteria) this;
        }

        public Criteria andManowNotEqualTo(Double value) {
            addCriterion("MAnow <>", value, "manow");
            return (Criteria) this;
        }

        public Criteria andManowGreaterThan(Double value) {
            addCriterion("MAnow >", value, "manow");
            return (Criteria) this;
        }

        public Criteria andManowGreaterThanOrEqualTo(Double value) {
            addCriterion("MAnow >=", value, "manow");
            return (Criteria) this;
        }

        public Criteria andManowLessThan(Double value) {
            addCriterion("MAnow <", value, "manow");
            return (Criteria) this;
        }

        public Criteria andManowLessThanOrEqualTo(Double value) {
            addCriterion("MAnow <=", value, "manow");
            return (Criteria) this;
        }

        public Criteria andManowIn(List<Double> values) {
            addCriterion("MAnow in", values, "manow");
            return (Criteria) this;
        }

        public Criteria andManowNotIn(List<Double> values) {
            addCriterion("MAnow not in", values, "manow");
            return (Criteria) this;
        }

        public Criteria andManowBetween(Double value1, Double value2) {
            addCriterion("MAnow between", value1, value2, "manow");
            return (Criteria) this;
        }

        public Criteria andManowNotBetween(Double value1, Double value2) {
            addCriterion("MAnow not between", value1, value2, "manow");
            return (Criteria) this;
        }

        public Criteria andMadmnumIsNull() {
            addCriterion("MAdmnum is null");
            return (Criteria) this;
        }

        public Criteria andMadmnumIsNotNull() {
            addCriterion("MAdmnum is not null");
            return (Criteria) this;
        }

        public Criteria andMadmnumEqualTo(Integer value) {
            addCriterion("MAdmnum =", value, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumNotEqualTo(Integer value) {
            addCriterion("MAdmnum <>", value, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumGreaterThan(Integer value) {
            addCriterion("MAdmnum >", value, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAdmnum >=", value, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumLessThan(Integer value) {
            addCriterion("MAdmnum <", value, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumLessThanOrEqualTo(Integer value) {
            addCriterion("MAdmnum <=", value, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumIn(List<Integer> values) {
            addCriterion("MAdmnum in", values, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumNotIn(List<Integer> values) {
            addCriterion("MAdmnum not in", values, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumBetween(Integer value1, Integer value2) {
            addCriterion("MAdmnum between", value1, value2, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMadmnumNotBetween(Integer value1, Integer value2) {
            addCriterion("MAdmnum not between", value1, value2, "madmnum");
            return (Criteria) this;
        }

        public Criteria andMabanIsNull() {
            addCriterion("MAban is null");
            return (Criteria) this;
        }

        public Criteria andMabanIsNotNull() {
            addCriterion("MAban is not null");
            return (Criteria) this;
        }

        public Criteria andMabanEqualTo(Short value) {
            addCriterion("MAban =", value, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanNotEqualTo(Short value) {
            addCriterion("MAban <>", value, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanGreaterThan(Short value) {
            addCriterion("MAban >", value, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanGreaterThanOrEqualTo(Short value) {
            addCriterion("MAban >=", value, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanLessThan(Short value) {
            addCriterion("MAban <", value, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanLessThanOrEqualTo(Short value) {
            addCriterion("MAban <=", value, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanIn(List<Short> values) {
            addCriterion("MAban in", values, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanNotIn(List<Short> values) {
            addCriterion("MAban not in", values, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanBetween(Short value1, Short value2) {
            addCriterion("MAban between", value1, value2, "maban");
            return (Criteria) this;
        }

        public Criteria andMabanNotBetween(Short value1, Short value2) {
            addCriterion("MAban not between", value1, value2, "maban");
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