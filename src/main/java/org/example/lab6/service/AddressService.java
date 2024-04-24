package org.example.lab6.service;

import org.example.lab6.dto.AddressWithPatientDTO;
import org.example.lab6.entity.Address;

import java.util.List;

public interface AddressService {
    Address newAddress(Address address);

    List<AddressWithPatientDTO> getAllAddress();
}
