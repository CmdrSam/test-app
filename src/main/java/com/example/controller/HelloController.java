package com.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Operation(summary = "Get hello world message")
    @ApiResponse(responseCode = "200", description = "Successfully retrieved hello world message")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
} 