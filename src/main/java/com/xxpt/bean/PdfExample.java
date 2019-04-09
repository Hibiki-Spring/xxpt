package com.xxpt.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdfExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public PdfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
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

        public Criteria andPdfIdIsNull() {
            addCriterion("pdf_id is null");
            return (Criteria) this;
        }

        public Criteria andPdfIdIsNotNull() {
            addCriterion("pdf_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdfIdEqualTo(Integer value) {
            addCriterion("pdf_id =", value, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdNotEqualTo(Integer value) {
            addCriterion("pdf_id <>", value, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdGreaterThan(Integer value) {
            addCriterion("pdf_id >", value, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdf_id >=", value, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdLessThan(Integer value) {
            addCriterion("pdf_id <", value, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdLessThanOrEqualTo(Integer value) {
            addCriterion("pdf_id <=", value, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdIn(List<Integer> values) {
            addCriterion("pdf_id in", values, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdNotIn(List<Integer> values) {
            addCriterion("pdf_id not in", values, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdBetween(Integer value1, Integer value2) {
            addCriterion("pdf_id between", value1, value2, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pdf_id not between", value1, value2, "pdfId");
            return (Criteria) this;
        }

        public Criteria andPdfNameIsNull() {
            addCriterion("pdf_name is null");
            return (Criteria) this;
        }

        public Criteria andPdfNameIsNotNull() {
            addCriterion("pdf_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdfNameEqualTo(String value) {
            addCriterion("pdf_name =", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotEqualTo(String value) {
            addCriterion("pdf_name <>", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameGreaterThan(String value) {
            addCriterion("pdf_name >", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_name >=", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLessThan(String value) {
            addCriterion("pdf_name <", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLessThanOrEqualTo(String value) {
            addCriterion("pdf_name <=", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLike(String value) {
            addCriterion("pdf_name like", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotLike(String value) {
            addCriterion("pdf_name not like", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameIn(List<String> values) {
            addCriterion("pdf_name in", values, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotIn(List<String> values) {
            addCriterion("pdf_name not in", values, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameBetween(String value1, String value2) {
            addCriterion("pdf_name between", value1, value2, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotBetween(String value1, String value2) {
            addCriterion("pdf_name not between", value1, value2, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfPathIsNull() {
            addCriterion("pdf_path is null");
            return (Criteria) this;
        }

        public Criteria andPdfPathIsNotNull() {
            addCriterion("pdf_path is not null");
            return (Criteria) this;
        }

        public Criteria andPdfPathEqualTo(String value) {
            addCriterion("pdf_path =", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotEqualTo(String value) {
            addCriterion("pdf_path <>", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThan(String value) {
            addCriterion("pdf_path >", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_path >=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThan(String value) {
            addCriterion("pdf_path <", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThanOrEqualTo(String value) {
            addCriterion("pdf_path <=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLike(String value) {
            addCriterion("pdf_path like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotLike(String value) {
            addCriterion("pdf_path not like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathIn(List<String> values) {
            addCriterion("pdf_path in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotIn(List<String> values) {
            addCriterion("pdf_path not in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathBetween(String value1, String value2) {
            addCriterion("pdf_path between", value1, value2, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotBetween(String value1, String value2) {
            addCriterion("pdf_path not between", value1, value2, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorIsNull() {
            addCriterion("pdf_author is null");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorIsNotNull() {
            addCriterion("pdf_author is not null");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorEqualTo(String value) {
            addCriterion("pdf_author =", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorNotEqualTo(String value) {
            addCriterion("pdf_author <>", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorGreaterThan(String value) {
            addCriterion("pdf_author >", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_author >=", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorLessThan(String value) {
            addCriterion("pdf_author <", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorLessThanOrEqualTo(String value) {
            addCriterion("pdf_author <=", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorLike(String value) {
            addCriterion("pdf_author like", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorNotLike(String value) {
            addCriterion("pdf_author not like", value, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorIn(List<String> values) {
            addCriterion("pdf_author in", values, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorNotIn(List<String> values) {
            addCriterion("pdf_author not in", values, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorBetween(String value1, String value2) {
            addCriterion("pdf_author between", value1, value2, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfAuthorNotBetween(String value1, String value2) {
            addCriterion("pdf_author not between", value1, value2, "pdfAuthor");
            return (Criteria) this;
        }

        public Criteria andPdfTimeIsNull() {
            addCriterion("pdf_time is null");
            return (Criteria) this;
        }

        public Criteria andPdfTimeIsNotNull() {
            addCriterion("pdf_time is not null");
            return (Criteria) this;
        }

        public Criteria andPdfTimeEqualTo(Date value) {
            addCriterion("pdf_time =", value, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeNotEqualTo(Date value) {
            addCriterion("pdf_time <>", value, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeGreaterThan(Date value) {
            addCriterion("pdf_time >", value, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pdf_time >=", value, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeLessThan(Date value) {
            addCriterion("pdf_time <", value, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeLessThanOrEqualTo(Date value) {
            addCriterion("pdf_time <=", value, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeIn(List<Date> values) {
            addCriterion("pdf_time in", values, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeNotIn(List<Date> values) {
            addCriterion("pdf_time not in", values, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeBetween(Date value1, Date value2) {
            addCriterion("pdf_time between", value1, value2, "pdfTime");
            return (Criteria) this;
        }

        public Criteria andPdfTimeNotBetween(Date value1, Date value2) {
            addCriterion("pdf_time not between", value1, value2, "pdfTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pdf
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 09 15:39:22 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pdf
     *
     * @mbg.generated Tue Apr 09 15:39:22 CST 2019
     */
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