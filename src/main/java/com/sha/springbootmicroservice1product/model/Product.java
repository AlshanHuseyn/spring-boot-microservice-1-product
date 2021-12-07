package com.sha.springbootmicroservice1product.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "name",length = 100,nullable = false)
    private String productName;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name = "create_time",nullable = false)
    private LocalDate createTime;
}
