package com.chq.manager.model;

public class ScSysConfig {
    private Integer cfgnum;

    private String cfgvalue;

    private String remark;

    public Integer getCfgnum() {
        return cfgnum;
    }

    public void setCfgnum(Integer cfgnum) {
        this.cfgnum = cfgnum;
    }

    public String getCfgvalue() {
        return cfgvalue;
    }

    public void setCfgvalue(String cfgvalue) {
        this.cfgvalue = cfgvalue == null ? null : cfgvalue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}