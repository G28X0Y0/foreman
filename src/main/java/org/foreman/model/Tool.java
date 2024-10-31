package org.foreman.model;


import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"LKUP_TOOLING_INVENTORY\"")
public class Tool {
    @Id
    @SequenceGenerator(name = "LKUP_TOOLING_INVENTORY_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @Column(name = "\"TOOL_ID\"", nullable = false)
    private BigDecimal id;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_ADDED\"", nullable = false)
    private LocalDate dateAdded;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_UPDATED\"", nullable = false)
    private LocalDate dateUpdated;

    @Column(name = "\"LAST_UPDATED_BY\"", nullable = false, length = 50)
    private String lastUpdatedBy;

    @Column(name = "\"ACTIVE_STATUS\"", nullable = false, length = Integer.MAX_VALUE)
    private String activeStatus;

    @Column(name = "\"TOOL_NAME\"", nullable = false, length = 50)
    private String toolName;

    @Column(name = "\"TOOL_SKU\"", length = 50)
    private String toolSku;

    @Column(name = "\"TOOL_TYPE\"", nullable = false, length = 10)
    private String toolType;

    @Column(name = "\"TOOL_DIAMETER\"")
    private BigDecimal toolDiameter;

    @Column(name = "\"TOOL_LENGTH\"")
    private BigDecimal toolLength;

    @Column(name = "\"TOOL_RADIUS\"")
    private BigDecimal toolRadius;

    @Column(name = "\"TOOL_LOC\"")
    private BigDecimal toolLoc;

    @Column(name = "\"TOOL_BRAND\"", length = 50)
    private String toolBrand;

    @Column(name = "\"TOOL_COST\"")
    private BigDecimal toolCost;

    @Column(name = "\"TOOL_MATERIAL\"", length = 10)
    private String toolMaterial;

    @Column(name = "\"TOOL_COATING\"", length = 10)
    private String toolCoating;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getToolSku() {
        return toolSku;
    }

    public void setToolSku(String toolSku) {
        this.toolSku = toolSku;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public BigDecimal getToolDiameter() {
        return toolDiameter;
    }

    public void setToolDiameter(BigDecimal toolDiameter) {
        this.toolDiameter = toolDiameter;
    }

    public BigDecimal getToolLength() {
        return toolLength;
    }

    public void setToolLength(BigDecimal toolLength) {
        this.toolLength = toolLength;
    }

    public BigDecimal getToolRadius() {
        return toolRadius;
    }

    public void setToolRadius(BigDecimal toolRadius) {
        this.toolRadius = toolRadius;
    }

    public BigDecimal getToolLoc() {
        return toolLoc;
    }

    public void setToolLoc(BigDecimal toolLoc) {
        this.toolLoc = toolLoc;
    }

    public String getToolBrand() {
        return toolBrand;
    }

    public void setToolBrand(String toolBrand) {
        this.toolBrand = toolBrand;
    }

    public BigDecimal getToolCost() {
        return toolCost;
    }

    public void setToolCost(BigDecimal toolCost) {
        this.toolCost = toolCost;
    }

    public String getToolMaterial() {
        return toolMaterial;
    }

    public void setToolMaterial(String toolMaterial) {
        this.toolMaterial = toolMaterial;
    }

    public String getToolCoating() {
        return toolCoating;
    }

    public void setToolCoating(String toolCoating) {
        this.toolCoating = toolCoating;
    }

}