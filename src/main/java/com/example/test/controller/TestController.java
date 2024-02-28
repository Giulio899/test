package com.example.test.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private EntityManager entityManager;

    @GetMapping("/test")
    public String testDatabaseConnection() {
        try {
            Query query = entityManager.createNativeQuery("SELECT 1");
            List<?> result = query.getResultList();
            System.out.println("lol");
            return "Connected to database!";
        } catch (Exception e) {
            return "Failed to connect to database: " + e.getMessage();
        }
    }
}

