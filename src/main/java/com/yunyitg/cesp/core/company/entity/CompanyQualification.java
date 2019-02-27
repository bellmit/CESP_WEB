package com.yunyitg.cesp.core.company.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "company_qualification")
public class CompanyQualification {
	@Id
    private Integer cid;

	@Id
    private Integer qid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }
}