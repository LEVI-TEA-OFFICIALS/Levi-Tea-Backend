package com.levitea.backend.service;

import com.levitea.backend.dao.model.Customer;
import com.levitea.backend.dao.model.ShopOwner;

import java.util.List;
import java.util.Optional;

public interface ShopOwnerService {

    ShopOwner addShopOwner(ShopOwner shopOwner);

//    get all ShopOwner
    List<ShopOwner> getAllShopOwner();

    //get user details by id
    Optional<ShopOwner> getShopOwnerById(Long id);

    //get user by username
    ShopOwner getShopOwnerByUsername(String username);


    //delete a ShopOwner based on ID
    void deleteShopOwnerById(Long id);

    //update a ShopOwner based on ID
    ShopOwner updateShopOwnerById(ShopOwner owner, Long id);

}
