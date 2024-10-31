package org.foreman.model;


import jakarta.persistence.*;

@Entity
@Table(name = "\"SUPPLIERS\"")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SUPPLIERS_id_gen")
    @SequenceGenerator(name = "SUPPLIERS_id_gen", sequenceName = "SUPPLIERS_SUPPLIER_ID_seq", allocationSize = 1)
    @Column(name = "\"SUPPLIER_ID\"", nullable = false)
    private Integer id;

    @Column(name = "\"NAME\"", nullable = false, length = 100)
    private String name;

    @Column(name = "\"CONTACT_INFO\"")
    private String contactInfo;

    @Column(name = "\"ADDRESS\"")
    private String address;

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

/*
 TODO [Reverse Engineering] create field to map the '\"ACTIVE_STATUS\"' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "\"ACTIVE_STATUS\"", columnDefinition = ""char" not null")
    private Object activeStatus;
*/
}