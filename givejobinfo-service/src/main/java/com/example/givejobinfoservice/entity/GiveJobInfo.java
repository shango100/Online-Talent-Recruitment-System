package com.example.givejobinfoservice.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class GiveJobInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long giveJobInfoId;

    private String companyName;
    /** Type of company*/
    private String vocation;
    /** email address of company*/
    private String email;
    /** Phone numbver of company*/
    private String phone;
    /** address of company*/
    private String address;
    /** postal code of company*/
    private String addrNum;
    /** position offered*/
    private String workposition;
    /** number of available positions*/
    private int giveNum;
    /** city in which job is available*/
    private String workCity;
    /** job description */
    private String description;
    /** requirements for the job */
    private String requirements;
    /** publication time */
    private Date publicTime;
    /** number of hits or number of views */
    private int lookTimes;

    public GiveJobInfo() {
    }
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "company")
//    private Company company;
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public long getGiveJobInfoId() {
        return giveJobInfoId;
    }

    public void setGiveJobInfoId(long giveJobInfoId) {
        this.giveJobInfoId = giveJobInfoId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddrNum() {
        return addrNum;
    }

    public void setAddrNum(String addrNum) {
        this.addrNum = addrNum;
    }

    public String getWorkposition() {
        return workposition;
    }

    public void setWorkposition(String workposition) {
        this.workposition = workposition;
    }

    public int getGiveNum() {
        return giveNum;
    }

    public void setGiveNum(int giveNum) {
        this.giveNum = giveNum;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public int getLookTimes() {
        return lookTimes;
    }

    public void setLookTimes(int lookTimes) {
        this.lookTimes = lookTimes;
    }



}
