package clientes;

import dto.PacienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiPaciente")
public interface ClientePaciente {

    @GetMapping("/paciente/listar")
    List<PacienteDTO> listar();

    @GetMapping("/paciente/buscar/{id}")
    PacienteDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/paciente/grabar")
    PacienteDTO grabar(@RequestBody PacienteDTO paciente);

    @PutMapping("/paciente/actualizar/{id}")
    PacienteDTO actualizar(@PathVariable("id") Long id, @RequestBody PacienteDTO paciente);

    @DeleteMapping("/paciente/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}