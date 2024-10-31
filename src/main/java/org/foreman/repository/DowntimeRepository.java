package org.foreman.repository;

import org.foreman.model.Downtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DowntimeRepository extends JpaRepository<Downtime, Integer> {
}
