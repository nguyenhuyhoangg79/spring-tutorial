package dev.keter.service;

import dev.keter.model.dto.ProductDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Flux<ProductDTO> getAllProduct() {

        ProductDTO dto1 = new ProductDTO();
        dto1.setName("product 1");
        dto1.setPrice(100000L);
        dto1.setDescription("des 1");

        ProductDTO dto2 = new ProductDTO();
        dto2.setName("product 2");
        dto2.setPrice(100002L);
        dto2.setDescription("des 2");

        ProductDTO dto3 = new ProductDTO();
        dto3.setName("product 3");
        dto3.setPrice(100003L);
        dto3.setDescription("des 3");

        return Flux.just(dto1, dto2, dto3);
    }
}
