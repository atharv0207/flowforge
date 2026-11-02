package com.atharv.flowforge;

public class Job {
    private Long id;
    private String jobType;
    private String payload;
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
    public void setJobtype(String jobType){
        this.jobType=jobType;
    }
    public String getPayload(){
        return payload;
    }
    public void setPayload(String payload){
        this.payload = payload;
    }

}
