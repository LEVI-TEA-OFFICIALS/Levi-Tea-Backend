package com.levitea.backend.controller;

import com.levitea.backend.dao.model.ShopOwner;
import com.levitea.backend.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ShopOwnerController {

    @Autowired
    ShopOwnerService shopOwnerService;

    @PostMapping("/addShopOwner")
    public ShopOwner addShopOwner(@RequestBody ShopOwner shopOwner){
        return shopOwnerService.addShopOwner(shopOwner);
    }
}
