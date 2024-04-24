package org.example.lab6;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.lab6.entity.*;
import org.example.lab6.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class Lab6Application  implements CommandLineRunner {





    public static void main(String[] args) {
        SpringApplication.run(Lab6Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

//
//        Role patientRole = new Role();
//        patientRole.setRoleType(Role.RoleType.PATIENT);
//        patientRole =  roleService.newRole(patientRole);
//
//        Role dentistRole = new Role();
//        dentistRole.setRoleType(Role.RoleType.DENTIST);
//        dentistRole = roleService.newRole(dentistRole);
//
//
//
//        Address address1 = new Address();
//        address1.setCity("Fairfield");
//        address1.setState("Iowa");
//        address1.setAddressOne("1000 N 4th St.");
//        address1 = addressService.newAddress(address1);
//
//
//        Address address2 = new Address();
//        address2.setCity("Des Moines");
//        address2.setState("Iowa");
//        address2.setAddressOne("1000 Grand Ave.");
//        address2 = addressService.newAddress(address2);
//
//        Address address3 = new Address();
//        address3.setCity("Iowa City");
//        address3.setState("Iowa");
//        address3.setAddressOne("1000 N 4th St.");
//        address3 = addressService.newAddress(address3);
//
//        Address address4 = new Address();
//        address4.setCity("Cedar Rapids");
//        address4.setState("Iowa");
//        address4.setAddressOne("1000 Grand Ave.");
//        address4 = addressService.newAddress(address4);
//
//
//        Dentist tony = new Dentist();
//        tony.setFirstName("Tony");
//        tony.setLastName("Smith");
//        tony.setEmail("tony@mail.com");
//        tony.setUserRole(dentistRole );
//        tony =  (Dentist) userService.newUser(tony);
//
//        System.out.println("Tony: " + tony.getId());
//
//        Dentist helen = new Dentist();
//        helen.setFirstName("Helen");
//        helen.setLastName("Pearson");
//        helen.setEmail("Helen@mail.com");
//        helen.setUserRole(dentistRole);
//        helen =  (Dentist) userService.newUser(helen);
//
//        System.out.println("Helen: " + helen.getId());
//
//
//        Dentist robin = new Dentist();
//        robin.setFirstName("Robin");
//        robin.setLastName("Plevin");
//        robin.setEmail("Robin@mail.com");
//        robin.setUserRole(dentistRole); ;
//        robin =  (Dentist) userService.newUser(robin);
//
//        System.out.println("Robin: " + robin.getId());
//
////
//        Patient p100 = new Patient();
//        p100.setPatientNo("P100");
//        p100.setFirstName("John");
//        p100.setLastName("Doe");
//        p100.setEmail("p100@mail.com");
//        p100.setDateOfBirth(java.time.LocalDate.now().minusYears(30));
//        p100.setMailingAddress(address1);
//        p100.setUserRole(patientRole);
//        p100 = (Patient) userService.newUser(p100);
////
//        Patient p105 = new Patient();
//        p105.setPatientNo("P105");
//        p105.setFirstName("Jane");
//        p105.setLastName("Doe");
//        p105.setEmail("jane@mail.com");
//        p105.setDateOfBirth(java.time.LocalDate.now().minusYears(25));
//        p105.setMailingAddress(address2);
//        p105.setUserRole(patientRole);
//        p105 = (Patient) userService.newUser(p105);
////
//        Patient p108 = new Patient();
//        p108.setPatientNo("P108");
//        p108.setFirstName("Alice");
//        p108.setLastName("Smith");
//        p108.setEmail("alice@mail.com");
//        p108.setDateOfBirth(java.time.LocalDate.now().minusYears(35));
//        p108.setMailingAddress(address3);
//        p108.setUserRole(patientRole);
//        p108 = (Patient) userService.newUser(p108);
//
//        Patient p110 = new Patient();
//        p110.setPatientNo("P110");
//        p110.setFirstName("Bob");
//        p110.setLastName("Smith");
//        p110.setEmail("bob@mail.com");
//        p110.setDateOfBirth(java.time.LocalDate.now().minusYears(40));
//        p110.setMailingAddress(address4);
//        p110.setUserRole(patientRole);
//        p110 = (Patient) userService.newUser(p110);
//
//
//        Surgery s1 = new Surgery();
//        s1.setSurgeryName("Root Canal");
//        s1.setSurgeryNo("S15");
//        s1.setAddress(address1);
//        s1 = surgeryService.newSurgery(s1);
//
//        Surgery s2 = new Surgery();
//        s2.setSurgeryName("Crown");
//        s2.setSurgeryNo("S10");
//        s2.setAddress(address2);
//        s2 = surgeryService.newSurgery(s2);
//
//        Surgery s3 = new Surgery();
//        s3.setSurgeryName("Cleaning");
//        s3.setSurgeryNo("S13");
//        s3.setAddress(address3);
//        s3 = surgeryService.newSurgery(s3);
//
//
//        Appointment a1 = new Appointment();
//        a1.setDentist(tony);
//        a1.setPatient(p100);
//        a1.setSurgery(s1);
//        a1.setAppointmentDateTime(java.time.LocalDateTime.now().plusDays(1));
//
//        Appointment a2 = new Appointment();
//        a2.setDentist(helen);
//        a2.setPatient(p105);
//        a2.setSurgery(s2);
//        a2.setAppointmentDateTime(java.time.LocalDateTime.now().plusDays(2));
//
//
//        Appointment a3 = new Appointment();
//        a3.setDentist(robin);
//        a3.setPatient(p108);
//        a3.setSurgery(s3);
//        a3.setAppointmentDateTime(java.time.LocalDateTime.now().plusDays(3));
//
//
//        Appointment a4 = new Appointment();
//        a4.setDentist(tony);
//        a4.setPatient(p110);
//        a4.setSurgery(s1);
//        a4.setAppointmentDateTime(java.time.LocalDateTime.now().plusDays(4));
//
//
//
//        Appointment a5 = new Appointment();
//        a5.setDentist(helen);
//        a5.setPatient(p100);
//        a5.setSurgery(s2);
//        a5.setAppointmentDateTime(java.time.LocalDateTime.now().plusDays(5));
//
//
//        Appointment a6 = new Appointment();
//        a6.setDentist(robin);
//        a6.setPatient(p105);
//        a6.setSurgery(s3);
//        a6.setAppointmentDateTime(java.time.LocalDateTime.now().plusDays(6));
//
//
//        Appointment a7 = new Appointment();
//        a7.setDentist(tony);
//        a7.setPatient(p108);
//        a7.setSurgery(s1);
//        a7.setAppointmentDateTime(java.time.LocalDateTime.now().plusDays(7));
//
//
//        appointmentService.newAppointment(a1);
//        appointmentService.newAppointment(a2);
//        appointmentService.newAppointment(a3);
//        appointmentService.newAppointment(a4);
//        appointmentService.newAppointment(a5);
//        appointmentService.newAppointment(a6);
//        appointmentService.newAppointment(a7);
//
//
//
//        List<Appointment> appointments = appointmentService.findAll();
//        for (Appointment appointment : appointments) {
//            System.out.println(appointment);
//        }
//
//
//



















    }
}
