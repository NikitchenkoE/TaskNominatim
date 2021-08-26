package com.example.tasknominatim.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;


@Data
public class AddressDTO {
    @JsonProperty("bakery")
    private String bakery;
    @JsonProperty("city_district")
    private String city_district;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String country_code;
    @JsonProperty("footway")
    private String footway;
    @JsonProperty("neighbourhood")
    private String neighbourhood;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("state")
    private String state;
    @JsonProperty("suburb")
    private String suburb;
}
