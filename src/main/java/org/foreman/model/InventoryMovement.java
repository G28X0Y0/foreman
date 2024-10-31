package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"INVENTORY_MOVEMENT\"")
public class InventoryMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INVENTORY_MOVEMENT_id_gen")
    @SequenceGenerator(name = "INVENTORY_MOVEMENT_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @Column(name = "\"MOVEMENT_ID\"", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"TOOL_ID\"", nullable = false)
    private Tool tool;

    @Column(name = "\"QUANTITY\"", nullable = false)
    private BigDecimal quantity;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE\"", nullable = false)
    private LocalDate date;
    @Column(name = "\"COMMENTS\"")
    private String comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

/*
 TODO [Reverse Engineering] create field to map the '\"MOVEMENT_TYPE\"' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "\"MOVEMENT_TYPE\"", columnDefinition = ""char" not null")
    private Object movementType;
*/
}