package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DanmutbPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DanmutbPOExample() {
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

        public Criteria andDanmuallIsNull() {
            addCriterion("danmuall is null");
            return (Criteria) this;
        }

        public Criteria andDanmuallIsNotNull() {
            addCriterion("danmuall is not null");
            return (Criteria) this;
        }

        public Criteria andDanmuallEqualTo(Integer value) {
            addCriterion("danmuall =", value, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallNotEqualTo(Integer value) {
            addCriterion("danmuall <>", value, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallGreaterThan(Integer value) {
            addCriterion("danmuall >", value, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmuall >=", value, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallLessThan(Integer value) {
            addCriterion("danmuall <", value, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallLessThanOrEqualTo(Integer value) {
            addCriterion("danmuall <=", value, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallIn(List<Integer> values) {
            addCriterion("danmuall in", values, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallNotIn(List<Integer> values) {
            addCriterion("danmuall not in", values, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallBetween(Integer value1, Integer value2) {
            addCriterion("danmuall between", value1, value2, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmuallNotBetween(Integer value1, Integer value2) {
            addCriterion("danmuall not between", value1, value2, "danmuall");
            return (Criteria) this;
        }

        public Criteria andDanmusexIsNull() {
            addCriterion("danmusex is null");
            return (Criteria) this;
        }

        public Criteria andDanmusexIsNotNull() {
            addCriterion("danmusex is not null");
            return (Criteria) this;
        }

        public Criteria andDanmusexEqualTo(Integer value) {
            addCriterion("danmusex =", value, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexNotEqualTo(Integer value) {
            addCriterion("danmusex <>", value, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexGreaterThan(Integer value) {
            addCriterion("danmusex >", value, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmusex >=", value, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexLessThan(Integer value) {
            addCriterion("danmusex <", value, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexLessThanOrEqualTo(Integer value) {
            addCriterion("danmusex <=", value, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexIn(List<Integer> values) {
            addCriterion("danmusex in", values, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexNotIn(List<Integer> values) {
            addCriterion("danmusex not in", values, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexBetween(Integer value1, Integer value2) {
            addCriterion("danmusex between", value1, value2, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmusexNotBetween(Integer value1, Integer value2) {
            addCriterion("danmusex not between", value1, value2, "danmusex");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseIsNull() {
            addCriterion("danmuabuse is null");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseIsNotNull() {
            addCriterion("danmuabuse is not null");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseEqualTo(Integer value) {
            addCriterion("danmuabuse =", value, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseNotEqualTo(Integer value) {
            addCriterion("danmuabuse <>", value, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseGreaterThan(Integer value) {
            addCriterion("danmuabuse >", value, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmuabuse >=", value, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseLessThan(Integer value) {
            addCriterion("danmuabuse <", value, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseLessThanOrEqualTo(Integer value) {
            addCriterion("danmuabuse <=", value, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseIn(List<Integer> values) {
            addCriterion("danmuabuse in", values, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseNotIn(List<Integer> values) {
            addCriterion("danmuabuse not in", values, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseBetween(Integer value1, Integer value2) {
            addCriterion("danmuabuse between", value1, value2, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmuabuseNotBetween(Integer value1, Integer value2) {
            addCriterion("danmuabuse not between", value1, value2, "danmuabuse");
            return (Criteria) this;
        }

        public Criteria andDanmureactIsNull() {
            addCriterion("danmureact is null");
            return (Criteria) this;
        }

        public Criteria andDanmureactIsNotNull() {
            addCriterion("danmureact is not null");
            return (Criteria) this;
        }

        public Criteria andDanmureactEqualTo(Integer value) {
            addCriterion("danmureact =", value, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactNotEqualTo(Integer value) {
            addCriterion("danmureact <>", value, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactGreaterThan(Integer value) {
            addCriterion("danmureact >", value, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmureact >=", value, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactLessThan(Integer value) {
            addCriterion("danmureact <", value, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactLessThanOrEqualTo(Integer value) {
            addCriterion("danmureact <=", value, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactIn(List<Integer> values) {
            addCriterion("danmureact in", values, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactNotIn(List<Integer> values) {
            addCriterion("danmureact not in", values, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactBetween(Integer value1, Integer value2) {
            addCriterion("danmureact between", value1, value2, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmureactNotBetween(Integer value1, Integer value2) {
            addCriterion("danmureact not between", value1, value2, "danmureact");
            return (Criteria) this;
        }

        public Criteria andDanmuvioIsNull() {
            addCriterion("danmuvio is null");
            return (Criteria) this;
        }

        public Criteria andDanmuvioIsNotNull() {
            addCriterion("danmuvio is not null");
            return (Criteria) this;
        }

        public Criteria andDanmuvioEqualTo(Integer value) {
            addCriterion("danmuvio =", value, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioNotEqualTo(Integer value) {
            addCriterion("danmuvio <>", value, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioGreaterThan(Integer value) {
            addCriterion("danmuvio >", value, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmuvio >=", value, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioLessThan(Integer value) {
            addCriterion("danmuvio <", value, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioLessThanOrEqualTo(Integer value) {
            addCriterion("danmuvio <=", value, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioIn(List<Integer> values) {
            addCriterion("danmuvio in", values, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioNotIn(List<Integer> values) {
            addCriterion("danmuvio not in", values, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioBetween(Integer value1, Integer value2) {
            addCriterion("danmuvio between", value1, value2, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuvioNotBetween(Integer value1, Integer value2) {
            addCriterion("danmuvio not between", value1, value2, "danmuvio");
            return (Criteria) this;
        }

        public Criteria andDanmuotherIsNull() {
            addCriterion("danmuother is null");
            return (Criteria) this;
        }

        public Criteria andDanmuotherIsNotNull() {
            addCriterion("danmuother is not null");
            return (Criteria) this;
        }

        public Criteria andDanmuotherEqualTo(Integer value) {
            addCriterion("danmuother =", value, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherNotEqualTo(Integer value) {
            addCriterion("danmuother <>", value, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherGreaterThan(Integer value) {
            addCriterion("danmuother >", value, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmuother >=", value, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherLessThan(Integer value) {
            addCriterion("danmuother <", value, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherLessThanOrEqualTo(Integer value) {
            addCriterion("danmuother <=", value, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherIn(List<Integer> values) {
            addCriterion("danmuother in", values, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherNotIn(List<Integer> values) {
            addCriterion("danmuother not in", values, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherBetween(Integer value1, Integer value2) {
            addCriterion("danmuother between", value1, value2, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmuotherNotBetween(Integer value1, Integer value2) {
            addCriterion("danmuother not between", value1, value2, "danmuother");
            return (Criteria) this;
        }

        public Criteria andDanmutimeIsNull() {
            addCriterion("danmutime is null");
            return (Criteria) this;
        }

        public Criteria andDanmutimeIsNotNull() {
            addCriterion("danmutime is not null");
            return (Criteria) this;
        }

        public Criteria andDanmutimeEqualTo(Date value) {
            addCriterionForJDBCTime("danmutime =", value, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("danmutime <>", value, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeGreaterThan(Date value) {
            addCriterionForJDBCTime("danmutime >", value, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("danmutime >=", value, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeLessThan(Date value) {
            addCriterionForJDBCTime("danmutime <", value, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("danmutime <=", value, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeIn(List<Date> values) {
            addCriterionForJDBCTime("danmutime in", values, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("danmutime not in", values, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("danmutime between", value1, value2, "danmutime");
            return (Criteria) this;
        }

        public Criteria andDanmutimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("danmutime not between", value1, value2, "danmutime");
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