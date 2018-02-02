package com.aninstein.po.example;

import java.util.ArrayList;
import java.util.List;

public class UsertbPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsertbPOExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userpassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userpassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userpassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userpassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userpassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userpassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userpassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userpassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userpassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userpassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userpassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userpassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUsergrantIsNull() {
            addCriterion("usergrant is null");
            return (Criteria) this;
        }

        public Criteria andUsergrantIsNotNull() {
            addCriterion("usergrant is not null");
            return (Criteria) this;
        }

        public Criteria andUsergrantEqualTo(Short value) {
            addCriterion("usergrant =", value, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantNotEqualTo(Short value) {
            addCriterion("usergrant <>", value, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantGreaterThan(Short value) {
            addCriterion("usergrant >", value, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantGreaterThanOrEqualTo(Short value) {
            addCriterion("usergrant >=", value, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantLessThan(Short value) {
            addCriterion("usergrant <", value, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantLessThanOrEqualTo(Short value) {
            addCriterion("usergrant <=", value, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantIn(List<Short> values) {
            addCriterion("usergrant in", values, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantNotIn(List<Short> values) {
            addCriterion("usergrant not in", values, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantBetween(Short value1, Short value2) {
            addCriterion("usergrant between", value1, value2, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUsergrantNotBetween(Short value1, Short value2) {
            addCriterion("usergrant not between", value1, value2, "usergrant");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNull() {
            addCriterion("userrealname is null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNotNull() {
            addCriterion("userrealname is not null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameEqualTo(String value) {
            addCriterion("userrealname =", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotEqualTo(String value) {
            addCriterion("userrealname <>", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThan(String value) {
            addCriterion("userrealname >", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("userrealname >=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThan(String value) {
            addCriterion("userrealname <", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThanOrEqualTo(String value) {
            addCriterion("userrealname <=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLike(String value) {
            addCriterion("userrealname like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotLike(String value) {
            addCriterion("userrealname not like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIn(List<String> values) {
            addCriterion("userrealname in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotIn(List<String> values) {
            addCriterion("userrealname not in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameBetween(String value1, String value2) {
            addCriterion("userrealname between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotBetween(String value1, String value2) {
            addCriterion("userrealname not between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUsernickIsNull() {
            addCriterion("usernick is null");
            return (Criteria) this;
        }

        public Criteria andUsernickIsNotNull() {
            addCriterion("usernick is not null");
            return (Criteria) this;
        }

        public Criteria andUsernickEqualTo(String value) {
            addCriterion("usernick =", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotEqualTo(String value) {
            addCriterion("usernick <>", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickGreaterThan(String value) {
            addCriterion("usernick >", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickGreaterThanOrEqualTo(String value) {
            addCriterion("usernick >=", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickLessThan(String value) {
            addCriterion("usernick <", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickLessThanOrEqualTo(String value) {
            addCriterion("usernick <=", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickLike(String value) {
            addCriterion("usernick like", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotLike(String value) {
            addCriterion("usernick not like", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickIn(List<String> values) {
            addCriterion("usernick in", values, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotIn(List<String> values) {
            addCriterion("usernick not in", values, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickBetween(String value1, String value2) {
            addCriterion("usernick between", value1, value2, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotBetween(String value1, String value2) {
            addCriterion("usernick not between", value1, value2, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("usertel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("usertel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("usertel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("usertel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("usertel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("usertel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("usertel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("usertel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("usertel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("usertel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("usertel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("usertel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("usertel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("usertel not between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("useremail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("useremail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("useremail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("useremail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("useremail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("useremail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("useremail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("useremail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("useremail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("useremail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("useremail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("useremail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("useremail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("useremail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoIsNull() {
            addCriterion("userqiandao is null");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoIsNotNull() {
            addCriterion("userqiandao is not null");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoEqualTo(String value) {
            addCriterion("userqiandao =", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoNotEqualTo(String value) {
            addCriterion("userqiandao <>", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoGreaterThan(String value) {
            addCriterion("userqiandao >", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoGreaterThanOrEqualTo(String value) {
            addCriterion("userqiandao >=", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoLessThan(String value) {
            addCriterion("userqiandao <", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoLessThanOrEqualTo(String value) {
            addCriterion("userqiandao <=", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoLike(String value) {
            addCriterion("userqiandao like", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoNotLike(String value) {
            addCriterion("userqiandao not like", value, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoIn(List<String> values) {
            addCriterion("userqiandao in", values, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoNotIn(List<String> values) {
            addCriterion("userqiandao not in", values, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoBetween(String value1, String value2) {
            addCriterion("userqiandao between", value1, value2, "userqiandao");
            return (Criteria) this;
        }

        public Criteria andUserqiandaoNotBetween(String value1, String value2) {
            addCriterion("userqiandao not between", value1, value2, "userqiandao");
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