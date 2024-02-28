package com.example.test.repository;

import com.example.test.model.Artist;
import com.example.test.model.Asset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends CrudRepository<Asset,Long> {
}
