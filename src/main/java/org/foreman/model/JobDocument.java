package org.foreman.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "\"JOB_DOCUMENTS\"")
public class JobDocument {
    @SequenceGenerator(name = "JOB_DOCUMENTS_id_gen", sequenceName = "INVENTORY_MOVEMENT_MOVEMENT_ID_seq", allocationSize = 1)
    @EmbeddedId
    private JobDocumentId id;

    @MapsId("jobId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"JOB_ID\"", nullable = false)
    private Job job;

    @MapsId("documentId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"DOCUMENT_ID\"", nullable = false)
    private Document document;

    public JobDocumentId getId() {
        return id;
    }

    public void setId(JobDocumentId id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

}