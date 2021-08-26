package com.example.tasknominatim.utils.client.impl;

import com.example.tasknominatim.dto.FullAddressDTO;
import com.example.tasknominatim.utils.AbstractHttpClient;
import com.example.tasknominatim.utils.client.AddressClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class AddressClientImpl extends AbstractHttpClient implements AddressClient {
    private static final String apiURL= "https://nominatim.openstreetmap.org/?addressdetails=<params>";

    public AddressClientImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    private FullAddressDTO emptyResponse() {
        FullAddressDTO response = new FullAddressDTO();
        return response;
    }

    @Override
    public HttpHeaders headers() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("accept-language", "UTF-8");
        return headers;
    }

    @Override
    public FullAddressDTO search(String address) {
        try {
            return get(url(address), FullAddressDTO.class);
        }catch (RuntimeException e) {
            log.error("error while getting category by url {}", apiURL);
            return emptyResponse();
        }
    }

    private String url(String address) {
        return apiURL.replace("<params>", address).replace(" ","+");
    }
}
