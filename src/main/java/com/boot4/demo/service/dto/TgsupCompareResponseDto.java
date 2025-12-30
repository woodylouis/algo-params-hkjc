package com.boot4.demo.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TgsupCompareResponseDto {
    @JsonProperty("algoCData")
    private List<TgsupCompareResultDto_AlgoC> algoCData;
    
    @JsonProperty("nonAlgoCData")
    private List<TgsupCompareResultDto_NonAlgoC> nonAlgoCData;

    public TgsupCompareResponseDto() {
    }

    public TgsupCompareResponseDto(List<TgsupCompareResultDto_AlgoC> algoCData, List<TgsupCompareResultDto_NonAlgoC> nonAlgoCData) {
        this.algoCData = algoCData;
        this.nonAlgoCData = nonAlgoCData;
    }

    public List<TgsupCompareResultDto_AlgoC> getAlgoCData() {
        return algoCData;
    }

    public void setAlgoCData(List<TgsupCompareResultDto_AlgoC> algoCData) {
        this.algoCData = algoCData;
    }

    public List<TgsupCompareResultDto_NonAlgoC> getNonAlgoCData() {
        return nonAlgoCData;
    }

    public void setNonAlgoCData(List<TgsupCompareResultDto_NonAlgoC> nonAlgoCData) {
        this.nonAlgoCData = nonAlgoCData;
    }
}
