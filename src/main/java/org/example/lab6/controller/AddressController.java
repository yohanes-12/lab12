package org.example.lab6.controller;

import lombok.AllArgsConstructor;
import org.example.lab6.dto.AddressWithPatientDTO;
import org.example.lab6.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adsweb/api/v1/address")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/list")
    public List<AddressWithPatientDTO> getAddresses(){
        return addressService.getAllAddress();
    }
}
