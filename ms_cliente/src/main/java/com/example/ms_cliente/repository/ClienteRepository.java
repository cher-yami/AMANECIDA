package com.example.ms_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ms.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
