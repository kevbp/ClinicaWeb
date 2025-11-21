package clientes;

import dto.HistoriaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiHistoria")
public interface ClienteHistoria {

    @GetMapping("/historia/listar")
    List<HistoriaDTO> listar();

    @GetMapping("/historia/buscar/{id}")
    HistoriaDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/historia/grabar")
    HistoriaDTO grabar(@RequestBody HistoriaDTO historia);
}