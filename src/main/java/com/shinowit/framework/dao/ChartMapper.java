package com.shinowit.framework.dao;

import com.shinowit.entity.Chart;
import com.shinowit.entity.ChartCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int countByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insert(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insertSelective(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    List<Chart> selectByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    Chart selectByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExampleSelective(@Param("record") Chart record, @Param("example") ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExample(@Param("record") Chart record, @Param("example") ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKeySelective(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKey(Chart record);

    List<Chart> selectPage(ChartCriteria example);

    String selectMaxPrimaryKeyValue();
}