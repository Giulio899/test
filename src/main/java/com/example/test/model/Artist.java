package com.example.test.model;

import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "artist")
public class Artist {
    private Long _id;

    private String _name;

    private String _surname;

    private Integer _age;

    private String _nickname;

    private Set<Asset> _assets;

    /**
     * @return artist's id.
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "artist_id", unique = true, nullable = false)
    public Long getId() {
        return _id;
    }

    /**
     * @return the artist's name.
     */
    @Column(name = "name")
    public String getName() {
        return _name;
    }

    /**
     * @return the artist's surname.
     */
    @Column(name = "surname")
    public String getSurname() {
        return _surname;
    }

    /**
     * @return the artist's age.
     */
    @Column(name = "age")
    public Integer getAge() {
        return _age;
    }

    /**
     * @return the artist's nickname.
     */
    @Column(name = "nickname")
    public String getNickname() {
        return _nickname;
    }

    /**
     * @return the artist's assets.
     */
    @ManyToMany
    @JoinTable(name="ARTISTS_ASSETS")
    public Set<Asset> getAssets() { return _assets; }

    /**
     * @param id the id to set to.
     */
    public void setId(Long id) {
        _id = id;
    }

    /**
     * @param name the name of the artist.
     */
    public void setName(final String name) {
        _name = name;
    }

    /**
     * @param surname the surname of the artist.
     */
    public void setSurname(final String surname) {
        _surname = surname;
    }

    /**
     * @param age the age of the artist.
     */
    public void setAge(Integer age) {
        _age = age;
    }

    /**
     * @param nickname the nickname of the artist.
     */
    public void setNickname(final String nickname) {
        _nickname = nickname;
    }

    /**
     * @param assets the assets of the artist.
     */
    public void setAssets(final Set<Asset> assets) {
        _assets = assets;
    }
}
