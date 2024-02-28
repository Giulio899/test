package com.example.test.model;

import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "asset")
public class Asset {
    private Long _id;

    private String _name;

    private String _description;

    private Set<Artist> _artists;

    private LicenseTYPE _license;

    /**
     * @return asset's id.
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "asset_id", unique = true, nullable = false)
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
     * @return the asset's authors.
     */
    @ManyToMany
    @JoinTable(name="ARTISTS_ASSETS")
    public Set<Artist> getArtists() { return _artists; }

    /**
     * @return the asset's licenseTYPE.
     */
    @ManyToOne(optional=false)
    @JoinColumn(name="license_id", nullable=false, updatable=false)
    public LicenseTYPE getLicenseTYPE() { return _license; }

    /**
     * @param id the id to set to.
     */
    public void setId(Long id) {
        _id = id;
    }

    /**
     * @param name the name of the asset.
     */
    public void setName(final String name) {
        _name = name;
    }

    /**
     * @param description the description of the asset.
     */
    public void setDescription(final String description) {
        _description = description;
    }

    /**
     * @param artists the authors of the asset.
     */
    public void setArtists(final Set<Artist> artists) {
        _artists = artists;
    }

    /**
     * @param licenseTYPE the licenseTYPE of the asset.
     */
    public void setLicenseTYPE(final LicenseTYPE licenseTYPE) {
        _license = licenseTYPE;
    }
}
