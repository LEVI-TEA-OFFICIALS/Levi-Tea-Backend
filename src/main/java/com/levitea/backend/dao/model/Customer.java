package com.levitea.backend.dao.model;

import com.levitea.backend.utils.Constants.CustomerType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phoneNo;
    private Integer rank=0;
    private String address;
    private String city;
    private String userDiscount;
    private String shopName;
//    @Enumerated(EnumType.STRING)
//    private CustomerType customerType;
}
