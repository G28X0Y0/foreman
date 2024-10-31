package org.foreman.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"CUSTOMER\"")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_id_gen")
    @SequenceGenerator(name = "CUSTOMER_id_gen", sequenceName = "CUSTOMER_CUSTOMER_ID_seq", allocationSize = 1)
    @Column(name = "\"CUSTOMER_ID\"", nullable = false)
    private Integer id;

    @Column(name = "\"NAME\"", nullable = false, length = 100)
    private String name;

    @Column(name = "\"CONTACT_INFO\"")
    private String contactInfo;

    @Column(name = "\"ADDRESS\"")
    private String address;

    @Column(name = "\"ACTIVE_STATUS\"", nullable = false, length = 1)
    private Character activeStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Character activeStatus) {
        this.activeStatus = activeStatus;
    }

/*
 TODO [Reverse Engineering] create field to map the '\"ACTIVE_STATUS\"' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "\"ACTIVE_STATUS\"", columnDefinition = ""char" not null")
    private Object activeStatus;
*/
}