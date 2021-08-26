package com.example.tasknominatim.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class AddressEntity {
    @Id
    private Long id;

    private String longitude;
    private String latitude;

}
