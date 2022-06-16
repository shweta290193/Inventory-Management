package com.shweta.inventory.serviceImpl;

import com.shweta.inventory.exceptions.MyCustomException;
import com.shweta.inventory.model.Seller;
import com.shweta.inventory.repository.SellerRepository;
import com.shweta.inventory.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerRepository sellerRepository;

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public Seller updateSeller(Seller seller, int sellerId) {
        return null;
    }

    @Override
    public Seller updateOnlyName(int sellerId) {
        return null;
    }

    @Override
    public void deleteSeller(int sellerId) throws MyCustomException {

    }

    @Override
    public List<Seller> getAllSellers() {
        return null;
    }

    @Override
    public Seller getSellerById(int sellerId) {
        return null;
    }

    @Override
    public List<Seller> getSellerByName(String sellerName) {
        return null;
    }

    @Override
    public Seller getSellerByNameAndId(String name, int Id) {
        return null;
    }

    @Override
    public List<Seller> getSellerByAddressId(int id) {
        return null;
    }

    @Override
    public List<Seller> getSellersByPagination(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public List<Seller> getSellersByPagination_Sorting(int pageNo, int pageSize, String sortField) {
        return null;
    }

    @Override
    public List<Seller> getSellersByPincode(Long pin) {
        return null;
    }
}
