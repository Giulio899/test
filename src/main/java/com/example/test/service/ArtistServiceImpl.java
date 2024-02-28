package com.example.test.service;
import com.example.test.model.Artist;
import com.example.test.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistServiceImpl implements ArtistService{
    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public List<Artist> fetchList() {
        return (List<Artist>) artistRepository.findAll();
    }

    @Override
    public Artist update(Artist artist, Long id) {
        //TODO error handling
        Artist artistToUpdate=artistRepository.findById(id).get();
        artistToUpdate.setSurname(artist.getSurname());
        artistToUpdate.setAge(artist.getAge());
        artistToUpdate.setNickname(artist.getNickname());
        artistToUpdate.setAssets(artist.getAssets());
        return artistRepository.save(artistToUpdate);
    }

    @Override
    public void deleteByID(Long id) {
        artistRepository.deleteById(id);
    }

    @Override
    public Optional<Artist> getById(Long id) {
        return artistRepository.findById(id);
    }
}
