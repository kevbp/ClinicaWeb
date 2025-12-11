package clientes;

import dto.SalidaFichaAnalisisDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(name = "ApiGestionFichaAnalisis")
public interface ClienteGestionFichaAnalisis {

    @PostMapping("/gestionFichaAnalisis/grabar")
    SalidaFichaAnalisisDTO grabar(@RequestBody Map<String, Object> entrada);

    @GetMapping("/gestionFichaAnalisis/buscar/{id}")
    SalidaFichaAnalisisDTO buscar(@PathVariable("id") Long id);
}
