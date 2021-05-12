package dev.keter.controller;

import java.util.List;

import dev.keter.model.dto.ProductDTO;
import dev.keter.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        List<ProductDTO> products = this.productService.findAll(20);
        model.addAttribute("products", products);
        return "index";
    }

    @RequestMapping(value = {"/addToCart/productId={productId}"}, method = RequestMethod.GET)
    public String showAddToCart(Model model,
                                @PathVariable("productId") String productId
    ) {
        return "cart";
    }

}