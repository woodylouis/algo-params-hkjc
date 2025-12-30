package com.boot4.demo.service.dto;

import java.time.LocalDateTime;

public class TgsupCompareRequestDto {
    private Long eventId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Boolean isInPlay;

    // Getters and Setters
    public Long getEventId() { return eventId; }
    public void setEventId(Long eventId) { this.eventId = eventId; }
    public LocalDateTime getStartDateTime() { return startDateTime; }
    public void setStartDateTime(LocalDateTime startDateTime) { this.startDateTime = startDateTime; }
    public LocalDateTime getEndDateTime() { return endDateTime; }
    public void setEndDateTime(LocalDateTime endDateTime) { this.endDateTime = endDateTime; }
    public Boolean getIsInPlay() { return isInPlay; }
    public void setIsInPlay(Boolean isInPlay) { this.isInPlay = isInPlay; }
}

