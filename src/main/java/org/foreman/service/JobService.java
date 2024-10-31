package org.foreman.service;
import org.foreman.model.Job;

import java.util.List;

public interface JobService {
    Job createJob(Job job);
    Job updateJob(Job job);
    void deleteJob(Long jobId);
    Job getJobById(Long jobId);
    List<Job> getAllJobs();
}