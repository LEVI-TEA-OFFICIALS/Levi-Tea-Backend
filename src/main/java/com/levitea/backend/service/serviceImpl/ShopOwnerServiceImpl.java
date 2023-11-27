package com.levitea.backend.service.serviceImpl;

import com.levitea.backend.dao.model.ShopOwner;
import com.levitea.backend.dao.repository.ShopOwnerRepository;
import com.levitea.backend.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ShopOwnerServiceImpl implements ShopOwnerService {

    @Autowired
    ShopOwnerRepository shopOwnerRepository;

    @Override
    public ShopOwner addShopOwner(ShopOwner shopOwner) {
        return shopOwnerRepository.saveAndFlush(shopOwner);
    }
    @Override
    public List<ShopOwner> getAllShopOwner(){
        return shopOwnerRepository.findAll();
    }
    @Override
    public Optional<ShopOwner> getShopOwnerById(Long id){
        return shopOwnerRepository.findById(id);
    }

    public ShopOwner getShopOwnerByUsername(String username){
        return shopOwnerRepository.findByUsername(username);
    }

    public void deleteShopOwnerById(Long id){
        shopOwnerRepository.deleteById(id);
    }

    public ShopOwner updateShopOwnerById(ShopOwner owner, Long id){
        return shopOwnerRepository.save(owner);
    }

}
