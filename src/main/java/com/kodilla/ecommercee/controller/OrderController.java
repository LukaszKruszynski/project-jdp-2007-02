package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.OrderDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {
    @GetMapping
    public List<OrderDto> getOrders() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public OrderDto getOrder(@PathVariable Long id){
        return new OrderDto();
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id){
    }

    @PostMapping
    public void createOrder(@RequestBody OrderDto orderDto) {
    }

    @PutMapping
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return OrderDto.builder()
                .id(orderDto.getId())
                .user(orderDto.getUser())
                .totalPrice(orderDto.getTotalPrice())
                .dateOfOrder(orderDto.getDateOfOrder())
                .dateOfShipment(orderDto.getDateOfShipment())
                .deliveryMethod(orderDto.getDeliveryMethod())
                .isPaid(orderDto.isPaid())
                .orderCompleted(orderDto.isOrderCompleted())
                .items(orderDto.getItems())
                .comment(orderDto.getComment())
                .build();
    }
}

