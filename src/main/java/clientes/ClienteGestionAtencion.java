package clientes;

import dto.EntradaAtencionDTO;
import dto.SalidaAtencionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping; // <--- Importar esto
import org.springframework.web.bind.annotation.PathVariable; // <--- Importar esto
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ApiGestionAtencion")
public interface ClienteGestionAtencion {

    @PostMapping("/apiGestionAtencion/procesarYGrabar")
    SalidaAtencionDTO guardarAtencion(@RequestBody EntradaAtencionDTO entrada);

    // NUEVO MÉTODO AGREGADO
    // Permite obtener los datos completos (Paciente, Médico, Cita) de una atención
    @GetMapping("/apiGestionAtencion/buscar/{id}")
    SalidaAtencionDTO buscar(@PathVariable("id") Long id);
}
