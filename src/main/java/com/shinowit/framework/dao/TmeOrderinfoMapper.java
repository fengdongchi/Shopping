package com.shinowit.framework.dao;

import com.shinowit.entity.TmeOrderinfo;
import com.shinowit.entity.TmeOrderinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeOrderinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int countByExample(TmeOrderinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByExample(TmeOrderinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByPrimaryKey(String billcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insert(TmeOrderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insertSelective(TmeOrderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    List<TmeOrderinfo> selectByExample(TmeOrderinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    TmeOrderinfo selectByPrimaryKey(String billcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeOrderinfo record, @Param("example") TmeOrderinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExample(@Param("record") TmeOrderinfo record, @Param("example") TmeOrderinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKeySelective(TmeOrderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKey(TmeOrderinfo record);

    List<TmeOrderinfo> selectPage(TmeOrderinfoCriteria example);

    String selectMaxPrimaryKeyValue();
}