package org.foreman.service;

import org.foreman.exception.JobNotFoundException;
import org.foreman.model.Job;
import org.foreman.repository.JobRepository;
import org.foreman.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Job createJob(Job job) {
        // Create a new Job instance and set its properties
        Job newJob = new Job();
        newJob.setActiveStatus("A");
        newJob.setDateAdded(LocalDate.now());
        newJob.setDateUpdated(LocalDate.now());
        newJob.setCreatedBy(new BigDecimal(1234)); //TODO: Create userID management
        newJob.setLastUpdatedBy(new BigDecimal(1234));
        newJob.setJobStatus("P");
        // Save the new job to the repository and return it
        return jobRepository.save(newJob);
    }

    @Override
    public Job updateJob(Job job) {
        // Check if the job exists before updating
        if (!jobRepository.existsById(job.getId())) {
            throw new JobNotFoundException("Job with ID " + job.getId() + " not found.");
        }
        return jobRepository.save(job);
    }

    @Override
    public void deleteJob(Long jobId) {
        // Check if the job exists before deleting
        if (!jobRepository.existsById(jobId)) {
            throw new JobNotFoundException("Job with ID " + jobId + " not found.");
        }
        jobRepository.deleteById(jobId);
    }

    @Override
    public Job getJobById(Long jobId) {
        return jobRepository.findById(jobId).orElseThrow(() ->
                new JobNotFoundException("Job with ID " + jobId + " not found."));
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}