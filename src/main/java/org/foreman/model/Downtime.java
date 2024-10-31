package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"FLOOR_DOWNTIME\"")
public class Downtime {
    @Id
    @SequenceGenerator(name = "FLOOR_DOWNTIME_id_gen", sequenceName = "CUSTOMER_CUSTOMER_ID_seq", allocationSize = 1)
    @Column(name = "\"DOWNTIME_ID\"", nullable = false)
    private BigDecimal id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"MACHINE_ID\"", nullable = false)
    private Machine machine;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_ADDED\"", nullable = false)
    private LocalDate dateAdded;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_UPDATED\"", nullable = false)
    private LocalDate dateUpdated;

    @Column(name = "\"CREATED_BY\"", nullable = false)
    private BigDecimal createdBy;

    @Column(name = "\"LAST_UPDATED_BY\"", nullable = false)
    private BigDecimal lastUpdatedBy;

    @Column(name = "\"REASON_CD\"", nullable = false, length = 50)
    private String reasonCd;

    @Column(name = "\"REASON_COMMENTS\"", nullable = false, length = 500)
    private String reasonComments;

    @Column(name = "\"DOWNTIME_MINUTES\"", nullable = false)
    private BigDecimal downtimeMinutes;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getReasonCd() {
        return reasonCd;
    }

    public void setReasonCd(String reasonCd) {
        this.reasonCd = reasonCd;
    }

    public String getReasonComments() {
        return reasonComments;
    }

    public void setReasonComments(String reasonComments) {
        this.reasonComments = reasonComments;
    }

    public BigDecimal getDowntimeMinutes() {
        return downtimeMinutes;
    }

    public void setDowntimeMinutes(BigDecimal downtimeMinutes) {
        this.downtimeMinutes = downtimeMinutes;
    }

}