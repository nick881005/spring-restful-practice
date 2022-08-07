package com.example.springrestfulpractice.controller;

import com.example.springrestfulpractice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springrestfulpractice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        List<Order> orderList = this.orderService.getAllOrders();
        return orderList;
    }

    @GetMapping("/{seq}")
    public Order getOrderById(@PathVariable int seq) {
        Order getOrder = this.orderService.getOrderbyId(seq);
        return getOrder;
    }

    @PostMapping()
    public Order createOrder(@RequestBody Order order) {
        Order createOrder = this.orderService.createOrder(order);
        return createOrder;
    }

    @PutMapping("/{seq}")
    public Order updateOrder(@PathVariable int seq, @RequestBody Order order) {
        Order updateOrder = this.orderService.updateOrder(seq, order);
        return updateOrder;
    }

    @DeleteMapping("/{seq}")
    public Order deleteOrder(@PathVariable int seq) {
        Order deleteOrder = this.orderService.deleteOrder(seq);
        return deleteOrder;
    }
}