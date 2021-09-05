package com.example.resumeservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long resumeId;
    /**name of applicant*/
    private String personName;
    /** name of current company*/
    private String companyName;
    /** position applicant is aspiring for*/
    private String pWorkPosition;
    /** current work position*/
    private String cWorkPosition;

    public Resume() {
    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "company")
//    private Company company;
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
//
//
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public long getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getcWorkPosition() {
        return cWorkPosition;
    }

    public void setcWorkPosition(String cWorkPosition) {
        this.cWorkPosition = cWorkPosition;
    }

    public String getpWorkPosition() {
        return pWorkPosition;
    }

    public void setpWorkPosition(String pWorkPosition) {
        this.pWorkPosition = pWorkPosition;
    }
}
