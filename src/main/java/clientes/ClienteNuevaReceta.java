package clientes;

import dto.SalidaNuevaRecetaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(name = "ApiNuevaReceta")
public interface ClienteNuevaReceta {

    @PostMapping("/apiNuevaReceta/nuevo")
    void iniciar(@RequestBody Map<String, Long> body);

    @GetMapping("/apiNuevaReceta/salida")
    SalidaNuevaRecetaDTO obtenerSalida();
}
