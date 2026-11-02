package com.atharv.flowforge;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

    @Entity 
    @Table(name= "jobs")
    public class Job {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "job_type",nullable = false)
    private String jobType;

    @Column(name ="payload", columnDefinition = "TEXT")
    private String payload;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private JobStatus status;
     
    public Job(){
        this.status = JobStatus.PENDING;

    }
    public JobStatus getStatus() {
        return status;


    }
    public void setStatus(JobStatus status){
        this.status=status;
    }
    public String getJobType(){
        return jobType;
    }
    public void setJobType(String jobType){
        this.jobType=jobType;
    }
    public String getPayload(){
        return payload;
    }
    public void setPayload(String payload){
        this.payload = payload;
    }
    public Long getId(){
        return id;

    }
    public void setId(Long id){
        this.id=id;
    }

}
