package com.post.meridiem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/")
    public ResponseEntity<String> getBaseMapping() {
        return ResponseEntity.ok("Happy Coding");
    }
}
