package com.example.demo.controller;

import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductModel salvar(@RequestBody ProductModel product) {
        return productService.salvar(product);
    }

    @GetMapping("/{id}")
    public ProductModel buscar(@PathVariable Long id) {
        return productService.buscarPorId(id);
    }

    @GetMapping
    public List<ProductModel> listar() {
        return productService.listarTodos();
    }
}