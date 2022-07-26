package bened.business.controllers;

import bened.business.models.Product;
import bened.business.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productsService.createProduct(product);
    }

    @GetMapping
    public List<Product> readProducts() {
        return productsService.getProducts();
    }

    @RequestMapping(value="/products/{productId}", method=RequestMethod.PUT)
    public Product readProducts(@PathVariable(value = "productId") Long id, @RequestBody Product productDetails) {
        return productsService.updateProduct(id, productDetails);
    }

    @RequestMapping(value="/{productId}", method=RequestMethod.DELETE)
    public void deleteProducts(@PathVariable(value = "productId") Long id) {
        productsService.deleteProduct(id);
    }
}
