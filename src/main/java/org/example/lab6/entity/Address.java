package org.example.lab6.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue()
    private Long id;
    private String addressOne;
    private String city;
    private String state;
    @OneToOne(mappedBy = "mailingAddress")
    private Patient patient;
}
