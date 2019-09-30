package io.ikka.demoproducts;

import io.ikka.demoproducts.model.dto.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer")
public interface CustomerClient {
    @GetMapping("/customer/{id}")
    Customer getCustomerById(@PathVariable("id") Long id);
}
