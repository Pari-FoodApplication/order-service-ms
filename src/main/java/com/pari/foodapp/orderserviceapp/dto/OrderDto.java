package com.pari.foodapp.orderserviceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Integer orderId;
    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
    private User user;
}
