package com.example.tasknominatim.utils.client;

import com.example.tasknominatim.dto.FullAddressDTO;

public interface AddressClient {
    FullAddressDTO search(String address);
}
