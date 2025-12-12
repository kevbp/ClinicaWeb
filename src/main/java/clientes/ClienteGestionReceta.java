package clientes;

import dto.EntradaRecetaDTO;
import dto.SalidaRecetaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ApiGestionReceta")
public interface ClienteGestionReceta {

    // CORREGIDO: La ruta debe coincidir con @RequestMapping + @PostMapping del microservicio
    @PostMapping("/apiGestionReceta/procesarYGrabar")
    SalidaRecetaDTO grabar(@RequestBody EntradaRecetaDTO entrada);

    // CORREGIDO: Asumo que el buscar también tiene el prefijo /apiGestionReceta
    @GetMapping("/apiGestionReceta/buscar/{id}")
    SalidaRecetaDTO buscar(@PathVariable("id") Long id);
}
