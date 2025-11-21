package clientes;

import dto.EntradaHistoriaDTO;
import dto.SalidaHistoriaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ApiGestionHistoria")
public interface ClienteGestionHistoria {

    @PostMapping("/apiGestionHistoria/procesarYGrabar")
    SalidaHistoriaDTO procesarYGrabar(@RequestBody EntradaHistoriaDTO entrada);

    @GetMapping("/apiGestionHistoria/buscar/{id}")
    SalidaHistoriaDTO buscar(@PathVariable("id") Long id);
}