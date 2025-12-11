package clientes;

import dto.RecetaResumenDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "ApiReceta")
public interface ClienteReceta {

    @GetMapping("/receta/listar")
    List<RecetaResumenDTO> listar();
}
