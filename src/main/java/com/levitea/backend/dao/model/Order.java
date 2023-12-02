package com.levitea.backend.dao.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Order_details")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private double quantity;
    private String totalPrice;
    private String discount;
}
