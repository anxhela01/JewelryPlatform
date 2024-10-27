package com.example.ECommercePlatform.controller;

import com.example.ECommercePlatform.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderItemController {
    private final OrderItemService orderItemService;
}
