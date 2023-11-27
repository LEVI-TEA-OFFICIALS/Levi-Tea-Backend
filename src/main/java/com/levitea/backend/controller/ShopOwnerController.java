package com.levitea.backend.controller;

import com.levitea.backend.dao.model.ShopOwner;
import com.levitea.backend.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class ShopOwnerController {

    @Autowired
    ShopOwnerService shopOwnerService;

    @PostMapping("/addShopOwner")
    public ShopOwner addShopOwner(@RequestBody ShopOwner shopOwner){
        return shopOwnerService.addShopOwner(shopOwner);
    }

    public ShopOwner updateShopOwnerById(@RequestBody ShopOwner shopOwner,Long id){
        return shopOwnerService.updateShopOwnerById(shopOwner,id);
    }

    public void deleteShopOwnerById(@RequestBody Long id){
        shopOwnerService.deleteShopOwnerById(id);
    }

    public Optional<ShopOwner> getShopOwnerById(@RequestBody Long id){
        return shopOwnerService.getShopOwnerById(id);
    }

    public List<ShopOwner> getAllShopOwners(){
        return shopOwnerService.getAllShopOwner();
    }

}
