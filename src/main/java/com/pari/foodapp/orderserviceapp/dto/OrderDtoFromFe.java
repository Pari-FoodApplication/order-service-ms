package com.pari.foodapp.orderserviceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDtoFromFe {
    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
    private Integer userId;
}
