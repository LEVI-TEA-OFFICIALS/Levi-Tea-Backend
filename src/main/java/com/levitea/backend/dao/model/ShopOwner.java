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
public class ShopOwner{
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String name;
    private String shopName;
    private String email;
    private String phoneNo;
    private Integer rank=0;
    private String shopAddress;
    private String city;
    private String shopDiscount;
}
