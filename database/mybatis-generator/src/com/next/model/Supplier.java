package com.next.model;

public class Supplier {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Integer supplierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_name
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String supplierName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_short_name
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String supplierShortName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_address
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String supplierAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_telphone
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String supplierTelphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.comment
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_id
     *
     * @return the value of supplier.supplier_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_id
     *
     * @param supplierId the value for supplier.supplier_id
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_name
     *
     * @return the value of supplier.supplier_name
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_name
     *
     * @param supplierName the value for supplier.supplier_name
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_short_name
     *
     * @return the value of supplier.supplier_short_name
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getSupplierShortName() {
        return supplierShortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_short_name
     *
     * @param supplierShortName the value for supplier.supplier_short_name
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setSupplierShortName(String supplierShortName) {
        this.supplierShortName = supplierShortName == null ? null : supplierShortName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_address
     *
     * @return the value of supplier.supplier_address
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_address
     *
     * @param supplierAddress the value for supplier.supplier_address
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_telphone
     *
     * @return the value of supplier.supplier_telphone
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getSupplierTelphone() {
        return supplierTelphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_telphone
     *
     * @param supplierTelphone the value for supplier.supplier_telphone
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setSupplierTelphone(String supplierTelphone) {
        this.supplierTelphone = supplierTelphone == null ? null : supplierTelphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.comment
     *
     * @return the value of supplier.comment
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.comment
     *
     * @param comment the value for supplier.comment
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.deleted
     *
     * @return the value of supplier.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.deleted
     *
     * @param deleted the value for supplier.deleted
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}