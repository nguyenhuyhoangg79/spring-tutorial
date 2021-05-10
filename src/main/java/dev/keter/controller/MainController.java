package dev.keter.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dev.keter.model.entity.Product;

@Controller
public class MainController {
    private static List<Product> products = new ArrayList<Product>();
    static {
        products.add(new Product("1", "Samsung Galaxy s5- 2015", "img/product-1.jpg", 700.00, 1000.00));
        products.add(new Product("2", "Nokia Lumia 1320", "img/product-2.jpg", 899.00, 999.00));
    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("products", products);
        return "index";
    }

    @RequestMapping(value = { "/addToCart/productId={productId}" }, method = RequestMethod.GET)
    public String showAddToCart(Model model,
                                @PathVariable("productId") String productId
    ) {
        System.out.println("Hello" + productId);
        return "cart";
    }

}