package com.example.test.controller;

import com.example.test.model.Asset;
import com.example.test.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/asset")
public class AssetController {
    @Autowired
    AssetService assetService;

    @PostMapping(path = "/add")
    public Asset add(@RequestBody Asset asset){
        return assetService.save(asset);
    }

    @GetMapping(path = "/{id}")
    public Optional<Asset> get(@PathVariable Long id){
        return assetService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        assetService.deleteByID(id);
        return "deleted";
    }

    @PostMapping(path = "/getAll")
    public List<Asset> getAll(){
        return assetService.fetchList();
    }

    @PostMapping(path = "/update/{id}")
    public Asset update(@PathVariable Long id, @RequestBody Asset asset){
        return assetService.update(asset, id);
    }
}
