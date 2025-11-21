package clientes;

import dto.BoletaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiBoleta")
public interface ClienteBoleta {

    @GetMapping("/boleta/listar")
    List<BoletaDTO> listar();

    @GetMapping("/boleta/buscar/{id}")
    BoletaDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/boleta/grabar")
    BoletaDTO grabar(@RequestBody BoletaDTO boleta);
}