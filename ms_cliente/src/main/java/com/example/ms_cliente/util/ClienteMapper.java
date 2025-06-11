package com.example.ms_cliente.util;


import com.example.ms_cliente.dto.ClienteDTO;
import com.example.ms_cliente.entity.Cliente;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente entity) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        return dto;
    }

    public static Cliente toEntity(ClienteDTO dto) {
        Cliente entity = new Cliente();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        return entity;
    }
}
