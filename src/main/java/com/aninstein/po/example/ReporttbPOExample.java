package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReporttbPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReporttbPOExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andReportnameIsNull() {
            addCriterion("reportname is null");
            return (Criteria) this;
        }

        public Criteria andReportnameIsNotNull() {
            addCriterion("reportname is not null");
            return (Criteria) this;
        }

        public Criteria andReportnameEqualTo(String value) {
            addCriterion("reportname =", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotEqualTo(String value) {
            addCriterion("reportname <>", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThan(String value) {
            addCriterion("reportname >", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThanOrEqualTo(String value) {
            addCriterion("reportname >=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThan(String value) {
            addCriterion("reportname <", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThanOrEqualTo(String value) {
            addCriterion("reportname <=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLike(String value) {
            addCriterion("reportname like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotLike(String value) {
            addCriterion("reportname not like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameIn(List<String> values) {
            addCriterion("reportname in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotIn(List<String> values) {
            addCriterion("reportname not in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameBetween(String value1, String value2) {
            addCriterion("reportname between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotBetween(String value1, String value2) {
            addCriterion("reportname not between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportroomIsNull() {
            addCriterion("reportroom is null");
            return (Criteria) this;
        }

        public Criteria andReportroomIsNotNull() {
            addCriterion("reportroom is not null");
            return (Criteria) this;
        }

        public Criteria andReportroomEqualTo(String value) {
            addCriterion("reportroom =", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomNotEqualTo(String value) {
            addCriterion("reportroom <>", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomGreaterThan(String value) {
            addCriterion("reportroom >", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomGreaterThanOrEqualTo(String value) {
            addCriterion("reportroom >=", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomLessThan(String value) {
            addCriterion("reportroom <", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomLessThanOrEqualTo(String value) {
            addCriterion("reportroom <=", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomLike(String value) {
            addCriterion("reportroom like", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomNotLike(String value) {
            addCriterion("reportroom not like", value, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomIn(List<String> values) {
            addCriterion("reportroom in", values, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomNotIn(List<String> values) {
            addCriterion("reportroom not in", values, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomBetween(String value1, String value2) {
            addCriterion("reportroom between", value1, value2, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportroomNotBetween(String value1, String value2) {
            addCriterion("reportroom not between", value1, value2, "reportroom");
            return (Criteria) this;
        }

        public Criteria andReportcreditIsNull() {
            addCriterion("reportcredit is null");
            return (Criteria) this;
        }

        public Criteria andReportcreditIsNotNull() {
            addCriterion("reportcredit is not null");
            return (Criteria) this;
        }

        public Criteria andReportcreditEqualTo(Double value) {
            addCriterion("reportcredit =", value, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditNotEqualTo(Double value) {
            addCriterion("reportcredit <>", value, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditGreaterThan(Double value) {
            addCriterion("reportcredit >", value, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditGreaterThanOrEqualTo(Double value) {
            addCriterion("reportcredit >=", value, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditLessThan(Double value) {
            addCriterion("reportcredit <", value, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditLessThanOrEqualTo(Double value) {
            addCriterion("reportcredit <=", value, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditIn(List<Double> values) {
            addCriterion("reportcredit in", values, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditNotIn(List<Double> values) {
            addCriterion("reportcredit not in", values, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditBetween(Double value1, Double value2) {
            addCriterion("reportcredit between", value1, value2, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReportcreditNotBetween(Double value1, Double value2) {
            addCriterion("reportcredit not between", value1, value2, "reportcredit");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNull() {
            addCriterion("reporttype is null");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNotNull() {
            addCriterion("reporttype is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypeEqualTo(String value) {
            addCriterion("reporttype =", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotEqualTo(String value) {
            addCriterion("reporttype <>", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThan(String value) {
            addCriterion("reporttype >", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThanOrEqualTo(String value) {
            addCriterion("reporttype >=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThan(String value) {
            addCriterion("reporttype <", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThanOrEqualTo(String value) {
            addCriterion("reporttype <=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLike(String value) {
            addCriterion("reporttype like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotLike(String value) {
            addCriterion("reporttype not like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIn(List<String> values) {
            addCriterion("reporttype in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotIn(List<String> values) {
            addCriterion("reporttype not in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeBetween(String value1, String value2) {
            addCriterion("reporttype between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotBetween(String value1, String value2) {
            addCriterion("reporttype not between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNull() {
            addCriterion("reporttime is null");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNotNull() {
            addCriterion("reporttime is not null");
            return (Criteria) this;
        }

        public Criteria andReporttimeEqualTo(Date value) {
            addCriterionForJDBCTime("reporttime =", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("reporttime <>", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("reporttime >", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("reporttime >=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThan(Date value) {
            addCriterionForJDBCTime("reporttime <", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("reporttime <=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIn(List<Date> values) {
            addCriterionForJDBCTime("reporttime in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("reporttime not in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("reporttime between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("reporttime not between", value1, value2, "reporttime");
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