package com.levitea.backend.controller;

import com.levitea.backend.dao.model.ShopOwner;
import com.levitea.backend.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ShopOwnerController {

    @Autowired
    ShopOwnerService shopOwnerService;

    @PostMapping("/shopowners")
    public ShopOwner addShopOwner(@RequestBody ShopOwner shopOwner){
        return shopOwnerService.addShopOwner(shopOwner);
    }

    @PutMapping("/shopowners")
    public ShopOwner updateShopOwnerById(@RequestBody ShopOwner shopOwner,Long id){
        return shopOwnerService.updateShopOwnerById(shopOwner,id);
    }
    @DeleteMapping("/shopowners/{id}")
    public void deleteShopOwnerById(@PathVariable("id") Long id){
        shopOwnerService.deleteShopOwnerById(id);
    }
    @GetMapping("/shopowners/{id}")
    public Optional<ShopOwner> getShopOwnerById(@PathVariable("id") Long id){
        return shopOwnerService.getShopOwnerById(id);
    }

    @GetMapping("/shopowners")
    public List<ShopOwner> getAllShopOwners(){
        return shopOwnerService.getAllShopOwner();
    }

}
