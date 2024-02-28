package com.example.test.repository;

import com.example.test.model.LicenseTYPE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseTYPERepository extends CrudRepository<LicenseTYPE,Long> {
}
