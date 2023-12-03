package com.levitea.backend.dao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Entity
@Data
@Table(name = "Order_details")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Double totalPrice;
    private String discount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    @ElementCollection
    @CollectionTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "order_id")
    )
    @MapKeyJoinColumn(name = "product_id")
    @Column(name = "quantity")
    private Map<Product, Integer> productQuantity;

}
