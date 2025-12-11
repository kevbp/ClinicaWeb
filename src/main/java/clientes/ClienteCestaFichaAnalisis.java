package clientes;

import dto.LineaFichaAnalisisDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@FeignClient(name = "ApiCestaFichaAnalisis")
public interface ClienteCestaFichaAnalisis {

    @PostMapping("/apiCestaFichaAnalisis/agregar")
    void agregar(@RequestBody LineaFichaAnalisisDTO linea);

    @DeleteMapping("/apiCestaFichaAnalisis/quitar/{id}")
    void quitar(@PathVariable("id") Long id);

    @GetMapping("/apiCestaFichaAnalisis/verCesta")
    List<LineaFichaAnalisisDTO> verCesta();

    @GetMapping("/apiCestaFichaAnalisis/verTotal")
    Double verTotal();

    @DeleteMapping("/apiCestaFichaAnalisis/nuevaCesta")
    void nuevaCesta();
}
