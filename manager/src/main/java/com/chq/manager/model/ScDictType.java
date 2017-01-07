package com.chq.manager.model;

public class ScDictType {
    private Integer typenum;

    private String typename;

    private Integer canmodify;

    private String remark;

    public Integer getTypenum() {
        return typenum;
    }

    public void setTypenum(Integer typenum) {
        this.typenum = typenum;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getCanmodify() {
        return canmodify;
    }

    public void setCanmodify(Integer canmodify) {
        this.canmodify = canmodify;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}