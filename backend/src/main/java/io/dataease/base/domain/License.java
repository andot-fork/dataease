package io.dataease.base.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

public class License implements Serializable {
    @ApiModelProperty("")
    private String id;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("license")
    private String license;

    @ApiModelProperty("F2C License")
    private String f2cLicense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table license
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column license.id
     *
     * @return the value of license.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column license.id
     *
     * @param id the value for license.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column license.update_time
     *
     * @return the value of license.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column license.update_time
     *
     * @param updateTime the value for license.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column license.license
     *
     * @return the value of license.license
     *
     * @mbg.generated
     */
    public String getLicense() {
        return license;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column license.license
     *
     * @param license the value for license.license
     *
     * @mbg.generated
     */
    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column license.f2c_license
     *
     * @return the value of license.f2c_license
     *
     * @mbg.generated
     */
    public String getF2cLicense() {
        return f2cLicense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column license.f2c_license
     *
     * @param f2cLicense the value for license.f2c_license
     *
     * @mbg.generated
     */
    public void setF2cLicense(String f2cLicense) {
        this.f2cLicense = f2cLicense == null ? null : f2cLicense.trim();
    }
}