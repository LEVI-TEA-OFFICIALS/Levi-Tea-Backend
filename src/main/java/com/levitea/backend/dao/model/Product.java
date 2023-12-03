package com.levitea.backend.dao.model;

import com.levitea.backend.utils.Constants.ProductSize;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String username;
    @Enumerated()
    private ProductSize productSize;
    private double mrp;
    private String type;
    private double mrpDiscount;
}