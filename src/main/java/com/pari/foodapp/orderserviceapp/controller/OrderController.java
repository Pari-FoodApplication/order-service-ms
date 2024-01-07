package com.pari.foodapp.orderserviceapp.controller;

import com.pari.foodapp.orderserviceapp.dto.OrderDto;
import com.pari.foodapp.orderserviceapp.dto.OrderDtoFromFe;
import com.pari.foodapp.orderserviceapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDtoFromFe orderDetails){
        OrderDto orderSavedInDB = orderService.addOrder(orderDetails);
        return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
    }
}