package com.example.ECommercePlatform.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Category category;
    private GenderCategory genderCategory;
    private String description;
    private String brand;
    private double price;
    private int avaiableQuantity;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;



}
