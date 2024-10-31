package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "\"JOB_TOOLS\"")
public class JobTool {
    @SequenceGenerator(name = "JOB_TOOLS_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @EmbeddedId
    private JobToolId id;

    @MapsId("jobId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"JOB_ID\"", nullable = false)
    private Job job;

    @MapsId("toolId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"TOOL_ID\"", nullable = false)
    private Tool tool;

    public JobToolId getId() {
        return id;
    }

    public void setId(JobToolId id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

}