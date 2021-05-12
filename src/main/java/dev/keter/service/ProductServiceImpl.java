package dev.keter.service;

import dev.keter.model.dto.ProductDTO;
import dev.keter.model.entity.Product;
import dev.keter.repository.ProductReposity;
import dev.keter.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl {
    @Autowired
    private ProductReposity productRepository;

    public ProductServiceImpl() {
    }

    public List<ProductDTO> findAll(Integer limit) {
        List<Product> products = Optional.ofNullable(limit).map(value -> productRepository.findAll(PageRequest.of(0, value)).getContent()
        ).orElseGet(() -> productRepository.findAll()
        );
        return ObjectMapperUtils.mapAll(products, ProductDTO.class);
    }

}
