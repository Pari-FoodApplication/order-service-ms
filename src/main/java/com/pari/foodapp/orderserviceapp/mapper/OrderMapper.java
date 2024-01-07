package com.pari.foodapp.orderserviceapp.mapper;

import com.pari.foodapp.orderserviceapp.dto.OrderDto;
import com.pari.foodapp.orderserviceapp.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDto orderDTO);
    OrderDto mapOrderToOrderDTO(Order order);

}