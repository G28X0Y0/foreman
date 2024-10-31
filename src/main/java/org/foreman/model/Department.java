package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"LKUP_DEPARTMENT\"")
public class Department {
    @Id
    @SequenceGenerator(name = "LKUP_DEPARTMENT_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @Column(name = "\"DEPARTMENT_ID\"", nullable = false)
    private BigDecimal id;

    @Column(name = "\"DEPARTMENT_NAME\"", nullable = false, length = 50)
    private String departmentName;

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

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

}