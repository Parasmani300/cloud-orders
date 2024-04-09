package com.redchat.Orders.service;

import com.redchat.Orders.OrderNotfoundExcepion;
import com.redchat.Orders.dao.OrdersDao;
import com.redchat.Orders.dto.OrderDto;

public interface OrdersService {
    public OrderDto saveOrder(OrderDto ordersDto);
    public OrderDto getOrder(Integer orderId) throws OrderNotfoundExcepion;
}
