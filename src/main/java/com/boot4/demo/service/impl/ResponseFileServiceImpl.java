package com.boot4.demo.service.impl;

import com.boot4.demo.service.ResponseFileService;
import com.boot4.demo.service.dto.ApiResponseDto;
import com.boot4.demo.service.dto.TgsupCompareResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service
public class ResponseFileServiceImpl implements ResponseFileService {

    private final ObjectMapper objectMapper;

    public ResponseFileServiceImpl() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public String getResponseJson() {
        try {
            ClassPathResource resource = new ClassPathResource("response-new-2.json");
            InputStream inputStream = resource.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            // Remove the trailing newline
            if (content.length() > 0) {
                content.deleteCharAt(content.length() - 1);
            }
            return content.toString();
        } catch (IOException e) {
            throw new RuntimeException("Failed to read response.json file", e);
        }
    }

    @Override
    public ApiResponseDto<TgsupCompareResponseDto> getTgsupCompareResponse() {
        try {
            ClassPathResource resource = new ClassPathResource("response-new-two-dataset.json");
            InputStream inputStream = resource.getInputStream();
            
            TgsupCompareResponseDto data = objectMapper.readValue(inputStream, TgsupCompareResponseDto.class);
            inputStream.close();
            
            return new ApiResponseDto<>(data, 200);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read response-new-two-dataset.json file", e);
        }
    }
}