package org.foreman.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class JobDocumentId implements java.io.Serializable {
    private static final long serialVersionUID = 1270408624319049348L;
    @Column(name = "\"JOB_ID\"", nullable = false)
    private BigDecimal jobId;

    @Column(name = "\"DOCUMENT_ID\"", nullable = false)
    private BigDecimal documentId;

    public BigDecimal getJobId() {
        return jobId;
    }

    public void setJobId(BigDecimal jobId) {
        this.jobId = jobId;
    }

    public BigDecimal getDocumentId() {
        return documentId;
    }

    public void setDocumentId(BigDecimal documentId) {
        this.documentId = documentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobDocumentId entity = (JobDocumentId) o;
        return Objects.equals(this.jobId, entity.jobId) &&
                Objects.equals(this.documentId, entity.documentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, documentId);
    }

}