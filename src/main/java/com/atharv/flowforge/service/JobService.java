package com.atharv.flowforge.service;
import org.springframework.stereotype.Service;

import com.atharv.flowforge.Job;
import com.atharv.flowforge.repository.JobRepository;

@Service 
public class JobService {
    private final JobRepository jobRepository;
    public JobService( JobRepository jobRepository){
        this.jobRepository =jobRepository;
    }
    public Job createJob(String jobType, String payload){

        Job job = new Job();
        job.setJobType(jobType);
        job.setPayload(payload);

        return jobRepository.save(job);
            
        
    }
   

}
