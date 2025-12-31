package com.boot4.demo.service.dto;


import java.time.LocalDateTime;

public class TgsupCompareResultDto {
    private LocalDateTime eventTime;
    private Integer timeInSecond;
    private Integer minutes;
    private Integer seconds;
    private String gameState;
    private Double goal90BasisTG;
    private Double goal90BasisSUP;
    private Double goal90DrawFactor;
    private Double goalETBasisTG;
    private Double goalETBasisSUP;
    private Double goalETDrawFactor;
    private Double corner90BasisTG;
    private Double corner90BasisSUP;
    private Double corner90DrawFactor;
    private Double cornerETBasisTG;
    private Double cornerETBasisSUP;
    private Double cornerETDrawFactor;
    private LocalDateTime reengTime;
    private String reengEngine;
    private String reengTaskId;
    private String oddsChannel;
    private Integer clock;
    private Double basisTg;
    private Double basisSup;
    private Double cornerTg;
    private Double cornerSup;
    private Double df;
    private Double tgFh;
    private Double supFh;
    private Boolean verifySuccess;

    // Generate getters/setters in your IDE (Alt+Insert in IntelliJ)
}
