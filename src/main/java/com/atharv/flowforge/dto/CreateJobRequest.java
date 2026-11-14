package com.atharv.flowforge.dto;



public class CreateJobRequest {
    
    private String jobType;
    private String payload;

    public String getJobType(){
        return jobType;
    }
    public void setJobType( String jobType){
        this.jobType=jobType;
    }
    public String getPayload(){
        return payload;
    }
    public void setPayload(String payload){
        this.payload=payload;
    }
}   
