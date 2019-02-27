package com.yunyitg.cesp.system.user.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import com.yunyitg.cesp.common.statics.Constant;

@Table(name = "system_config")
public class SystemConfig {
	
	@Id
    private String k;

	@Id
    private String v;
    
    public boolean isBooleanV() {
    	return Constant.TRUE.equals(v);
	}

    public String getK() {
        return k;
    }

//    public void setK(String k) {
//        this.k = k == null ? null : k.trim();
//    }
    
    public SystemConfig setK(String k) {
        this.k = k;
        return this;
    }

    public String getV() {
        return v;
    }

//    public void setV(String v) {
//        this.v = v == null ? null : v.trim();
//    }
    
    public SystemConfig setV(String v) {
        this.v = v;
        return this;
    }
}