package com.example.tasknominatim.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;


@Data
public class AddressDTO {
    private String bakery;
    private String city_district;
    private String continent;
    private String country;
    private String country_code;
    private String footway;
    private String neighbourhood;
    private String postcode;
    private String state;
    private String suburb;
}
