package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"BILLING\"")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BILLING_id_gen")
    @SequenceGenerator(name = "BILLING_id_gen", sequenceName = "BILLING_INVOICE_ID_seq", allocationSize = 1)
    @Column(name = "\"INVOICE_ID\"", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"JOB_ID\"", nullable = false)
    private Job job;

    @Column(name = "\"AMOUNT\"", nullable = false)
    private BigDecimal amount;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"ISSUE_DATE\"", nullable = false)
    private LocalDate issueDate;
    @Column(name = "\"DUE_DATE\"", nullable = false)
    private LocalDate dueDate;

    @Column(name = "\"PAYMENT_STATUS\"", nullable = false, length = 1)
    private Character paymentStatus;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Character getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Character paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
