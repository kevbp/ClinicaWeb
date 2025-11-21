package clientes;

import dto.EspecialidadDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiEspecialidad")
public interface ClienteEspecialidad {

    @GetMapping("/especialidad/listar")
    List<EspecialidadDTO> listar();

    @GetMapping("/especialidad/buscar/{id}")
    EspecialidadDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/especialidad/grabar")
    EspecialidadDTO grabar(@RequestBody EspecialidadDTO especialidad);

    @PutMapping("/especialidad/actualizar/{id}")
    EspecialidadDTO actualizar(@PathVariable("id") Long id, @RequestBody EspecialidadDTO especialidad);

    @DeleteMapping("/especialidad/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}