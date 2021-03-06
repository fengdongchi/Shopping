package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Chart implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Chart.MerchandiseID
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private String merchandiseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Chart.MerchandiseName
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private String merchandisename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Chart.Price
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Chart.Describe
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private String describe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Chart.PicPath
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private String picpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Chart.MerchandiseID
     *
     * @return the value of Chart.MerchandiseID
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public String getMerchandiseid() {
        return merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Chart.MerchandiseID
     *
     * @param merchandiseid the value for Chart.MerchandiseID
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setMerchandiseid(String merchandiseid) {
        this.merchandiseid = merchandiseid == null ? null : merchandiseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Chart.MerchandiseName
     *
     * @return the value of Chart.MerchandiseName
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public String getMerchandisename() {
        return merchandisename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Chart.MerchandiseName
     *
     * @param merchandisename the value for Chart.MerchandiseName
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setMerchandisename(String merchandisename) {
        this.merchandisename = merchandisename == null ? null : merchandisename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Chart.Price
     *
     * @return the value of Chart.Price
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Chart.Price
     *
     * @param price the value for Chart.Price
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Chart.Describe
     *
     * @return the value of Chart.Describe
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Chart.Describe
     *
     * @param describe the value for Chart.Describe
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Chart.PicPath
     *
     * @return the value of Chart.PicPath
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Chart.PicPath
     *
     * @param picpath the value for Chart.PicPath
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
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
        Chart other = (Chart) that;
        return (this.getMerchandiseid() == null ? other.getMerchandiseid() == null : this.getMerchandiseid().equals(other.getMerchandiseid()))
            && (this.getMerchandisename() == null ? other.getMerchandisename() == null : this.getMerchandisename().equals(other.getMerchandisename()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDescribe() == null ? other.getDescribe() == null : this.getDescribe().equals(other.getDescribe()))
            && (this.getPicpath() == null ? other.getPicpath() == null : this.getPicpath().equals(other.getPicpath()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Chart
     *
     * @mbggenerated Tue Jan 06 09:25:24 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerchandiseid() == null) ? 0 : getMerchandiseid().hashCode());
        result = prime * result + ((getMerchandisename() == null) ? 0 : getMerchandisename().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDescribe() == null) ? 0 : getDescribe().hashCode());
        result = prime * result + ((getPicpath() == null) ? 0 : getPicpath().hashCode());
        return result;
    }
}