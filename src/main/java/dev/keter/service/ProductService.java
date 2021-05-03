package dev.keter.service;

import dev.keter.model.dto.ProductDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface ProductService {
    Flux<ProductDTO> getAllProduct();
}
