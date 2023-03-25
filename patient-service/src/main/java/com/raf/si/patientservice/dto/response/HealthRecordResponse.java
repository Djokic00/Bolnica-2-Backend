package com.raf.si.patientservice.dto.response;

import com.raf.si.patientservice.model.MedicalExamination;
import com.raf.si.patientservice.model.MedicalHistory;
import com.raf.si.patientservice.model.Operation;
import com.raf.si.patientservice.model.enums.healthrecord.BloodType;
import com.raf.si.patientservice.model.enums.healthrecord.RHFactor;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class HealthRecordResponse {
    private Long id;
    private Date registrationDate;
    private BloodType bloodType;
    private RHFactor rhFactor;
    private List<AllergyResponse> allergies;
    private List<VaccinationResponse> vaccinations;
    private List<Operation> operations;
    private List<MedicalHistory> medicalHistory;
    private List<MedicalExamination> medicalExaminations;
    private UUID patientLbp;
}