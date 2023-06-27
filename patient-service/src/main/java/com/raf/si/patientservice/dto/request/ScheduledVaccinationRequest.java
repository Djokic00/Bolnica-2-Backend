package com.raf.si.patientservice.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class ScheduledVaccinationRequest {
    @NotNull(message = "Polje datum i vreme ne sme biti prazno")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateAndTime;
    private String note;
}
