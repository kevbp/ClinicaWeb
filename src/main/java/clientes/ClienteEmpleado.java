package clientes;

import dto.EmpleadoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiEmpleado")
public interface ClienteEmpleado {

    @GetMapping("/empleado/listar")
    List<EmpleadoDTO> listar();

    @GetMapping("/empleado/buscar/{id}")
    EmpleadoDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/empleado/grabar")
    EmpleadoDTO grabar(@RequestBody EmpleadoDTO empleado);

    @PutMapping("/empleado/actualizar/{id}")
    EmpleadoDTO actualizar(@PathVariable("id") Long id, @RequestBody EmpleadoDTO empleado);

    @DeleteMapping("/empleado/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}