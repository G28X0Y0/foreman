package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"LKUP_HR\"")
public class Employee {
    @Id
    @SequenceGenerator(name = "LKUP_HR_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @Column(name = "\"EMPLOYEE_ID\"", nullable = false)
    private BigDecimal id;

    @Column(name = "\"ACTIVE_STATUS\"", nullable = false, length = Integer.MAX_VALUE)
    private String activeStatus;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_ADDED\"", nullable = false)
    private LocalDate dateAdded;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_UPDATED\"", nullable = false)
    private LocalDate dateUpdated;

    @Column(name = "\"LAST_UPDATED_BY\"", nullable = false)
    private BigDecimal lastUpdatedBy;

    @Column(name = "\"FIRST_NAME\"", nullable = false, length = 15)
    private String firstName;

    @Column(name = "\"LAST_NAME\"", nullable = false, length = 15)
    private String lastName;

    @Column(name = "\"DOB\"", nullable = false)
    private LocalDate dob;

    @Column(name = "\"ROLE\"", length = 50)
    private String role;

    @Column(name = "\"TITLE\"", length = 50)
    private String title;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}