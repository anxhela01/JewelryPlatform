package com.example.ECommercePlatform.controller;

import com.example.ECommercePlatform.service.ProductImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductImageController {
    private final ProductImageService productImageService;
}
