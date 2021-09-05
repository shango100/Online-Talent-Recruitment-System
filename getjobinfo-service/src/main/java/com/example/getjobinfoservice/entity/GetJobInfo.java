package com.example.getjobinfoservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetJobInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long getJobInfoID;

    private String name;

    private String sex;

    private String email;

    private String phone;

    private String address;

    private String addrNum;

    private String education;

    private String strong;

    private String experience;

    private String type;

    private String workPosition;

    private String workCity;

    private String wage;

    private String other;

    private String publicTime;

    private int lookTimes;


    public GetJobInfo() {
    }
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "person")
//    private Person person;
//
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }



    public GetJobInfo(String name,String sex ,String email ,String phone ,String address ,String addrNum ,String education,String strong,String experience ,String type ,String workPosition,String workCity, String wage, String other, String publicTime,int lookTimes) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.education = education;
        this.phone = phone;
        this.addrNum = addrNum;
        this.strong = strong;
        this.experience= experience;
        this.workPosition = workPosition;
        this.workCity = workCity;
        this.wage = wage;
        this.other = other;
        this.lookTimes = lookTimes;
        this.publicTime = publicTime;
    }



    public long getgetjobinfoid() {
        return getJobInfoID;
    }

    public void setgetjobinfoid(long getjobinfoid) {
        this.getJobInfoID = getjobinfoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getStrong() {
        return strong;
    }

    public void setStrong(String strong) {
        this.strong = strong;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public int getLookTimes() {
        return lookTimes;
    }

    public void setLookTimes(int lookTimes) {
        this.lookTimes = lookTimes;
    }
}
