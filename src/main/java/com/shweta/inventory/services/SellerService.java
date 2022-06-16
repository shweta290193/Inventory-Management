package com.shweta.inventory.services;

import com.shweta.inventory.exceptions.MyCustomException;
import com.shweta.inventory.model.Seller;

import java.util.List;

public interface SellerService {
    Seller createSeller(Seller seller);

    Seller updateSeller(Seller seller,int sellerId);

    Seller updateOnlyName(int sellerId);

    void deleteSeller (int sellerId) throws MyCustomException;

    List<Seller> getAllSellers();

    Seller getSellerById(int sellerId);

    List<Seller> getSellerByName(String sellerName);

    Seller getSellerByNameAndId(String name,int Id);

    List<Seller> getSellerByAddressId(int id);

    List<Seller> getSellersByPagination(int pageNo, int pageSize);

    List<Seller> getSellersByPagination_Sorting(int pageNo, int pageSize,String sortField);

    List<Seller> getSellersByPincode(Long pin);
}
