package org.example.lab6.service;

import org.example.lab6.dto.PatientWithAddressDTO;
import org.example.lab6.dto.PatientWithOutAddressDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    List<PatientWithAddressDTO> getAllPatients();

    PatientWithAddressDTO getPatientById(Long id);

    PatientWithAddressDTO registerPatient(PatientWithAddressDTO patientDTO);

    PatientWithAddressDTO updatePatient(PatientWithOutAddressDTO patientDTO, Long id);
    void deletePatient(Long id);

    List<PatientWithAddressDTO> searchPatient(String search);


}
