package com.example.ms.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms.cliente.dto.ClienteDTO;
import com.example.ms.cliente.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteDTO> getAll() {
        return service.findAll();
    }

    @GetMapping("/{
id}")
    public ClienteDTO getById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ClienteDTO create(@RequestBody ClienteDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{
id}")
    public ClienteDTO update(@PathVariable("id") Long id, @RequestBody ClienteDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{
id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
