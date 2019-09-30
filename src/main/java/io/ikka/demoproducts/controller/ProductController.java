package io.ikka.demoproducts.controller;

import io.ikka.demoproducts.CustomerClient;
import io.ikka.demoproducts.model.dto.Customer;
import io.ikka.demoproducts.model.dto.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ProductController {
    private final CustomerClient customerClient;

    @GetMapping("/product/{id}")
    public ResponseEntity getProduct(@PathVariable("id") Long id) {
        Customer customerById = customerClient.getCustomerById(1L);
        Product product = new Product();
        product.setName(LocalDateTime.now().toString());
        return ResponseEntity.ok(product);
    }
}
