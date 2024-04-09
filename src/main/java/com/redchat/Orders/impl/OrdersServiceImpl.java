package com.redchat.Orders.impl;

import com.redchat.Orders.OrderNotfoundExcepion;
import com.redchat.Orders.dao.OrdersDao;
import com.redchat.Orders.dto.OrderDto;
import com.redchat.Orders.model.Orders;
import com.redchat.Orders.service.OrdersService;
import com.redchat.Orders.utils.DtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersDao ordersDao;

    @Override
    public OrderDto saveOrder(OrderDto ordersDto) {
        Orders orders = DtoMapper.dtoToOrder(ordersDto);
        Orders orders1 = ordersDao.save(orders);
        return DtoMapper.ordersToDto(orders1);
    }

    @Override
    public OrderDto getOrder(Integer orderId) throws OrderNotfoundExcepion {
        Orders orders = ordersDao.findById(orderId).orElseThrow(() -> new OrderNotfoundExcepion("Not found order"));
        return DtoMapper.ordersToDto(orders);
    }
}
