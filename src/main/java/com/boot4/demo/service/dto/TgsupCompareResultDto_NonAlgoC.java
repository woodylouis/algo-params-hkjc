package com.boot4.demo.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class TgsupCompareResultDto_NonAlgoC {
    @JsonProperty("EventTime")
    private LocalDateTime eventTime;
    
    @JsonProperty("TimeInSecond")
    private Integer timeInSecond;
    
    @JsonProperty("Minutes")
    private Integer minutes;
    
    @JsonProperty("Seconds")
    private Integer seconds;
    
    @JsonProperty("GameState")
    private String gameState;
    
    @JsonProperty("Goal90BasisTG")
    private Double goal90BasisTG;
    
    @JsonProperty("Goal90BasisSUP")
    private Double goal90BasisSUP;
    
    @JsonProperty("Goal90DrawFactor")
    private Double goal90DrawFactor;
    
    @JsonProperty("GoalETBasisTG")
    private Double goalETBasisTG;
    
    @JsonProperty("GoalETBasisSUP")
    private Double goalETBasisSUP;
    
    @JsonProperty("GoalETDrawFactor")
    private Double goalETDrawFactor;
    
    @JsonProperty("Corner90BasisTG")
    private Double corner90BasisTG;
    
    @JsonProperty("Corner90BasisSUP")
    private Double corner90BasisSUP;
    
    @JsonProperty("Corner90DrawFactor")
    private Double corner90DrawFactor;
    
    @JsonProperty("CornerETBasisTG")
    private Double cornerETBasisTG;
    
    @JsonProperty("CornerETBasisSUP")
    private Double cornerETBasisSUP;
    
    @JsonProperty("CornerETDrawFactor")
    private Double cornerETDrawFactor;

    // Getters and Setters
    public LocalDateTime getEventTime() { return eventTime; }
    public void setEventTime(LocalDateTime eventTime) { this.eventTime = eventTime; }

    public Integer getTimeInSecond() { return timeInSecond; }
    public void setTimeInSecond(Integer timeInSecond) { this.timeInSecond = timeInSecond; }

    public Integer getMinutes() { return minutes; }
    public void setMinutes(Integer minutes) { this.minutes = minutes; }

    public Integer getSeconds() { return seconds; }
    public void setSeconds(Integer seconds) { this.seconds = seconds; }

    public String getGameState() { return gameState; }
    public void setGameState(String gameState) { this.gameState = gameState; }

    public Double getGoal90BasisTG() { return goal90BasisTG; }
    public void setGoal90BasisTG(Double goal90BasisTG) { this.goal90BasisTG = goal90BasisTG; }

    public Double getGoal90BasisSUP() { return goal90BasisSUP; }
    public void setGoal90BasisSUP(Double goal90BasisSUP) { this.goal90BasisSUP = goal90BasisSUP; }

    public Double getGoal90DrawFactor() { return goal90DrawFactor; }
    public void setGoal90DrawFactor(Double goal90DrawFactor) { this.goal90DrawFactor = goal90DrawFactor; }

    public Double getGoalETBasisTG() { return goalETBasisTG; }
    public void setGoalETBasisTG(Double goalETBasisTG) { this.goalETBasisTG = goalETBasisTG; }

    public Double getGoalETBasisSUP() { return goalETBasisSUP; }
    public void setGoalETBasisSUP(Double goalETBasisSUP) { this.goalETBasisSUP = goalETBasisSUP; }

    public Double getGoalETDrawFactor() { return goalETDrawFactor; }
    public void setGoalETDrawFactor(Double goalETDrawFactor) { this.goalETDrawFactor = goalETDrawFactor; }

    public Double getCorner90BasisTG() { return corner90BasisTG; }
    public void setCorner90BasisTG(Double corner90BasisTG) { this.corner90BasisTG = corner90BasisTG; }

    public Double getCorner90BasisSUP() { return corner90BasisSUP; }
    public void setCorner90BasisSUP(Double corner90BasisSUP) { this.corner90BasisSUP = corner90BasisSUP; }

    public Double getCorner90DrawFactor() { return corner90DrawFactor; }
    public void setCorner90DrawFactor(Double corner90DrawFactor) { this.corner90DrawFactor = corner90DrawFactor; }

    public Double getCornerETBasisTG() { return cornerETBasisTG; }
    public void setCornerETBasisTG(Double cornerETBasisTG) { this.cornerETBasisTG = cornerETBasisTG; }

    public Double getCornerETBasisSUP() { return cornerETBasisSUP; }
    public void setCornerETBasisSUP(Double cornerETBasisSUP) { this.cornerETBasisSUP = cornerETBasisSUP; }

    public Double getCornerETDrawFactor() { return cornerETDrawFactor; }
    public void setCornerETDrawFactor(Double cornerETDrawFactor) { this.cornerETDrawFactor = cornerETDrawFactor; }
}