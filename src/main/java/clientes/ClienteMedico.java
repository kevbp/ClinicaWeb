package clientes;

import dto.MedicoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiMedico")
public interface ClienteMedico {
    
    @GetMapping("/medico/listar")
    List<MedicoDTO> listar();

    @GetMapping("/medico/buscar/{id}")
    MedicoDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/medico/grabar")
    MedicoDTO grabar(@RequestBody MedicoDTO medico);

    @PutMapping("/medico/actualizar/{id}")
    MedicoDTO actualizar(@PathVariable("id") Long id, @RequestBody MedicoDTO medico);

    @DeleteMapping("/medico/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}