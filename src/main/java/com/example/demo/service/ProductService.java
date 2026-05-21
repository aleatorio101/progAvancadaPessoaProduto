package com.example.demo.service;

import com.example.demo.model.ProductModel;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductModel salvar(ProductModel product) {
        return productRepository.save(product);
    }

    public ProductModel buscarPorId(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<ProductModel> listarTodos() {
        return productRepository.findAll();
    }
}