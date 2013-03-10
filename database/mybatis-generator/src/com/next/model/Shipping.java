package com.next.model;

public class Shipping {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.shipping_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer shippingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.shipping_date
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String shippingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.user_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.customer_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.item_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.shipping_count
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer shippingCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shipping.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.shipping_id
     *
     * @return the value of shipping.shipping_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getShippingId() {
        return shippingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.shipping_id
     *
     * @param shippingId the value for shipping.shipping_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.shipping_date
     *
     * @return the value of shipping.shipping_date
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getShippingDate() {
        return shippingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.shipping_date
     *
     * @param shippingDate the value for shipping.shipping_date
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate == null ? null : shippingDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.user_id
     *
     * @return the value of shipping.user_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.user_id
     *
     * @param userId the value for shipping.user_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.customer_id
     *
     * @return the value of shipping.customer_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.customer_id
     *
     * @param customerId the value for shipping.customer_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.item_id
     *
     * @return the value of shipping.item_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.item_id
     *
     * @param itemId the value for shipping.item_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.shipping_count
     *
     * @return the value of shipping.shipping_count
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getShippingCount() {
        return shippingCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.shipping_count
     *
     * @param shippingCount the value for shipping.shipping_count
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setShippingCount(Integer shippingCount) {
        this.shippingCount = shippingCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shipping.deleted
     *
     * @return the value of shipping.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shipping.deleted
     *
     * @param deleted the value for shipping.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}