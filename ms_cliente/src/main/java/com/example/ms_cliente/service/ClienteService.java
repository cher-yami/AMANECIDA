package com.example.ms_cliente.service;

import java.util.List;
import com.example.ms.cliente.dto.ClienteDTO;

public interface ClienteService {
    List<ClienteDTO> findAll();
    ClienteDTO findById(Long id);
    ClienteDTO create(ClienteDTO dto);
    ClienteDTO update(Long id, ClienteDTO dto);
    void delete(Long id);
}
