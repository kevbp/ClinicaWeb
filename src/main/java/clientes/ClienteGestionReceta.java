package clientes;

import dto.SalidaRecetaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(name = "ApiGestionReceta")
public interface ClienteGestionReceta {

    @PostMapping("/gestionReceta/grabar")
    SalidaRecetaDTO grabar(@RequestBody Map<String, Object> entrada);

    @GetMapping("/gestionReceta/buscar/{id}")
    SalidaRecetaDTO buscar(@PathVariable("id") Long id);
}
