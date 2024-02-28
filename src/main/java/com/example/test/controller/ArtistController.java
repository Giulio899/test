package com.example.test.controller;

import com.example.test.model.Artist;
import com.example.test.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/artist")
public class ArtistController {
    @Autowired
    ArtistService artistService;

    @PostMapping(path = "/add")
    public Artist add(@RequestBody Artist artist){
        return artistService.save(artist);
    }

    @GetMapping(path = "/{id}")
    public Optional<Artist> get(@PathVariable Long id){
        return artistService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        artistService.deleteByID(id);
        return "deleted";
    }

    @PostMapping(path = "/getAll")
    public List<Artist> getAll(){
        return artistService.fetchList();
    }

    @PostMapping(path = "/update/{id}")
    public Artist update(@PathVariable Long id, @RequestBody Artist artist){
        return artistService.update(artist, id);
    }
}
