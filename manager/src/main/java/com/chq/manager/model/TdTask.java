package com.chq.manager.model;

import java.util.Date;

public class TdTask extends TdTaskKey {
    private Integer typenum;

    private Integer levelnum;

    private Integer status;

    private Date createtime;

    private Date modifytime;

    private Date completetime;

    private Integer isremind;

    private Integer remindtypenum;

    private Date remindtime;

    private Integer remindinterval;

    private Integer intervalunit;

    public Integer getTypenum() {
        return typenum;
    }

    public void setTypenum(Integer typenum) {
        this.typenum = typenum;
    }

    public Integer getLevelnum() {
        return levelnum;
    }

    public void setLevelnum(Integer levelnum) {
        this.levelnum = levelnum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public Integer getIsremind() {
        return isremind;
    }

    public void setIsremind(Integer isremind) {
        this.isremind = isremind;
    }

    public Integer getRemindtypenum() {
        return remindtypenum;
    }

    public void setRemindtypenum(Integer remindtypenum) {
        this.remindtypenum = remindtypenum;
    }

    public Date getRemindtime() {
        return remindtime;
    }

    public void setRemindtime(Date remindtime) {
        this.remindtime = remindtime;
    }

    public Integer getRemindinterval() {
        return remindinterval;
    }

    public void setRemindinterval(Integer remindinterval) {
        this.remindinterval = remindinterval;
    }

    public Integer getIntervalunit() {
        return intervalunit;
    }

    public void setIntervalunit(Integer intervalunit) {
        this.intervalunit = intervalunit;
    }
}