package com.example.test.service;

import com.example.test.model.Asset;
import com.example.test.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetServiceImpl implements AssetService{
    @Autowired
    private AssetRepository assetRepository;

    @Override
    public Asset save(Asset asset) {
        return assetRepository.save(asset);
    }

    @Override
    public List<Asset> fetchList() {
        return (List<Asset>) assetRepository.findAll();
    }

    @Override
    public Asset update(Asset asset, Long id) {
        //TODO error handling
        Asset assetToUpdate=assetRepository.findById(id).get();
        assetToUpdate.setName(asset.getName());
        assetToUpdate.setDescription(asset.getDescription());
        assetToUpdate.setLicenseTYPE(asset.getLicenseTYPE());
        assetToUpdate.setArtists(asset.getArtists());
        return assetRepository.save(assetToUpdate);
    }

    @Override
    public void deleteByID(Long id) {
        assetRepository.deleteById(id);
    }

    @Override
    public Optional<Asset> getById(Long id) {
        return assetRepository.findById(id);
    }
}
