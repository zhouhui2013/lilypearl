package com.next.model;

public class Stock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.stock_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer stockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.item_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.item_count
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer itemCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.user_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.location
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.stock_id
     *
     * @return the value of stock.stock_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.stock_id
     *
     * @param stockId the value for stock.stock_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.item_id
     *
     * @return the value of stock.item_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.item_id
     *
     * @param itemId the value for stock.item_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.item_count
     *
     * @return the value of stock.item_count
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.item_count
     *
     * @param itemCount the value for stock.item_count
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.user_id
     *
     * @return the value of stock.user_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.user_id
     *
     * @param userId the value for stock.user_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.location
     *
     * @return the value of stock.location
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.location
     *
     * @param location the value for stock.location
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.deleted
     *
     * @return the value of stock.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.deleted
     *
     * @param deleted the value for stock.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}