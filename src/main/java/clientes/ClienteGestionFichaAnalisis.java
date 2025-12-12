package clientes;

import dto.EntradaFichaAnalisisDTO;
import dto.SalidaFichaAnalisisDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ApiGestionFichaAnalisis")
public interface ClienteGestionFichaAnalisis {

    @PostMapping("/gestionFichaAnalisis/grabar")
    SalidaFichaAnalisisDTO grabar(@RequestBody EntradaFichaAnalisisDTO entrada); // Usa DTO

    @GetMapping("/gestionFichaAnalisis/buscar/{id}")
    SalidaFichaAnalisisDTO buscar(@PathVariable("id") Long id);
}
