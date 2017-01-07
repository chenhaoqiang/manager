package com.chq.manager.model;

import java.util.Date;

public class TdTaskList extends TdTaskListKey {
    private String taskname;

    private Date createdate;

    private Date createtime;

    private Date modifytime;

    private Integer recflag;

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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

    public Integer getRecflag() {
        return recflag;
    }

    public void setRecflag(Integer recflag) {
        this.recflag = recflag;
    }
}