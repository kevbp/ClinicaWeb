package clientes;

import dto.DisponibilidadDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiDisponibilidad")
public interface ClienteDisponibilidad {

    @GetMapping("/disponibilidad/listar")
    List<DisponibilidadDTO> listar();

    @GetMapping("/disponibilidad/buscar/{id}")
    DisponibilidadDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/disponibilidad/grabar")
    DisponibilidadDTO grabar(@RequestBody DisponibilidadDTO disponibilidad);

    @PutMapping("/disponibilidad/actualizar/{id}")
    DisponibilidadDTO actualizar(@PathVariable("id") Long id, @RequestBody DisponibilidadDTO disponibilidad);

    @DeleteMapping("/disponibilidad/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}
