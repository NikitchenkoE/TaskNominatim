package com.example.tasknominatim.controllers;

import com.example.tasknominatim.dto.FullAddressDTO;
import com.example.tasknominatim.utils.client.AddressClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class apiController {

    private final AddressClient addressClient;

    @GetMapping("/search")
    public FullAddressDTO searchAddress(@RequestParam String address) {
        log.info("Request on getting address");
        return addressClient.search(address);
    }


}
