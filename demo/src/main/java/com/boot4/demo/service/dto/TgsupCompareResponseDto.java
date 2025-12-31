package com.boot4.demo.service.dto;

import java.util.List;

public class TgsupCompareResponseDto {
    private List<TgsupCompareResultDto> data;
    private String retErrText;

    public TgsupCompareResponseDto(List<TgsupCompareResultDto> data, String retErrText) {
        this.data = data;
        this.retErrText = retErrText != null ? retErrText : "";
    }

    // Getters
    public List<TgsupCompareResultDto> getData() { return data; }
    public String getRetErrText() { return retErrText; }
}
