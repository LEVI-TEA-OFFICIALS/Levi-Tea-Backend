package com.levitea.backend.dao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String Name;
    private double price;
    private String type;
    private double mrpDiscount;
}
