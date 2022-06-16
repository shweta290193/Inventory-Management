package com.shweta.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SellerDTO {
    int sellerId;
    String sellerName;
    long pincode;
    String streetName;
    String city; /**
     Adding only selected fields from Address.java, not Address object or all fields
     from Address are added here in SellerDTO for Address
     No Separate DTO class for Address*/
}
