package com.codealpha.CodeAlpha_Java_Gradle_CICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DevOpsController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello from CodeAlpha DevOps Application",
                "status", "UP"
        );
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "application", "CodeAlpha Java Gradle CI/CD",
                "status", "UP"
        );
    }
}
