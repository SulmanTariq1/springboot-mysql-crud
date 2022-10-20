package com.springbootcrudmysql.controller;

import com.springbootcrudmysql.entity.Product;
import com.springbootcrudmysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
        return  service.SaveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
        return  service.SaveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return  service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return  service.getProduct(id);
    }

    @GetMapping("/getProduct/{name}")
    public Product findProductByName(@PathVariable String name)
    {
        return  service.getProductbyName(name);
    }

    @PutMapping("/update")
    public Product putProduct(@RequestBody Product product)
    {
        return  service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return  service.deleteProduct(id);
    }


}
