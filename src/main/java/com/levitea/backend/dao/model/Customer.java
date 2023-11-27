package com.levitea.backend.dao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long id;
    private Integer rank;
    private String address;
    private String city;
    private String userDiscount;

//    public Customer(){
//        super();
//    }
}
