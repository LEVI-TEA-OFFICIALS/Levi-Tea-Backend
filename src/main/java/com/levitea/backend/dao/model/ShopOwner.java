package com.levitea.backend.dao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class ShopOwner {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNo;
    private Integer rank;
    private String shopAddress;
    private String city;
    private String shopDiscount;
    private String shopName;
}
