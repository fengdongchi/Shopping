package com.shinowit.framework.dao;

import com.shinowit.entity.TbaMembeaddrinfo;
import com.shinowit.entity.TbaMembeaddrinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbaMembeaddrinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int countByExample(TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByExample(TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insert(TbaMembeaddrinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int insertSelective(TbaMembeaddrinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    List<TbaMembeaddrinfo> selectByExample(TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    TbaMembeaddrinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExampleSelective(@Param("record") TbaMembeaddrinfo record, @Param("example") TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByExample(@Param("record") TbaMembeaddrinfo record, @Param("example") TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKeySelective(TbaMembeaddrinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    int updateByPrimaryKey(TbaMembeaddrinfo record);

    List<TbaMembeaddrinfo> selectPage(TbaMembeaddrinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}