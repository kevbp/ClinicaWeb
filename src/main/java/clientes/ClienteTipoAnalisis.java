package clientes;

import dto.TipoAnalisisDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "ApiTipoAnalisis")
public interface ClienteTipoAnalisis {

    @GetMapping("/tipoAnalisis/listar")
    List<TipoAnalisisDTO> listar();
}
