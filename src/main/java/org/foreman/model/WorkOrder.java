package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"WORK_ORDER\"")
public class WorkOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WORK_ORDER_id_gen")
    @SequenceGenerator(name = "WORK_ORDER_id_gen", sequenceName = "WORK_ORDER_WORK_ORDER_ID_seq", allocationSize = 1)
    @Column(name = "\"WORK_ORDER_ID\"", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"JOB_ID\"", nullable = false)
    private Job job;

    @Column(name = "\"TASK_DESCRIPTION\"", nullable = false)
    private String taskDescription;

    @Column(name = "\"ASSIGNED_TO\"")
    private BigDecimal assignedTo;

    @Column(name = "\"DUE_DATE\"")
    private LocalDate dueDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public BigDecimal getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(BigDecimal assignedTo) {
        this.assignedTo = assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

/*
 TODO [Reverse Engineering] create field to map the '\"STATUS\"' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "\"STATUS\"", columnDefinition = ""char" not null")
    private Object status;
*/
}