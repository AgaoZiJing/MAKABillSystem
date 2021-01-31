package com.maka.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.security.Permission;
import java.util.List;
import java.util.Map;
@ApiModel
@Data
public class AccountData {
    //每个月最高收入

    @ApiModelProperty(value = "maxMouthAccountin",notes = "年度最大收入",dataType = "BigDecimal")
    private BigDecimal maxMouthAccountin;

    public BigDecimal getMaxMouthAccountin() {
        return maxMouthAccountin;
    }

    public void setMaxMouthAccountin(BigDecimal maxMouthAccountin) {
        this.maxMouthAccountin = maxMouthAccountin;
    }

    public BigDecimal getMaxMouthAccountout() {
        return maxMouthAccountout;
    }

    public void setMaxMouthAccountout(BigDecimal maxMouthAccountout) {
        this.maxMouthAccountout = maxMouthAccountout;
    }

    public BigDecimal getMaxYearAccountin() {
        return maxYearAccountin;
    }

    public void setMaxYearAccountin(BigDecimal maxYearAccountin) {
        this.maxYearAccountin = maxYearAccountin;
    }

    public BigDecimal getMaxYearAccountout() {
        return maxYearAccountout;
    }

    public void setMaxYearAccountout(BigDecimal maxYearAccountout) {
        this.maxYearAccountout = maxYearAccountout;
    }


    @ApiModelProperty(value = "maxMouthAccountout",notes = "月份最大支出",dataType = "BigDecimal")
    private BigDecimal maxMouthAccountout;
    @ApiModelProperty(value = "maxYearAccountin",notes = "月份最大收入",dataType = "BigDecimal")
    private BigDecimal maxYearAccountin;
    @ApiModelProperty(value = "maxMouthAccountout",notes = "月份最大支出",dataType = "BigDecimal")
    private BigDecimal maxYearAccountout;
    private Map<Integer, BigDecimal> eveMouthAccountin;

    public Map<Integer, BigDecimal> getEveMouthAccountin() {
        return eveMouthAccountin;
    }

    public void setEveMouthAccountin(Map<Integer, BigDecimal> eveMouthAccountin) {
        this.eveMouthAccountin = eveMouthAccountin;
    }

    public Map<Integer, BigDecimal> getEveMouthAccountout() {
        return eveMouthAccountout;
    }

    public void setEveMouthAccountout(Map<Integer, BigDecimal> eveMouthAccountout) {
        this.eveMouthAccountout = eveMouthAccountout;
    }

    private Map<Integer,BigDecimal> eveMouthAccountout;
    private Map<Integer,BigDecimal> eveYeearAccountin;
    private Map<Integer,BigDecimal> eveYeearAccountout;

    public Map<Integer, BigDecimal> getEveYeearAccountin() {
        return eveYeearAccountin;
    }

    public void setEveYeearAccountin(Map<Integer, BigDecimal> eveYeearAccountin) {
        this.eveYeearAccountin = eveYeearAccountin;
    }

    public Map<Integer, BigDecimal> getEveYeearAccountout() {
        return eveYeearAccountout;
    }

    public void setEveYeearAccountout(Map<Integer, BigDecimal> eveYeearAccountout) {
        this.eveYeearAccountout = eveYeearAccountout;
    }
}
