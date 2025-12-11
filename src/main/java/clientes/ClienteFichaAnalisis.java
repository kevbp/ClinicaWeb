package clientes;

import dto.FichaAnalisisResumenDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "ApiFichaAnalisis")
public interface ClienteFichaAnalisis {

    @GetMapping("/fichaAnalisis/listar")
    List<FichaAnalisisResumenDTO> listar();
}
