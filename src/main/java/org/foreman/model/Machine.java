package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"LKUP_MACHINE_INVENTORY\"")
public class Machine {
    @Id
    @SequenceGenerator(name = "LKUP_MACHINE_INVENTORY_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @Column(name = "\"MACHINE_ID\"", nullable = false)
    private BigDecimal id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"DEPARTMENT_ID\"", nullable = false)
    private Department department;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_ADDED\"", nullable = false)
    private LocalDate dateAdded;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_UPDATED\"", nullable = false)
    private LocalDate dateUpdated;

    @Column(name = "\"LAST_UPDATED_BY\"", nullable = false)
    private BigDecimal lastUpdatedBy;

    @Column(name = "\"ACTIVE_STATUS\"", nullable = false, length = Integer.MAX_VALUE)
    private String activeStatus;

    @Column(name = "\"MACHINE_STATE\"", nullable = false, length = 30)
    private String machineState;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getMachineState() {
        return machineState;
    }

    public void setMachineState(String machineState) {
        this.machineState = machineState;
    }

}