package clientes;

import dto.EntradaNuevaAtencionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ApiNuevaAtencion")
public interface ClienteNuevaAtencion {

    @PostMapping("/apiNuevaAtencion/nuevo")
    void iniciarAtencion(@RequestBody EntradaNuevaAtencionDTO entrada);
}
