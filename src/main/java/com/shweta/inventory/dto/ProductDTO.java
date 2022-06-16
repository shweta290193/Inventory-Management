package com.shweta.inventory.dto;

import com.shweta.inventory.model.Category;
import com.shweta.inventory.model.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    int productId;
    String productName;
    double price;
    long quantity;
    Category category;
    List<Seller> sellers;
}
