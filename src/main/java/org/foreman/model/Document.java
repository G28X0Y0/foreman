package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"LKUP_DOCUMENTS\"")
public class Document {
    @Id
    @SequenceGenerator(name = "LKUP_DOCUMENTS_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @Column(name = "\"DOCUMENT_ID\"", nullable = false)
    private BigDecimal id;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_ADDED\"", nullable = false)
    private LocalDate dateAdded;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "\"DATE_UPDATED\"", nullable = false)
    private LocalDate dateUpdated;

    @Column(name = "\"LAST_UPDATED_BY\"", nullable = false)
    private BigDecimal lastUpdatedBy;

    @Column(name = "\"DOCUMENT_NAME\"", nullable = false, length = 50)
    private String documentName;

    @Column(name = "\"DOCUMENT_DIR\"", nullable = false, length = 100)
    private String documentDir;

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

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentDir() {
        return documentDir;
    }

    public void setDocumentDir(String documentDir) {
        this.documentDir = documentDir;
    }

}