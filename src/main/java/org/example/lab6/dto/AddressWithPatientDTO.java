package org.example.lab6.dto;

import lombok.Data;
import org.example.lab6.entity.Address;
import org.example.lab6.entity.Patient;

@Data
public class AddressWithPatientDTO {

    private Long id;
    private String addressOne;
    private String city;
    private String state;

    private PatientWithOutAddressDTO patient;

    public static AddressWithPatientDTO fromAddress(Address address){
        AddressWithPatientDTO addressWithPatientDTO = new AddressWithPatientDTO();
        addressWithPatientDTO.id = address.getId();
        addressWithPatientDTO.addressOne = address.getAddressOne();
        addressWithPatientDTO.city = address.getCity();
        addressWithPatientDTO.state = address.getState();
        if(address.getPatient() != null) {
            System.out.println("User is not null");
            addressWithPatientDTO.patient = PatientWithOutAddressDTO.fromPatient((Patient) address.getPatient());
        }
        return addressWithPatientDTO;
    }
}
