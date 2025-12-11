package clientes;

import dto.EntradaAtencionDTO;
import dto.SalidaAtencionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ApiGestionAtencion")
public interface ClienteGestionAtencion {

    @PostMapping("/apiGestionAtencion/procesarYGrabar")
    SalidaAtencionDTO guardarAtencion(@RequestBody EntradaAtencionDTO entrada);
}
