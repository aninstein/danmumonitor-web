package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.List;

public class StatistictbPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatistictbPOExample() {
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

        public Criteria andAnchorroomIsNull() {
            addCriterion("anchorroom is null");
            return (Criteria) this;
        }

        public Criteria andAnchorroomIsNotNull() {
            addCriterion("anchorroom is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorroomEqualTo(String value) {
            addCriterion("anchorroom =", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomNotEqualTo(String value) {
            addCriterion("anchorroom <>", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomGreaterThan(String value) {
            addCriterion("anchorroom >", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomGreaterThanOrEqualTo(String value) {
            addCriterion("anchorroom >=", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomLessThan(String value) {
            addCriterion("anchorroom <", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomLessThanOrEqualTo(String value) {
            addCriterion("anchorroom <=", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomLike(String value) {
            addCriterion("anchorroom like", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomNotLike(String value) {
            addCriterion("anchorroom not like", value, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomIn(List<String> values) {
            addCriterion("anchorroom in", values, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomNotIn(List<String> values) {
            addCriterion("anchorroom not in", values, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomBetween(String value1, String value2) {
            addCriterion("anchorroom between", value1, value2, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchorroomNotBetween(String value1, String value2) {
            addCriterion("anchorroom not between", value1, value2, "anchorroom");
            return (Criteria) this;
        }

        public Criteria andAnchortypeIsNull() {
            addCriterion("anchortype is null");
            return (Criteria) this;
        }

        public Criteria andAnchortypeIsNotNull() {
            addCriterion("anchortype is not null");
            return (Criteria) this;
        }

        public Criteria andAnchortypeEqualTo(String value) {
            addCriterion("anchortype =", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeNotEqualTo(String value) {
            addCriterion("anchortype <>", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeGreaterThan(String value) {
            addCriterion("anchortype >", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeGreaterThanOrEqualTo(String value) {
            addCriterion("anchortype >=", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeLessThan(String value) {
            addCriterion("anchortype <", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeLessThanOrEqualTo(String value) {
            addCriterion("anchortype <=", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeLike(String value) {
            addCriterion("anchortype like", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeNotLike(String value) {
            addCriterion("anchortype not like", value, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeIn(List<String> values) {
            addCriterion("anchortype in", values, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeNotIn(List<String> values) {
            addCriterion("anchortype not in", values, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeBetween(String value1, String value2) {
            addCriterion("anchortype between", value1, value2, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchortypeNotBetween(String value1, String value2) {
            addCriterion("anchortype not between", value1, value2, "anchortype");
            return (Criteria) this;
        }

        public Criteria andAnchorsexIsNull() {
            addCriterion("anchorsex is null");
            return (Criteria) this;
        }

        public Criteria andAnchorsexIsNotNull() {
            addCriterion("anchorsex is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorsexEqualTo(Integer value) {
            addCriterion("anchorsex =", value, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexNotEqualTo(Integer value) {
            addCriterion("anchorsex <>", value, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexGreaterThan(Integer value) {
            addCriterion("anchorsex >", value, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchorsex >=", value, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexLessThan(Integer value) {
            addCriterion("anchorsex <", value, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexLessThanOrEqualTo(Integer value) {
            addCriterion("anchorsex <=", value, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexIn(List<Integer> values) {
            addCriterion("anchorsex in", values, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexNotIn(List<Integer> values) {
            addCriterion("anchorsex not in", values, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexBetween(Integer value1, Integer value2) {
            addCriterion("anchorsex between", value1, value2, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorsexNotBetween(Integer value1, Integer value2) {
            addCriterion("anchorsex not between", value1, value2, "anchorsex");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseIsNull() {
            addCriterion("anchorabuse is null");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseIsNotNull() {
            addCriterion("anchorabuse is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseEqualTo(Integer value) {
            addCriterion("anchorabuse =", value, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseNotEqualTo(Integer value) {
            addCriterion("anchorabuse <>", value, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseGreaterThan(Integer value) {
            addCriterion("anchorabuse >", value, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchorabuse >=", value, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseLessThan(Integer value) {
            addCriterion("anchorabuse <", value, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseLessThanOrEqualTo(Integer value) {
            addCriterion("anchorabuse <=", value, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseIn(List<Integer> values) {
            addCriterion("anchorabuse in", values, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseNotIn(List<Integer> values) {
            addCriterion("anchorabuse not in", values, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseBetween(Integer value1, Integer value2) {
            addCriterion("anchorabuse between", value1, value2, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorabuseNotBetween(Integer value1, Integer value2) {
            addCriterion("anchorabuse not between", value1, value2, "anchorabuse");
            return (Criteria) this;
        }

        public Criteria andAnchorreactIsNull() {
            addCriterion("anchorreact is null");
            return (Criteria) this;
        }

        public Criteria andAnchorreactIsNotNull() {
            addCriterion("anchorreact is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorreactEqualTo(Integer value) {
            addCriterion("anchorreact =", value, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactNotEqualTo(Integer value) {
            addCriterion("anchorreact <>", value, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactGreaterThan(Integer value) {
            addCriterion("anchorreact >", value, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchorreact >=", value, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactLessThan(Integer value) {
            addCriterion("anchorreact <", value, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactLessThanOrEqualTo(Integer value) {
            addCriterion("anchorreact <=", value, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactIn(List<Integer> values) {
            addCriterion("anchorreact in", values, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactNotIn(List<Integer> values) {
            addCriterion("anchorreact not in", values, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactBetween(Integer value1, Integer value2) {
            addCriterion("anchorreact between", value1, value2, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorreactNotBetween(Integer value1, Integer value2) {
            addCriterion("anchorreact not between", value1, value2, "anchorreact");
            return (Criteria) this;
        }

        public Criteria andAnchorvioIsNull() {
            addCriterion("anchorvio is null");
            return (Criteria) this;
        }

        public Criteria andAnchorvioIsNotNull() {
            addCriterion("anchorvio is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorvioEqualTo(Integer value) {
            addCriterion("anchorvio =", value, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioNotEqualTo(Integer value) {
            addCriterion("anchorvio <>", value, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioGreaterThan(Integer value) {
            addCriterion("anchorvio >", value, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchorvio >=", value, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioLessThan(Integer value) {
            addCriterion("anchorvio <", value, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioLessThanOrEqualTo(Integer value) {
            addCriterion("anchorvio <=", value, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioIn(List<Integer> values) {
            addCriterion("anchorvio in", values, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioNotIn(List<Integer> values) {
            addCriterion("anchorvio not in", values, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioBetween(Integer value1, Integer value2) {
            addCriterion("anchorvio between", value1, value2, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorvioNotBetween(Integer value1, Integer value2) {
            addCriterion("anchorvio not between", value1, value2, "anchorvio");
            return (Criteria) this;
        }

        public Criteria andAnchorotherIsNull() {
            addCriterion("anchorother is null");
            return (Criteria) this;
        }

        public Criteria andAnchorotherIsNotNull() {
            addCriterion("anchorother is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorotherEqualTo(Integer value) {
            addCriterion("anchorother =", value, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherNotEqualTo(Integer value) {
            addCriterion("anchorother <>", value, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherGreaterThan(Integer value) {
            addCriterion("anchorother >", value, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchorother >=", value, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherLessThan(Integer value) {
            addCriterion("anchorother <", value, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherLessThanOrEqualTo(Integer value) {
            addCriterion("anchorother <=", value, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherIn(List<Integer> values) {
            addCriterion("anchorother in", values, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherNotIn(List<Integer> values) {
            addCriterion("anchorother not in", values, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherBetween(Integer value1, Integer value2) {
            addCriterion("anchorother between", value1, value2, "anchorother");
            return (Criteria) this;
        }

        public Criteria andAnchorotherNotBetween(Integer value1, Integer value2) {
            addCriterion("anchorother not between", value1, value2, "anchorother");
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