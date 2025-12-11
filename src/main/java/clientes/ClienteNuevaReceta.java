package clientes;

import dto.EntradaInicioDTO; // <--- Importante
import dto.SalidaNuevaRecetaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ApiNuevaReceta")
public interface ClienteNuevaReceta {

    @PostMapping("/apiNuevaReceta/nuevo")
    void iniciar(@RequestBody EntradaInicioDTO entrada); // <--- CAMBIADO (Antes Map)

    @GetMapping("/apiNuevaReceta/salida")
    SalidaNuevaRecetaDTO obtenerSalida();
}
