package clientes;

import dto.SalidaNuevaFichaAnalisisDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(name = "ApiNuevaFichaAnalisis")
public interface ClienteNuevaFichaAnalisis {

    @PostMapping("/apiNuevaFichaAnalisis/nuevo")
    void iniciar(@RequestBody Map<String, Long> body);

    @GetMapping("/apiNuevaFichaAnalisis/salida")
    SalidaNuevaFichaAnalisisDTO obtenerSalida();
}
