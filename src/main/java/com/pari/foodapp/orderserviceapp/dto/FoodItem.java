package com.pari.foodapp.orderserviceapp.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {

    private int id;
    private String name;
    private String description;
    private boolean isVeg;
    private Long price;
    private Integer restaurantId;
    private Integer quantity;

}