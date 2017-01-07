package com.chq.manager.model;

public class ScDict extends ScDictKey {
    private String dictcode;

    private String dictname;

    private Integer parentdictnum;

    private String remark;

    public String getDictcode() {
        return dictcode;
    }

    public void setDictcode(String dictcode) {
        this.dictcode = dictcode == null ? null : dictcode.trim();
    }

    public String getDictname() {
        return dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname == null ? null : dictname.trim();
    }

    public Integer getParentdictnum() {
        return parentdictnum;
    }

    public void setParentdictnum(Integer parentdictnum) {
        this.parentdictnum = parentdictnum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}