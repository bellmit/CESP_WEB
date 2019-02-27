package com.yunyitg.cesp.system.user.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nickname;

    private String name;

    private String email;

    private String password;

    private Integer companyId;

    private Date lastLoginTime;

    private Byte status;

    private String note;

    private Date createAt;

    private Integer createUserId;

    private Date updateAt;

    private Integer updateUserId;
    
    @Transient
	private Boolean rememberMe;
    
    public User() {
	}
    
    public User(User user) {
    	this.id = user.getId();
    	this.createAt= user.getCreateAt();
    	this.nickname = user.getNickname();
    	this.name = user.getName();
    	this.email = user.getEmail();
    	this.password = user.getPassword();
    	this.companyId= user.getCompanyId();
    	this.lastLoginTime = user.getLastLoginTime();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
    
    public Boolean getRememberMe() {
		return rememberMe;
	}
    
    public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
    
    @Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }
}