package org.example.lab6.service;

import org.example.lab6.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentService {

    Appointment newAppointment(Appointment appointment);

    List<Appointment> findAll();
}
