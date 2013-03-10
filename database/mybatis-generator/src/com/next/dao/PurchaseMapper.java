package com.next.dao;

import com.next.model.Purchase;
import com.next.model.PurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int countByExample(PurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int deleteByExample(PurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int deleteByPrimaryKey(Integer purchaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int insert(Purchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int insertSelective(Purchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    List<Purchase> selectByExample(PurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    Purchase selectByPrimaryKey(Integer purchaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByPrimaryKeySelective(Purchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByPrimaryKey(Purchase record);
}