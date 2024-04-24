package org.example.lab6.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
public class Dentist  extends User {

    @OneToMany(mappedBy = "dentist")
    private List<Appointment> appointments;
    private String specialization;
}
