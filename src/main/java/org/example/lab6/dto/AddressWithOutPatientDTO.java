package org.example.lab6.dto;

import lombok.Data;
import org.example.lab6.entity.Address;

@Data
public class AddressWithOutPatientDTO {
    private Long id;
    private String addressOne;
    private String city;
    private String state;

    public static AddressWithOutPatientDTO fromAddress(Address address){
        AddressWithOutPatientDTO addressWithOutPatientDTO = new AddressWithOutPatientDTO();
        addressWithOutPatientDTO.id = address.getId();
        addressWithOutPatientDTO.addressOne = address.getAddressOne();
        addressWithOutPatientDTO.city = address.getCity();
        addressWithOutPatientDTO.state = address.getState();
        return addressWithOutPatientDTO;

    }

    public Address toAddress(AddressWithOutPatientDTO mailingAddress) {
        Address address = new Address();

        address.setAddressOne(addressOne);
        address.setCity(city);
        address.setState(state);
        return address;

    }
}
