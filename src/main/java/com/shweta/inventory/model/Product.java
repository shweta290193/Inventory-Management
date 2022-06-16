package com.shweta.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productId;
    String productName;
    double price;
    long quantity;

    //@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @OneToMany
    @JoinColumn(name = "prod_id",referencedColumnName="productId")
    List<Seller> sellers;

    //@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @OneToOne
    @JoinColumn(name = "cat_id", referencedColumnName = "categoryId")
    Category category;

}
