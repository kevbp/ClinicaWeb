package clientes;

import dto.MedicamentoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "ApiMedicamento")
public interface ClienteApiMedicamento {

    @GetMapping("/medicamento/listar")
    List<MedicamentoDTO> listar();
}
