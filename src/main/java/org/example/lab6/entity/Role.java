package org.example.lab6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue()
    private Long id;

    private RoleType roleType;


    public enum RoleType {
        OfficeManager, DENTIST, PATIENT
    }




}


