package com.pari.foodapp.orderserviceapp.service;

import com.pari.foodapp.orderserviceapp.dto.OrderDto;
import com.pari.foodapp.orderserviceapp.dto.OrderDtoFromFe;
import com.pari.foodapp.orderserviceapp.dto.User;
import com.pari.foodapp.orderserviceapp.entity.Order;
import com.pari.foodapp.orderserviceapp.mapper.OrderMapper;
import com.pari.foodapp.orderserviceapp.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public OrderDto addOrder(OrderDtoFromFe orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        User user = getUserDetailsByUserId(orderDetails.getUserId());
        Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), orderDetails.getRestaurant(), user );
        orderRepo.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
    }

    private User getUserDetailsByUserId(Integer userId) {
        return restTemplate.getForObject("http://USER-SERVICE/user/id/" + userId, User.class);
    }
}