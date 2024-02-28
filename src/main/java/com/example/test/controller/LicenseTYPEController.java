package com.example.test.controller;

import com.example.test.model.LicenseTYPE;
import com.example.test.service.LicenseTYPEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/license")
public class LicenseTYPEController {
    @Autowired
    LicenseTYPEService licenseTYPEService;

    @PostMapping(path = "/add")
    public LicenseTYPE add(@RequestBody LicenseTYPE license){
        return licenseTYPEService.save(license);
    }

    @GetMapping(path = "/{id}")
    public Optional<LicenseTYPE> get(@PathVariable Long id){
        return licenseTYPEService.getByID(id);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        licenseTYPEService.deleteByID(id);
        return "deleted";
    }

    @PostMapping(path = "/getAll")
    public List<LicenseTYPE> getAll(){
        return licenseTYPEService.fetchList();
    }

    @PostMapping(path = "/update/{id}")
    public LicenseTYPE update(@PathVariable Long id, @RequestBody LicenseTYPE license){
        return licenseTYPEService.update(license, id);
    }
}
