package org.example.lab6.service.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.lab6.entity.Appointment;
import org.example.lab6.repo.AppointmentRepository;
import org.example.lab6.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment newAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

}
