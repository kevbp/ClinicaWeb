package clientes;

import dto.EntradaCitaDTO;
import dto.SalidaCitaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ApiGestionCita")
public interface ClienteGestionCita {

    @PostMapping("/apiGestionCita/procesarYGrabar")
    SalidaCitaDTO procesarYGrabar(@RequestBody EntradaCitaDTO entrada);

    @GetMapping("/apiGestionCita/buscar/{id}")
    SalidaCitaDTO buscar(@PathVariable("id") Long id);
}