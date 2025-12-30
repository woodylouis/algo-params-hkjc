package com.boot4.demo.service;

import com.boot4.demo.repository.TgsupCompareRepository;
import com.boot4.demo.service.dto.TgsupCompareResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TgsupCompareService {

    private final TgsupCompareRepository repository;

    public TgsupCompareService(TgsupCompareRepository repository) {
        this.repository = repository;
    }

    public String compare(Long eventId, LocalDateTime start, LocalDateTime end, Boolean isInPlay) {
        return "1";
    }
}
