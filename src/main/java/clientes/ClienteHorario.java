package clientes;

import dto.HorarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiHorario")
public interface ClienteHorario {

    @GetMapping("/horario/listar")
    List<HorarioDTO> listar();

    @GetMapping("/horario/buscar/{id}")
    HorarioDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/horario/grabar")
    HorarioDTO grabar(@RequestBody HorarioDTO horario);
}