package com.redchat.Orders.utils;

import com.redchat.Orders.dto.OrderDto;
import com.redchat.Orders.model.Orders;
import org.hibernate.query.Order;

public class DtoMapper {
    public static OrderDto ordersToDto(Orders orders)
    {
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderNumber(orders.getOrderNumber());
        orderDto.setName(orders.getName());
        orderDto.setPrice(orders.getPrice());
        orderDto.setQty(orders.getQty());
        return orderDto;
    }

    public static Orders dtoToOrder(OrderDto orderDto)
    {
        Orders orders = new Orders();
        orders.setName(orderDto.getName());
        orders.setPrice(orderDto.getPrice());
        orders.setQty(orderDto.getQty());
        return orders;
    }
}
