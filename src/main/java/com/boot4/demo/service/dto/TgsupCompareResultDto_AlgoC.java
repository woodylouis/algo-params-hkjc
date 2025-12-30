package com.boot4.demo.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class TgsupCompareResultDto_AlgoC {
    @JsonProperty("reeng_time")
    private LocalDateTime reengTime;
    
    @JsonProperty("reeng_engine")
    private String reengEngine;
    
    @JsonProperty("reeng_task_id")
    private String reengTaskId;
    
    @JsonProperty("odds_channel")
    private Integer oddsChannel;
    
    private Integer clock;
    
    @JsonProperty("basis_tg")
    private double basisTg;
    
    @JsonProperty("basis_sup")
    private double basisSup;
    
    @JsonProperty("corner_tg")
    private double cornerTg;
    
    @JsonProperty("corner_sup")
    private double cornerSup;
    
    private double df;
    
    @JsonProperty("tg_fh")
    private double tgFh;
    
    @JsonProperty("sup_fh")
    private double supFh;
    
    @JsonProperty("verify_success")
    private int verifySuccess;

    // Getters and Setters
    public LocalDateTime getReengTime() { return reengTime; }
    public void setReengTime(LocalDateTime reengTime) { this.reengTime = reengTime; }

    public String getReengEngine() { return reengEngine; }
    public void setReengEngine(String reengEngine) { this.reengEngine = reengEngine; }

    public String getReengTaskId() { return reengTaskId; }
    public void setReengTaskId(String reengTaskId) { this.reengTaskId = reengTaskId; }

    public Integer getOddsChannel() { return oddsChannel; }
    public void setOddsChannel(Integer oddsChannel) { this.oddsChannel = oddsChannel; }

    public Integer getClock() { return clock; }
    public void setClock(Integer clock) { this.clock = clock; }

    public double getBasisTg() { return basisTg; }
    public void setBasisTg(double basisTg) { this.basisTg = basisTg; }

    public double getBasisSup() { return basisSup; }
    public void setBasisSup(double basisSup) { this.basisSup = basisSup; }

    public double getCornerTg() { return cornerTg; }
    public void setCornerTg(double cornerTg) { this.cornerTg = cornerTg; }

    public double getCornerSup() { return cornerSup; }
    public void setCornerSup(double cornerSup) { this.cornerSup = cornerSup; }

    public double getDf() { return df; }
    public void setDf(double df) { this.df = df; }

    public double getTgFh() { return tgFh; }
    public void setTgFh(double tgFh) { this.tgFh = tgFh; }

    public double getSupFh() { return supFh; }
    public void setSupFh(double supFh) { this.supFh = supFh; }

    public int getVerifySuccess() { return verifySuccess; }
    public void setVerifySuccess(int verifySuccess) { this.verifySuccess = verifySuccess; }
}
