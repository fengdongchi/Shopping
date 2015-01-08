package com.shinowit.framework.dao;

import com.shinowit.entity.TmeMerchandisecinfo;
import com.shinowit.entity.TmeMerchandisecinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeMerchandisecinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int countByExample(TmeMerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByExample(TmeMerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByPrimaryKey(String merchandisecid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insert(TmeMerchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insertSelective(TmeMerchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    List<TmeMerchandisecinfo> selectByExample(TmeMerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    TmeMerchandisecinfo selectByPrimaryKey(String merchandisecid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeMerchandisecinfo record, @Param("example") TmeMerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExample(@Param("record") TmeMerchandisecinfo record, @Param("example") TmeMerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKeySelective(TmeMerchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKey(TmeMerchandisecinfo record);

    List<TmeMerchandisecinfo> selectPage(TmeMerchandisecinfoCriteria example);

    String selectMaxPrimaryKeyValue();
}