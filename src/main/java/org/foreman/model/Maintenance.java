package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"MAINTENANCE_LOG\"")
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MAINTENANCE_LOG_id_gen")
    @SequenceGenerator(name = "MAINTENANCE_LOG_id_gen", sequenceName = "MAINTENANCE_LOG_MAINTENANCE_ID_seq", allocationSize = 1)
    @Column(name = "\"MAINTENANCE_ID\"", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"MACHINE_ID\"", nullable = false)
    private Machine machine;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE\"", nullable = false)
    private LocalDate date;

    @Column(name = "\"DESCRIPTION\"")
    private String description;

    @Column(name = "\"PERFORMED_BY\"", nullable = false)
    private BigDecimal performedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(BigDecimal performedBy) {
        this.performedBy = performedBy;
    }

}