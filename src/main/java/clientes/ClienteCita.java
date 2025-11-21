package clientes;

import dto.CitaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiCita")
public interface ClienteCita {

    @GetMapping("/cita/listar")
    List<CitaDTO> listar();

    @GetMapping("/cita/buscar/{id}")
    CitaDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/cita/grabar")
    CitaDTO grabar(@RequestBody CitaDTO cita);
    
    @PutMapping("/cita/actualizar/{id}")
    CitaDTO actualizar(@PathVariable("id") Long id, @RequestBody CitaDTO cita);
}