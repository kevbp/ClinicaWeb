package clientes;

import dto.EntradaInicioDTO;
import dto.SalidaNuevaFichaAnalisisDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ApiNuevaFichaAnalisis")
public interface ClienteNuevaFichaAnalisis {

    @PostMapping("/apiNuevaFichaAnalisis/nuevo")
    void iniciar(@RequestBody EntradaInicioDTO entrada); // Usa DTO

    @GetMapping("/apiNuevaFichaAnalisis/salida")
    SalidaNuevaFichaAnalisisDTO obtenerSalida();
}
