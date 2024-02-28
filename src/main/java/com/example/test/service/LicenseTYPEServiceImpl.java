package com.example.test.service;

import com.example.test.model.LicenseTYPE;
import com.example.test.repository.LicenseTYPERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicenseTYPEServiceImpl implements LicenseTYPEService{
    @Autowired
    private LicenseTYPERepository licenseTYPERepository;

    @Override
    public LicenseTYPE save(LicenseTYPE licenseTYPE) {
        return licenseTYPERepository.save(licenseTYPE);
    }

    @Override
    public List<LicenseTYPE> fetchList() {
        return (List<LicenseTYPE>) licenseTYPERepository.findAll();
    }

    @Override
    public LicenseTYPE update(LicenseTYPE licenseTYPE, Long id) {
        //TODO error handling
        LicenseTYPE license = licenseTYPERepository.findById(id).get();
        license.setName(licenseTYPE.getName());
        license.setDescription(licenseTYPE.getDescription());
        return licenseTYPERepository.save(license);
    }

    @Override
    public void deleteByID(Long id) {
        licenseTYPERepository.deleteById(id);
    }

    @Override
    public Optional<LicenseTYPE> getByID(Long id) {
        return licenseTYPERepository.findById(id);
    }

}
