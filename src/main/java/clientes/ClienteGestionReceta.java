package clientes;

import dto.EntradaRecetaDTO;
import dto.SalidaRecetaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ApiGestionReceta")
public interface ClienteGestionReceta {

    @PostMapping("/gestionReceta/grabar")
    SalidaRecetaDTO grabar(@RequestBody EntradaRecetaDTO entrada); // Usa DTO

    @GetMapping("/gestionReceta/buscar/{id}")
    SalidaRecetaDTO buscar(@PathVariable("id") Long id);
}
