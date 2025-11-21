package clientes;

import dto.EntradaBoletaDTO;
import dto.SalidaBoletaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ApiGestionBoleta")
public interface ClienteGestionBoleta {

    @PostMapping("/apiGestionBoleta/procesarYGrabar")
    SalidaBoletaDTO procesarYGrabar(@RequestBody EntradaBoletaDTO entrada);

    @GetMapping("/apiGestionBoleta/buscar/{id}")
    SalidaBoletaDTO buscar(@PathVariable("id") Long id);
}