package com.next.dao;

import com.next.model.Shipping;
import com.next.model.ShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int countByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int deleteByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int deleteByPrimaryKey(Integer shippingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int insertSelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    List<Shipping> selectByExample(ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    Shipping selectByPrimaryKey(Integer shippingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByExampleSelective(@Param("record") Shipping record, @Param("example") ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByExample(@Param("record") Shipping record, @Param("example") ShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByPrimaryKey(Shipping record);
}