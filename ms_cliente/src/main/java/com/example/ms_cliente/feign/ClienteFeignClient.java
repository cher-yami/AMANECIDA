package com.example.ms_cliente.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.ms.cliente.dto.ClienteDTO;

@FeignClient(name = "ms-cliente")
public interface ClienteFeignClient {
    @GetMapping("/clientes/" + "{id}")
    ClienteDTO getById(@PathVariable("id") Long id);
}
