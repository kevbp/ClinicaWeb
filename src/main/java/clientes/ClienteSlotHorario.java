package clientes;

import dto.SlotHorarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiSlotHorario")
public interface ClienteSlotHorario {

    @GetMapping("/slotHorario/listar")
    List<SlotHorarioDTO> listar();
    
    @GetMapping("/slotHorario/listarPorHorario/{idHor}")
    List<SlotHorarioDTO> listarPorHorario(@PathVariable("idHor") Long idHor);

    @GetMapping("/slotHorario/buscar/{id}")
    SlotHorarioDTO buscar(@PathVariable("id") Long id);

    @PostMapping("/slotHorario/grabar")
    SlotHorarioDTO grabar(@RequestBody SlotHorarioDTO slot);
}