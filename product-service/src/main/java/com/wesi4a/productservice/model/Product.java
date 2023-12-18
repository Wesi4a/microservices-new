package com.wesi4a.productservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private int quantity;
    private BigDecimal price;
}
