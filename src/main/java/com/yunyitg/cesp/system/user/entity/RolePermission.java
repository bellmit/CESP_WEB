package com.yunyitg.cesp.system.user.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "role_permission")
public class RolePermission {
	@Id
    private Integer rid;

	@Id
    private Integer pid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}