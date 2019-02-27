package com.yunyitg.cesp.core.company.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "qualification_module")
public class QualificationModule {
	
	@Id
    private Integer qid;

	@Id
    private Integer mid;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}