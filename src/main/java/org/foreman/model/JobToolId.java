package org.foreman.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class JobToolId implements java.io.Serializable {
    private static final long serialVersionUID = 6713043701751663661L;
    @Column(name = "\"JOB_ID\"", nullable = false)
    private Long jobId;

    @Column(name = "\"TOOL_ID\"", nullable = false)
    private BigDecimal toolId;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public BigDecimal getToolId() {
        return toolId;
    }

    public void setToolId(BigDecimal toolId) {
        this.toolId = toolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobToolId entity = (JobToolId) o;
        return Objects.equals(this.jobId, entity.jobId) &&
                Objects.equals(this.toolId, entity.toolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, toolId);
    }

}