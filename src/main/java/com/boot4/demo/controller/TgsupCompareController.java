package com.boot4.demo.controller;

import com.boot4.demo.service.ResponseFileService;
import com.boot4.demo.service.TgsupCompareService;
import com.boot4.demo.service.dto.TgsupCompareRequestDto;
import com.boot4.demo.service.dto.TgsupCompareResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TgsupCompareController {

    private final TgsupCompareService service;
    private final ResponseFileService responseFileService;

    public TgsupCompareController(TgsupCompareService service, ResponseFileService responseFileService) {
        this.service = service;
        this.responseFileService = responseFileService;
    }

    @PostMapping(value = "/tgsup-compare", produces = MediaType.APPLICATION_JSON_VALUE)
    public String compare() {
        return responseFileService.getResponseJson();
    }
}