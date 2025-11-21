package clientes;

import dto.EntradaHorarioDTO;
import dto.SalidaHorarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ApiGestionHorario")
public interface ClienteGestionHorario {

    @PostMapping("/apiGestionHorario/procesarYGrabar")
    SalidaHorarioDTO procesarYGrabar(@RequestBody EntradaHorarioDTO entrada);

    // Nota: He añadido /{idHor} al path para asegurar que funcione correctamente
    // aunque en tu backend original falte definirlo en el @GetMapping.
    @GetMapping("/apiGestionHorario/buscar/{idHor}")
    SalidaHorarioDTO buscar(@PathVariable("idHor") Long idHor);
}
