package com.boot4.demo.controller;

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

    public TgsupCompareController(TgsupCompareService service) {
        this.service = service;
    }

    @PostMapping(value = "/tgsup-compare", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TgsupCompareResponseDto> compare(@RequestBody TgsupCompareRequestDto request) {
        TgsupCompareResponseDto response = service.compare(
                request.getEventId(),
                request.getStartDateTime(),
                request.getEndDateTime(),
                request.getIsInPlay()
        );
        return ResponseEntity.ok(response);
    }
}