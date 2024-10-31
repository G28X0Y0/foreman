package org.foreman.repository;

import org.foreman.model.MachineJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineJobRepository extends JpaRepository<MachineJob, Long> {
}
