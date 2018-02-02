package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.List;

public class YoutiaoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YoutiaoPOExample() {
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

        public Criteria andUserlevelIsNull() {
            addCriterion("userlevel is null");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNotNull() {
            addCriterion("userlevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserlevelEqualTo(String value) {
            addCriterion("userlevel =", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotEqualTo(String value) {
            addCriterion("userlevel <>", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThan(String value) {
            addCriterion("userlevel >", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThanOrEqualTo(String value) {
            addCriterion("userlevel >=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThan(String value) {
            addCriterion("userlevel <", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThanOrEqualTo(String value) {
            addCriterion("userlevel <=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLike(String value) {
            addCriterion("userlevel like", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotLike(String value) {
            addCriterion("userlevel not like", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelIn(List<String> values) {
            addCriterion("userlevel in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotIn(List<String> values) {
            addCriterion("userlevel not in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelBetween(String value1, String value2) {
            addCriterion("userlevel between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotBetween(String value1, String value2) {
            addCriterion("userlevel not between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDmcontentIsNull() {
            addCriterion("dmcontent is null");
            return (Criteria) this;
        }

        public Criteria andDmcontentIsNotNull() {
            addCriterion("dmcontent is not null");
            return (Criteria) this;
        }

        public Criteria andDmcontentEqualTo(String value) {
            addCriterion("dmcontent =", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentNotEqualTo(String value) {
            addCriterion("dmcontent <>", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentGreaterThan(String value) {
            addCriterion("dmcontent >", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentGreaterThanOrEqualTo(String value) {
            addCriterion("dmcontent >=", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentLessThan(String value) {
            addCriterion("dmcontent <", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentLessThanOrEqualTo(String value) {
            addCriterion("dmcontent <=", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentLike(String value) {
            addCriterion("dmcontent like", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentNotLike(String value) {
            addCriterion("dmcontent not like", value, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentIn(List<String> values) {
            addCriterion("dmcontent in", values, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentNotIn(List<String> values) {
            addCriterion("dmcontent not in", values, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentBetween(String value1, String value2) {
            addCriterion("dmcontent between", value1, value2, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmcontentNotBetween(String value1, String value2) {
            addCriterion("dmcontent not between", value1, value2, "dmcontent");
            return (Criteria) this;
        }

        public Criteria andDmdataIsNull() {
            addCriterion("dmdata is null");
            return (Criteria) this;
        }

        public Criteria andDmdataIsNotNull() {
            addCriterion("dmdata is not null");
            return (Criteria) this;
        }

        public Criteria andDmdataEqualTo(String value) {
            addCriterion("dmdata =", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataNotEqualTo(String value) {
            addCriterion("dmdata <>", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataGreaterThan(String value) {
            addCriterion("dmdata >", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataGreaterThanOrEqualTo(String value) {
            addCriterion("dmdata >=", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataLessThan(String value) {
            addCriterion("dmdata <", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataLessThanOrEqualTo(String value) {
            addCriterion("dmdata <=", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataLike(String value) {
            addCriterion("dmdata like", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataNotLike(String value) {
            addCriterion("dmdata not like", value, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataIn(List<String> values) {
            addCriterion("dmdata in", values, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataNotIn(List<String> values) {
            addCriterion("dmdata not in", values, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataBetween(String value1, String value2) {
            addCriterion("dmdata between", value1, value2, "dmdata");
            return (Criteria) this;
        }

        public Criteria andDmdataNotBetween(String value1, String value2) {
            addCriterion("dmdata not between", value1, value2, "dmdata");
            return (Criteria) this;
        }

        public Criteria andPosIsNull() {
            addCriterion("pos is null");
            return (Criteria) this;
        }

        public Criteria andPosIsNotNull() {
            addCriterion("pos is not null");
            return (Criteria) this;
        }

        public Criteria andPosEqualTo(String value) {
            addCriterion("pos =", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotEqualTo(String value) {
            addCriterion("pos <>", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThan(String value) {
            addCriterion("pos >", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThanOrEqualTo(String value) {
            addCriterion("pos >=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThan(String value) {
            addCriterion("pos <", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThanOrEqualTo(String value) {
            addCriterion("pos <=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLike(String value) {
            addCriterion("pos like", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotLike(String value) {
            addCriterion("pos not like", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosIn(List<String> values) {
            addCriterion("pos in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotIn(List<String> values) {
            addCriterion("pos not in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosBetween(String value1, String value2) {
            addCriterion("pos between", value1, value2, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotBetween(String value1, String value2) {
            addCriterion("pos not between", value1, value2, "pos");
            return (Criteria) this;
        }

        public Criteria andNegIsNull() {
            addCriterion("neg is null");
            return (Criteria) this;
        }

        public Criteria andNegIsNotNull() {
            addCriterion("neg is not null");
            return (Criteria) this;
        }

        public Criteria andNegEqualTo(String value) {
            addCriterion("neg =", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegNotEqualTo(String value) {
            addCriterion("neg <>", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegGreaterThan(String value) {
            addCriterion("neg >", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegGreaterThanOrEqualTo(String value) {
            addCriterion("neg >=", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegLessThan(String value) {
            addCriterion("neg <", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegLessThanOrEqualTo(String value) {
            addCriterion("neg <=", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegLike(String value) {
            addCriterion("neg like", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegNotLike(String value) {
            addCriterion("neg not like", value, "neg");
            return (Criteria) this;
        }

        public Criteria andNegIn(List<String> values) {
            addCriterion("neg in", values, "neg");
            return (Criteria) this;
        }

        public Criteria andNegNotIn(List<String> values) {
            addCriterion("neg not in", values, "neg");
            return (Criteria) this;
        }

        public Criteria andNegBetween(String value1, String value2) {
            addCriterion("neg between", value1, value2, "neg");
            return (Criteria) this;
        }

        public Criteria andNegNotBetween(String value1, String value2) {
            addCriterion("neg not between", value1, value2, "neg");
            return (Criteria) this;
        }

        public Criteria andDmsumIsNull() {
            addCriterion("dmsum is null");
            return (Criteria) this;
        }

        public Criteria andDmsumIsNotNull() {
            addCriterion("dmsum is not null");
            return (Criteria) this;
        }

        public Criteria andDmsumEqualTo(Integer value) {
            addCriterion("dmsum =", value, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumNotEqualTo(Integer value) {
            addCriterion("dmsum <>", value, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumGreaterThan(Integer value) {
            addCriterion("dmsum >", value, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dmsum >=", value, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumLessThan(Integer value) {
            addCriterion("dmsum <", value, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumLessThanOrEqualTo(Integer value) {
            addCriterion("dmsum <=", value, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumIn(List<Integer> values) {
            addCriterion("dmsum in", values, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumNotIn(List<Integer> values) {
            addCriterion("dmsum not in", values, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumBetween(Integer value1, Integer value2) {
            addCriterion("dmsum between", value1, value2, "dmsum");
            return (Criteria) this;
        }

        public Criteria andDmsumNotBetween(Integer value1, Integer value2) {
            addCriterion("dmsum not between", value1, value2, "dmsum");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(Integer value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(Integer value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(Integer value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(Integer value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(Integer value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<Integer> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<Integer> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(Integer value1, Integer value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("ratio is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(Float value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(Float value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(Float value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(Float value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(Float value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<Float> values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<Float> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(Float value1, Float value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(Float value1, Float value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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