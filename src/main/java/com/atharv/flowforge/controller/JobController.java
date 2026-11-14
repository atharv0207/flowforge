package com.atharv.flowforge.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.atharv.flowforge.dto.CreateJobRequest;

import com.atharv.flowforge.service.JobService;
import com.atharv.flowforge.Job;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;
     public JobController( JobService jobService){
        this.jobService=jobService;
     }
     @PostMapping 
     public  Job createJob(@RequestBody CreateJobRequest request){
        return jobService.createJob(request.getJobType(),request.getPayload());

       
     }

    
}
