package com.example.demo.service;

import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel salvar(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteModel buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<ClienteModel> listarTodos() {
        return clienteRepository.findAll();
    }
}