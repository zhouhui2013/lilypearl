package com.next.dao;

import com.next.model.ItemPhoto;
import com.next.model.ItemPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemPhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_photo
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int countByExample(ItemPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_photo
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int deleteByExample(ItemPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_photo
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int insert(ItemPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_photo
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int insertSelective(ItemPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_photo
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    List<ItemPhoto> selectByExample(ItemPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_photo
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByExampleSelective(@Param("record") ItemPhoto record, @Param("example") ItemPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_photo
     *
     * @mbggenerated Sun Mar 10 19:51:27 JST 2013
     */
    int updateByExample(@Param("record") ItemPhoto record, @Param("example") ItemPhotoExample example);
}