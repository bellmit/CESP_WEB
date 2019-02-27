package com.yunyitg.cesp.system.user.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user_role")
public class UserRole {
	@Id
    private Integer uid;

	@Id
    private Integer rid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}