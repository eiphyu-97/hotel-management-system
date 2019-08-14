package com.example.hotel.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@RequiredArgsConstructor
public class Role {

    private Long id;
    private String roleName;

}
