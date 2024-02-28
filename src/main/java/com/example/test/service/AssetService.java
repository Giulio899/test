package com.example.test.service;

import com.example.test.model.Artist;
import com.example.test.model.Asset;

import java.util.List;
import java.util.Optional;

public interface AssetService {
    Asset save(Asset asset);

    List<Asset> fetchList();

    Asset update(Asset asset, Long id);

    void deleteByID(Long id);

    Optional<Asset> getById(Long id);
}
