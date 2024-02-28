package com.example.test.service;

import com.example.test.model.LicenseTYPE;

import java.util.List;
import java.util.Optional;

public interface LicenseTYPEService {
    LicenseTYPE save(LicenseTYPE licenseTYPE);

    List<LicenseTYPE> fetchList();

    LicenseTYPE update(LicenseTYPE licenseTYPE, Long id);

    void deleteByID(Long id);

    Optional<LicenseTYPE> getByID(Long id);
}
