package com.pari.foodapp.orderserviceapp.entity;

import com.pari.foodapp.orderserviceapp.dto.FoodItem;
import com.pari.foodapp.orderserviceapp.dto.Restaurant;
import com.pari.foodapp.orderserviceapp.dto.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("order") // similar to entity in sql
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer orderId;
    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
    private User user;
}