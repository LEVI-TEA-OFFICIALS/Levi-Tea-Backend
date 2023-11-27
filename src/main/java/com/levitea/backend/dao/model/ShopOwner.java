package com.levitea.backend.dao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopOwner extends User{
    private Long id;
    private String shopAddress;
    private String city;
    private String shopDiscount;
    private String shopName;

//    public ShopOwner(){
//        super();
//    }

}
