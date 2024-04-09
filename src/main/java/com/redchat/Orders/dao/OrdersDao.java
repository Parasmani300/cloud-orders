package com.redchat.Orders.dao;

import com.redchat.Orders.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersDao extends JpaRepository<Orders,Integer> {
}
