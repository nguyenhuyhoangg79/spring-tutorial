package dev.keter.controller;

import dev.keter.model.dto.ProductDTO;
import dev.keter.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/main")
public class MainController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<Flux<ProductDTO>> main() {
        return ResponseEntity.ok().body(productService.getAllProduct());
    }
}
