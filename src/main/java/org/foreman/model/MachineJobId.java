package org.foreman.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class MachineJobId implements java.io.Serializable {
    private static final long serialVersionUID = 9105711796985510292L;
    @Column(name = "\"MACHINE_ID\"", nullable = false)
    private BigDecimal machineId;

    @Column(name = "\"JOB_ID\"", nullable = false)
    private BigDecimal jobId;

    @Column(name = "\"START_DATE\"", nullable = false)
    private LocalDate startDate;

    public BigDecimal getMachineId() {
        return machineId;
    }

    public void setMachineId(BigDecimal machineId) {
        this.machineId = machineId;
    }

    public BigDecimal getJobId() {
        return jobId;
    }

    public void setJobId(BigDecimal jobId) {
        this.jobId = jobId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MachineJobId entity = (MachineJobId) o;
        return Objects.equals(this.jobId, entity.jobId) &&
                Objects.equals(this.machineId, entity.machineId) &&
                Objects.equals(this.startDate, entity.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, machineId, startDate);
    }

}