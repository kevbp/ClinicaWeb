package clientes;

import dto.TipoAnalisisDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiTipoAnalisis")
public interface ClienteTipoAnalisis {

    @GetMapping("/tipoAnalisis/listar")
    List<TipoAnalisisDTO> listar();

    @PostMapping("/tipoAnalisis/grabar")
    TipoAnalisisDTO grabar(@RequestBody TipoAnalisisDTO tipo);

    @DeleteMapping("/tipoAnalisis/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}
