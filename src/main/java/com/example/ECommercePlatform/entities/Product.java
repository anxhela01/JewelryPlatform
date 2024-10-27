package com.example.ECommercePlatform.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    private GenderCategory genderCategory;
    private String description;
    private String brand;
    private double price;
    private int availableQuantity;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;



}
