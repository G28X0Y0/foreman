package org.foreman.repository;

import org.foreman.model.JobTool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobToolRepository extends JpaRepository<JobTool, Long> {
}
