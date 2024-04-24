package org.example.lab6.controller;


import lombok.AllArgsConstructor;
import org.example.lab6.dto.PatientWithAddressDTO;
import org.example.lab6.dto.PatientWithOutAddressDTO;
import org.example.lab6.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adsweb/api/v1/patient")
@AllArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @GetMapping("/list")
    public List<PatientWithAddressDTO> getPatients(){
       return patientService.getAllPatients();
    }
    @GetMapping("/get/{id}")
    public PatientWithAddressDTO getPatientById(@PathVariable Long id){
        return patientService.getPatientById(id);
    }

    @PostMapping("/register")
    public PatientWithAddressDTO registerPatient(@RequestBody PatientWithAddressDTO patientDTO){
        return patientService.registerPatient(patientDTO);
    }

    @PutMapping("/update/{id}")
    public PatientWithAddressDTO updatePatient(@RequestBody PatientWithOutAddressDTO patientDTO, @PathVariable Long id){
        return patientService.updatePatient(patientDTO, id);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePatient(@PathVariable Long id){
         patientService.deletePatient(id);
    }

    @GetMapping("/search/{search_string}")
    public List<PatientWithAddressDTO> searchPatient(@PathVariable(value = "search_string") String searchString){
        System.out.println("searchString = " + searchString);
        return patientService.searchPatient(searchString);
    }


}
