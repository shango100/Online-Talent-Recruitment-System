package com.example.personservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personID;
    /** name of person*/
    private String name;
    /** password of user account*/
    private String password;
    /** email address of jobseeker*/
    private String email;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy="person")
//    private List<Resume> resumeList;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy="person")
//    private List<GetJobInfo> getJobInfoList;
//
//    public List<Resume> getResumeList() {
//        return resumeList;
//    }
//
//    public void setResumeList(List<Resume> resumeList) {
//        this.resumeList = resumeList;
//    }
//
//    public List<GetJobInfo> getGetJobInfoList() {
//        return getJobInfoList;
//    }
//
//    public void setGetJobInfoList(List<GetJobInfo> getJobInfoList) {
//        this.getJobInfoList = getJobInfoList;
//    }

    public Person() {
    }


    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
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



}
