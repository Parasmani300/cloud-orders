package com.redchat.Orders.controller;

import com.redchat.Orders.OrderNotfoundExcepion;
import com.redchat.Orders.dto.OrderDto;
import com.redchat.Orders.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    @PostMapping("/save")
    public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto orderDto)
    {
        OrderDto orderDto1 = ordersService.saveOrder(orderDto);
        return new ResponseEntity<>(orderDto1, HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<OrderDto> getOrder(@PathVariable Integer id) throws OrderNotfoundExcepion {
        OrderDto order = ordersService.getOrder(id);
        return new ResponseEntity<>(order,HttpStatus.OK);
    }
}
