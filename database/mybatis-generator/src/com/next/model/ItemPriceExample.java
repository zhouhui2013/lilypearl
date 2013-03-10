package com.next.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemPriceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public ItemPriceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
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
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
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

        public Criteria andItemPriceIdIsNull() {
            addCriterion("item_price_id is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdIsNotNull() {
            addCriterion("item_price_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdEqualTo(Integer value) {
            addCriterion("item_price_id =", value, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdNotEqualTo(Integer value) {
            addCriterion("item_price_id <>", value, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdGreaterThan(Integer value) {
            addCriterion("item_price_id >", value, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_price_id >=", value, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdLessThan(Integer value) {
            addCriterion("item_price_id <", value, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_price_id <=", value, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdIn(List<Integer> values) {
            addCriterion("item_price_id in", values, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdNotIn(List<Integer> values) {
            addCriterion("item_price_id not in", values, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdBetween(Integer value1, Integer value2) {
            addCriterion("item_price_id between", value1, value2, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemPriceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_price_id not between", value1, value2, "itemPriceId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andSellingPriceIsNull() {
            addCriterion("selling_price is null");
            return (Criteria) this;
        }

        public Criteria andSellingPriceIsNotNull() {
            addCriterion("selling_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellingPriceEqualTo(BigDecimal value) {
            addCriterion("selling_price =", value, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceNotEqualTo(BigDecimal value) {
            addCriterion("selling_price <>", value, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceGreaterThan(BigDecimal value) {
            addCriterion("selling_price >", value, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("selling_price >=", value, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceLessThan(BigDecimal value) {
            addCriterion("selling_price <", value, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("selling_price <=", value, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceIn(List<BigDecimal> values) {
            addCriterion("selling_price in", values, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceNotIn(List<BigDecimal> values) {
            addCriterion("selling_price not in", values, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("selling_price between", value1, value2, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andSellingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("selling_price not between", value1, value2, "sellingPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(Integer value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(Integer value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(Integer value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(Integer value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(Integer value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<Integer> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<Integer> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(Integer value1, Integer value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateIsNull() {
            addCriterion("discount_start_date is null");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateIsNotNull() {
            addCriterion("discount_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateEqualTo(String value) {
            addCriterion("discount_start_date =", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateNotEqualTo(String value) {
            addCriterion("discount_start_date <>", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateGreaterThan(String value) {
            addCriterion("discount_start_date >", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("discount_start_date >=", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateLessThan(String value) {
            addCriterion("discount_start_date <", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateLessThanOrEqualTo(String value) {
            addCriterion("discount_start_date <=", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateLike(String value) {
            addCriterion("discount_start_date like", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateNotLike(String value) {
            addCriterion("discount_start_date not like", value, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateIn(List<String> values) {
            addCriterion("discount_start_date in", values, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateNotIn(List<String> values) {
            addCriterion("discount_start_date not in", values, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateBetween(String value1, String value2) {
            addCriterion("discount_start_date between", value1, value2, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountStartDateNotBetween(String value1, String value2) {
            addCriterion("discount_start_date not between", value1, value2, "discountStartDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateIsNull() {
            addCriterion("discount_end_date is null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateIsNotNull() {
            addCriterion("discount_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateEqualTo(String value) {
            addCriterion("discount_end_date =", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateNotEqualTo(String value) {
            addCriterion("discount_end_date <>", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateGreaterThan(String value) {
            addCriterion("discount_end_date >", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("discount_end_date >=", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateLessThan(String value) {
            addCriterion("discount_end_date <", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateLessThanOrEqualTo(String value) {
            addCriterion("discount_end_date <=", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateLike(String value) {
            addCriterion("discount_end_date like", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateNotLike(String value) {
            addCriterion("discount_end_date not like", value, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateIn(List<String> values) {
            addCriterion("discount_end_date in", values, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateNotIn(List<String> values) {
            addCriterion("discount_end_date not in", values, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateBetween(String value1, String value2) {
            addCriterion("discount_end_date between", value1, value2, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andDiscountEndDateNotBetween(String value1, String value2) {
            addCriterion("discount_end_date not between", value1, value2, "discountEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateIsNull() {
            addCriterion("selling_start_date is null");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateIsNotNull() {
            addCriterion("selling_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateEqualTo(String value) {
            addCriterion("selling_start_date =", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateNotEqualTo(String value) {
            addCriterion("selling_start_date <>", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateGreaterThan(String value) {
            addCriterion("selling_start_date >", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("selling_start_date >=", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateLessThan(String value) {
            addCriterion("selling_start_date <", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateLessThanOrEqualTo(String value) {
            addCriterion("selling_start_date <=", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateLike(String value) {
            addCriterion("selling_start_date like", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateNotLike(String value) {
            addCriterion("selling_start_date not like", value, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateIn(List<String> values) {
            addCriterion("selling_start_date in", values, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateNotIn(List<String> values) {
            addCriterion("selling_start_date not in", values, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateBetween(String value1, String value2) {
            addCriterion("selling_start_date between", value1, value2, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingStartDateNotBetween(String value1, String value2) {
            addCriterion("selling_start_date not between", value1, value2, "sellingStartDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateIsNull() {
            addCriterion("selling_end_date is null");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateIsNotNull() {
            addCriterion("selling_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateEqualTo(String value) {
            addCriterion("selling_end_date =", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateNotEqualTo(String value) {
            addCriterion("selling_end_date <>", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateGreaterThan(String value) {
            addCriterion("selling_end_date >", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("selling_end_date >=", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateLessThan(String value) {
            addCriterion("selling_end_date <", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateLessThanOrEqualTo(String value) {
            addCriterion("selling_end_date <=", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateLike(String value) {
            addCriterion("selling_end_date like", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateNotLike(String value) {
            addCriterion("selling_end_date not like", value, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateIn(List<String> values) {
            addCriterion("selling_end_date in", values, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateNotIn(List<String> values) {
            addCriterion("selling_end_date not in", values, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateBetween(String value1, String value2) {
            addCriterion("selling_end_date between", value1, value2, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingEndDateNotBetween(String value1, String value2) {
            addCriterion("selling_end_date not between", value1, value2, "sellingEndDate");
            return (Criteria) this;
        }

        public Criteria andSellingLocationIsNull() {
            addCriterion("selling_location is null");
            return (Criteria) this;
        }

        public Criteria andSellingLocationIsNotNull() {
            addCriterion("selling_location is not null");
            return (Criteria) this;
        }

        public Criteria andSellingLocationEqualTo(String value) {
            addCriterion("selling_location =", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationNotEqualTo(String value) {
            addCriterion("selling_location <>", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationGreaterThan(String value) {
            addCriterion("selling_location >", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationGreaterThanOrEqualTo(String value) {
            addCriterion("selling_location >=", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationLessThan(String value) {
            addCriterion("selling_location <", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationLessThanOrEqualTo(String value) {
            addCriterion("selling_location <=", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationLike(String value) {
            addCriterion("selling_location like", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationNotLike(String value) {
            addCriterion("selling_location not like", value, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationIn(List<String> values) {
            addCriterion("selling_location in", values, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationNotIn(List<String> values) {
            addCriterion("selling_location not in", values, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationBetween(String value1, String value2) {
            addCriterion("selling_location between", value1, value2, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andSellingLocationNotBetween(String value1, String value2) {
            addCriterion("selling_location not between", value1, value2, "sellingLocation");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table item_price
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 10 19:51:27 JST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table item_price
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
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