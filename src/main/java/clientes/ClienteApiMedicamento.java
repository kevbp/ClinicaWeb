package clientes;

import dto.MedicamentoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "ApiMedicamento")
public interface ClienteApiMedicamento {

    @GetMapping("/medicamento/listar")
    List<MedicamentoDTO> listar();

    @PostMapping("/medicamento/grabar")
    MedicamentoDTO grabar(@RequestBody MedicamentoDTO medicamento);

    @DeleteMapping("/medicamento/eliminar/{id}")
    void eliminar(@PathVariable("id") Long id);
}
