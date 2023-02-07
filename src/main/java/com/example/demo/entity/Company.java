package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer companyId ;
    private String avatar ;
    private String name ;
    private String company;
    private String status;
    private String dueDate;
    private Integer targetAchievement;
    public Integer getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public Integer getTargetAchievement() {
        return targetAchievement;
    }
    public void setTargetAchievement(Integer targetAchievement) {
        this.targetAchievement = targetAchievement;
    }
}