package com.example.tasknominatim.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FullAddressDTO {
    @JsonProperty("address")
    private Object address;

    @JsonProperty("boundingbox")
    private List<String> boundingbox;

    @JsonProperty("class")
    private String classField;

    @JsonProperty("display_name")
    private String display_name;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("importance")
    private Double importance;

    @JsonProperty("lat")
    private String lat;

    @JsonProperty("licence")
    private String licence;

    @JsonProperty("lon")
    private String lon;

    @JsonProperty("osm_id")
    private String osm_id;

    @JsonProperty("osm_type")
    private String osm_type;

    @JsonProperty("place_id")
    private String place_id;

    @JsonProperty("type")
    private String type;


}
