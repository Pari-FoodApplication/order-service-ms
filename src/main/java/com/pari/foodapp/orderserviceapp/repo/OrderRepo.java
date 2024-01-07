package com.pari.foodapp.orderserviceapp.repo;


import com.pari.foodapp.orderserviceapp.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {
}