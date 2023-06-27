package com.raf.si.patientservice.dto.response;

import com.raf.si.patientservice.model.enums.examination.ExaminationStatus;
import com.raf.si.patientservice.model.enums.examination.PatientArrivalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduledVaccinationResponse {
    private Long id;
    private LocalDateTime dateAndTime;
    private ExaminationStatus testStatus;
    private PatientArrivalStatus patientArrivalStatus;
    private String note;
    private UUID schedulerLbz;
    private UUID lbp;
    private String patientFirstName;
    private String patientLastName;
}
