package com.example.ms_cliente.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
}
