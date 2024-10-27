package com.example.ECommercePlatform.controller;

import com.example.ECommercePlatform.repository.CartItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CartItemController {
    private final CartItemRepository cartItemRepository;
}
