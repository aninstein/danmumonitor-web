package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.List;

public class AlarmtbPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmtbPOExample() {
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

        public Criteria andIdNotEquahlTo(Integer value) {
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

        public Criteria andAlarmnameIsNull() {
            addCriterion("alarmname is null");
            return (Criteria) this;
        }

        public Criteria andAlarmnameIsNotNull() {
            addCriterion("alarmname is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmnameEqualTo(String value) {
            addCriterion("alarmname =", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameNotEqualTo(String value) {
            addCriterion("alarmname <>", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameGreaterThan(String value) {
            addCriterion("alarmname >", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameGreaterThanOrEqualTo(String value) {
            addCriterion("alarmname >=", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameLessThan(String value) {
            addCriterion("alarmname <", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameLessThanOrEqualTo(String value) {
            addCriterion("alarmname <=", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameLike(String value) {
            addCriterion("alarmname like", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameNotLike(String value) {
            addCriterion("alarmname not like", value, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameIn(List<String> values) {
            addCriterion("alarmname in", values, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameNotIn(List<String> values) {
            addCriterion("alarmname not in", values, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameBetween(String value1, String value2) {
            addCriterion("alarmname between", value1, value2, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmnameNotBetween(String value1, String value2) {
            addCriterion("alarmname not between", value1, value2, "alarmname");
            return (Criteria) this;
        }

        public Criteria andAlarmroomIsNull() {
            addCriterion("alarmroom is null");
            return (Criteria) this;
        }

        public Criteria andAlarmroomIsNotNull() {
            addCriterion("alarmroom is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmroomEqualTo(String value) {
            addCriterion("alarmroom =", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomNotEqualTo(String value) {
            addCriterion("alarmroom <>", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomGreaterThan(String value) {
            addCriterion("alarmroom >", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomGreaterThanOrEqualTo(String value) {
            addCriterion("alarmroom >=", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomLessThan(String value) {
            addCriterion("alarmroom <", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomLessThanOrEqualTo(String value) {
            addCriterion("alarmroom <=", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomLike(String value) {
            addCriterion("alarmroom like", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomNotLike(String value) {
            addCriterion("alarmroom not like", value, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomIn(List<String> values) {
            addCriterion("alarmroom in", values, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomNotIn(List<String> values) {
            addCriterion("alarmroom not in", values, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomBetween(String value1, String value2) {
            addCriterion("alarmroom between", value1, value2, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmroomNotBetween(String value1, String value2) {
            addCriterion("alarmroom not between", value1, value2, "alarmroom");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditIsNull() {
            addCriterion("alarmcredit is null");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditIsNotNull() {
            addCriterion("alarmcredit is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditEqualTo(Double value) {
            addCriterion("alarmcredit =", value, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditNotEqualTo(Double value) {
            addCriterion("alarmcredit <>", value, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditGreaterThan(Double value) {
            addCriterion("alarmcredit >", value, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditGreaterThanOrEqualTo(Double value) {
            addCriterion("alarmcredit >=", value, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditLessThan(Double value) {
            addCriterion("alarmcredit <", value, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditLessThanOrEqualTo(Double value) {
            addCriterion("alarmcredit <=", value, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditIn(List<Double> values) {
            addCriterion("alarmcredit in", values, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditNotIn(List<Double> values) {
            addCriterion("alarmcredit not in", values, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditBetween(Double value1, Double value2) {
            addCriterion("alarmcredit between", value1, value2, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmcreditNotBetween(Double value1, Double value2) {
            addCriterion("alarmcredit not between", value1, value2, "alarmcredit");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeIsNull() {
            addCriterion("alarmtype is null");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeIsNotNull() {
            addCriterion("alarmtype is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeEqualTo(String value) {
            addCriterion("alarmtype =", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotEqualTo(String value) {
            addCriterion("alarmtype <>", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeGreaterThan(String value) {
            addCriterion("alarmtype >", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeGreaterThanOrEqualTo(String value) {
            addCriterion("alarmtype >=", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeLessThan(String value) {
            addCriterion("alarmtype <", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeLessThanOrEqualTo(String value) {
            addCriterion("alarmtype <=", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeLike(String value) {
            addCriterion("alarmtype like", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotLike(String value) {
            addCriterion("alarmtype not like", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeIn(List<String> values) {
            addCriterion("alarmtype in", values, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotIn(List<String> values) {
            addCriterion("alarmtype not in", values, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeBetween(String value1, String value2) {
            addCriterion("alarmtype between", value1, value2, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotBetween(String value1, String value2) {
            addCriterion("alarmtype not between", value1, value2, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeIsNull() {
            addCriterion("alarmtime is null");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeIsNotNull() {
            addCriterion("alarmtime is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeEqualTo(String value) {
            addCriterion("alarmtime =", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeNotEqualTo(String value) {
            addCriterion("alarmtime <>", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeGreaterThan(String value) {
            addCriterion("alarmtime >", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeGreaterThanOrEqualTo(String value) {
            addCriterion("alarmtime >=", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeLessThan(String value) {
            addCriterion("alarmtime <", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeLessThanOrEqualTo(String value) {
            addCriterion("alarmtime <=", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeLike(String value) {
            addCriterion("alarmtime like", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeNotLike(String value) {
            addCriterion("alarmtime not like", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeIn(List<String> values) {
            addCriterion("alarmtime in", values, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeNotIn(List<String> values) {
            addCriterion("alarmtime not in", values, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeBetween(String value1, String value2) {
            addCriterion("alarmtime between", value1, value2, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeNotBetween(String value1, String value2) {
            addCriterion("alarmtime not between", value1, value2, "alarmtime");
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