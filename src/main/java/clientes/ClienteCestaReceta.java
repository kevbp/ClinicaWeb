package clientes;

import dto.LineaRecetaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@FeignClient(name = "ApiCestaReceta")
public interface ClienteCestaReceta {

    @PostMapping("/apiCestaReceta/agregar")
    void agregar(@RequestBody LineaRecetaDTO linea);

    @DeleteMapping("/apiCestaReceta/quitar/{id}")
    void quitar(@PathVariable("id") Long id);

    @GetMapping("/apiCestaReceta/verCesta")
    List<LineaRecetaDTO> verCesta();

    @GetMapping("/apiCestaReceta/verTotal")
    Double verTotal();

    @DeleteMapping("/apiCestaReceta/nuevaCesta")
    void nuevaCesta();
}
