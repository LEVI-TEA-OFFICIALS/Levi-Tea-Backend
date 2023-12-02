package com.levitea.backend.dao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String username;
    private String size;
    private double mrp;
    private String type;
    private double mrpDiscount;
}