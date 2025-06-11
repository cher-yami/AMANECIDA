package com.example.ms_cliente.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ms.cliente.entity.Cliente;
import com.example.ms.cliente.dto.ClienteDTO;
import com.example.ms.cliente.repository.ClienteRepository;
import com.example.ms.cliente.service.ClienteService;
import com.example.ms.cliente.util.ClienteMapper;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<ClienteDTO> findAll() {
        return repository.findAll().stream()
                .map(ClienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ClienteDTO findById(Long id) {
        return repository.findById(id)
                .map(ClienteMapper::toDTO)
                .orElse(null);
    }

    @Override
    public ClienteDTO create(ClienteDTO dto) {
        Cliente entity = ClienteMapper.toEntity(dto);
        return ClienteMapper.toDTO(repository.save(entity));
    }

    @Override
    public ClienteDTO update(Long id, ClienteDTO dto) {
        Cliente entity = repository.findById(id).orElse(null);
        if (entity == null) return null;
        entity.setNombre(dto.getNombre());
        return ClienteMapper.toDTO(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
