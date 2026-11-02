package com.atharv.flowforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atharv.flowforge.Job;

public interface JobRepository  extends JpaRepository<Job,Long>{
    
}
