package com.example.test.service;

import com.example.test.model.Artist;
import com.example.test.model.LicenseTYPE;

import java.util.List;
import java.util.Optional;

public interface ArtistService {
    Artist save(Artist artist);

    List<Artist> fetchList();

    Artist update(Artist artist, Long id);

    void deleteByID(Long id);

    Optional<Artist> getById(Long id);
}
