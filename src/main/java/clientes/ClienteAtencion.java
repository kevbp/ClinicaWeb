package clientes;

import dto.AtencionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

// Importante: El 'name' debe coincidir con el spring.application.name de ApiAtencion
@FeignClient(name = "ApiAtencion")
public interface ClienteAtencion {

    @GetMapping("/atencion/listar")
    List<AtencionDTO> listar();
}
