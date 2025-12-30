package com.boot4.demo.service.impl;

import com.boot4.demo.service.ResponseFileService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service
public class ResponseFileServiceImpl implements ResponseFileService {

    @Override
    public String getResponseJson() {
        try {
            ClassPathResource resource = new ClassPathResource("response-new.json");
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
}