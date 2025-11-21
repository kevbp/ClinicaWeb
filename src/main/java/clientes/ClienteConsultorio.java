package clientes;

import dto.ConsultorioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiConsultorio")
public interface ClienteConsultorio {

    @GetMapping("/consultorio/listar")
    List<ConsultorioDTO> listar();

    @GetMapping("/consultorio/buscar/{id}")
    ConsultorioDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/consultorio/grabar")
    ConsultorioDTO grabar(@RequestBody ConsultorioDTO consultorio);

    @PutMapping("/consultorio/actualizar/{id}")
    ConsultorioDTO actualizar(@PathVariable("id") Long id, @RequestBody ConsultorioDTO consultorio);

    @DeleteMapping("/consultorio/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}
