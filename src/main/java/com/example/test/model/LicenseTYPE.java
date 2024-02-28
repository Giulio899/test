package com.example.test.model;

import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "license_type")
public class LicenseTYPE {
    private Long _id;

    private String _name;

    private String _description;

    /**
     * @return licenseTYPE's id.
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "license_id", unique = true, nullable = false)
    public Long getId() {
        return _id;
    }

    /**
     * @return the licenseTYPE's name.
     */
    @Column(name = "name")
    public String getName() {
        return _name;
    }

    /**
     * @return the licenseTYPE's description.
     */
    @Column(name = "description")
    public String getDescription() {
        return _description;
    }

    /**
     * @param id the id to set to.
     */
    public void setId(Long id) {
        _id = id;
    }

    /**
     * @param name the name of the licenseTYPE.
     */
    public void setName(final String name) {
        _name = name;
    }

    /**
     * @param description the description of the licenseTYPE.
     */
    public void setDescription(final String description) {
        _description = description;
    }
}
