package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "\"MACHINE_JOBS\"")
public class MachineJob {
    @SequenceGenerator(name = "MACHINE_JOBS_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @EmbeddedId
    private MachineJobId id;

    @MapsId("machineId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"MACHINE_ID\"", nullable = false)
    private Machine machine;

    @MapsId("jobId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"JOB_ID\"", nullable = false)
    private Job job;

    @Column(name = "\"END_DATE\"")
    private LocalDate endDate;

    @Column(name = "\"STATUS\"", length = 20)
    private String status;

    @ColumnDefault("false")
    @Column(name = "\"HISTORICAL_FLAG\"", nullable = false)
    private Boolean historicalFlag = false;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "\"LAST_UPDATED\"", nullable = false)
    private Instant lastUpdated;

    public MachineJobId getId() {
        return id;
    }

    public void setId(MachineJobId id) {
        this.id = id;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getHistoricalFlag() {
        return historicalFlag;
    }

    public void setHistoricalFlag(Boolean historicalFlag) {
        this.historicalFlag = historicalFlag;
    }

    public Instant getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Instant lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}