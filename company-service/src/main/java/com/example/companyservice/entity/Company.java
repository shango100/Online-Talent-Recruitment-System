package com.example.companyservice.entity;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long companyId;
    /** name of the company */
    private String name;
    /** password for employer account */
    private String password;
    /** employer email */
    private String email;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy="company")
//    private List<News> newsList;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy="company")
//    private List<GiveJobInfo> jobInfoList;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy="company")
//    private List<Resume> companyResumeList;
//
//    public List<News> getNewsList() {
//        return newsList;
//    }

//    public void setNewsList(List<News> newsList) {
//        this.newsList = newsList;
//    }
//
//    public List<GiveJobInfo> getJobInfoList() {
//        return jobInfoList;
//    }
//
//    public void setJobInfoList(List<GiveJobInfo> jobInfoList) {
//        this.jobInfoList = jobInfoList;
//    }
//
//    public List<Resume> getCompanyResumeList() {
//        return companyResumeList;
//    }
//
//    public void setCompanyResumeList(List<Resume> companyResumeList) {
//        this.companyResumeList = companyResumeList;
//    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company() {
    }

    public Company(String name, String password, String email) {
        this.name=name;
        this.password = password;
        this.email = email;}
}
