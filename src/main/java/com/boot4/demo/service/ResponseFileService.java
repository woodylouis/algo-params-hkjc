package com.boot4.demo.service;

import com.boot4.demo.service.dto.ApiResponseDto;
import com.boot4.demo.service.dto.TgsupCompareResponseDto;

public interface ResponseFileService {
    String getResponseJson();
    
    ApiResponseDto<TgsupCompareResponseDto> getTgsupCompareResponse();
}