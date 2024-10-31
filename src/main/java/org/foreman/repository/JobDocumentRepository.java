package org.foreman.repository;

import org.foreman.model.JobDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDocumentRepository extends JpaRepository<JobDocument, Long> {
}
