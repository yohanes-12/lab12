package org.example.lab6.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.lab6.dto.PatientWithAddressDTO;
import org.example.lab6.dto.PatientWithOutAddressDTO;
import org.example.lab6.entity.Patient;
import org.example.lab6.entity.User;
import org.example.lab6.exceptions.NotFoundException;
import org.example.lab6.repo.AddressRepository;
import org.example.lab6.repo.UserRepository;
import org.example.lab6.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    @Transactional
    @Override
    public List<PatientWithAddressDTO> getAllPatients() {
        List<Patient> patients = userRepository.getAllPatientsSortedByLastNameASC();
        return patients.stream().map(PatientWithAddressDTO::fromPatient).toList();

    }

    @Override
    public PatientWithAddressDTO getPatientById(Long id) {
        Patient p = userRepository.findPatientById(id).orElseThrow(NotFoundException::new);
        return PatientWithAddressDTO.fromPatient(p);
    }

    @Override
    @Transactional
    public PatientWithAddressDTO registerPatient(PatientWithAddressDTO patientDTO) {
        Patient p = patientDTO.toPatient();
        addressRepository.save(p.getMailingAddress());
        p = userRepository.save(p);
        return PatientWithAddressDTO.fromPatient(p);


    }




    @Override
    public void deletePatient(Long id) {
        userRepository.findPatientById(id).orElseThrow(NotFoundException::new);
        userRepository.deleteById(id);

    }

    @Override
    public List<PatientWithAddressDTO> searchPatient(String search) {

        List<Patient> patients = userRepository.searchPatientByAllFields(search);
        return patients.stream().map(PatientWithAddressDTO::fromPatient).toList();
    }

    @Override
    @Transactional
    public PatientWithAddressDTO updatePatient(PatientWithOutAddressDTO patientDTO, Long id) {

        Patient newPatient = patientDTO.toPatient();
        Patient p = userRepository.findPatientById(id).orElseThrow(NotFoundException::new);
        p.setFirstName(newPatient.getFirstName());
        p.setLastName(newPatient.getLastName());
        p.setEmail(newPatient.getEmail());
        p = userRepository.save(p);
        return PatientWithAddressDTO.fromPatient(p);
    }
}
