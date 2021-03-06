package com.shinowit.entity;

import java.io.Serializable;

public class TmeUnitinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_UnitInfo.UnitID
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private Short unitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_UnitInfo.Name
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_UnitInfo.Remark
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_UnitInfo.Status
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_UnitInfo.UnitID
     *
     * @return the value of TMe_UnitInfo.UnitID
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public Short getUnitid() {
        return unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_UnitInfo.UnitID
     *
     * @param unitid the value for TMe_UnitInfo.UnitID
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setUnitid(Short unitid) {
        this.unitid = unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_UnitInfo.Name
     *
     * @return the value of TMe_UnitInfo.Name
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_UnitInfo.Name
     *
     * @param name the value for TMe_UnitInfo.Name
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_UnitInfo.Remark
     *
     * @return the value of TMe_UnitInfo.Remark
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_UnitInfo.Remark
     *
     * @param remark the value for TMe_UnitInfo.Remark
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_UnitInfo.Status
     *
     * @return the value of TMe_UnitInfo.Status
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_UnitInfo.Status
     *
     * @param status the value for TMe_UnitInfo.Status
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TmeUnitinfo other = (TmeUnitinfo) that;
        return (this.getUnitid() == null ? other.getUnitid() == null : this.getUnitid().equals(other.getUnitid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUnitid() == null) ? 0 : getUnitid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}