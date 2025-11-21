package Clinica.ClinicaWeb.controller;

import clientes.*;
import dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class PortalController {

    // Inyección de Clientes Atómicos
    @Autowired private ClienteMedico clienteMedico;
    @Autowired private ClientePaciente clientePaciente;
    @Autowired private ClienteEspecialidad clienteEspecialidad;
    @Autowired private ClienteConsultorio clienteConsultorio;
    
    // Inyección de Clientes de Gestión (Orquestadores)
    @Autowired private ClienteGestionHorario clienteGestionHorario;

    // --- PÁGINA DE INICIO ---
    @GetMapping
    public String index() {
        return "index"; // Renderiza index.html
    }

    // ==========================================
    // SECCIÓN MÉDICOS
    // ==========================================
    @GetMapping("/medicos")
    public String listarMedicos(Model model) {
        List<MedicoDTO> medicos = clienteMedico.listar();
        List<EspecialidadDTO> especialidades = clienteEspecialidad.listar();
        
        model.addAttribute("medicos", medicos);
        model.addAttribute("especialidades", especialidades); // Para mostrar nombre en vez de ID si quisieras
        model.addAttribute("nuevoMedico", new MedicoDTO()); // Para el formulario
        
        return "medicos"; // Renderiza medicos.html
    }

    @PostMapping("/medicos/guardar")
    public String guardarMedico(@ModelAttribute MedicoDTO medico) {
        clienteMedico.grabar(medico);
        return "redirect:/medicos";
    }
    
    @GetMapping("/medicos/eliminar/{id}")
    public String eliminarMedico(@PathVariable Long id) {
        clienteMedico.eliminar(id);
        return "redirect:/medicos";
    }

    // ==========================================
    // SECCIÓN PACIENTES
    // ==========================================
    @GetMapping("/pacientes")
    public String listarPacientes(Model model) {
        model.addAttribute("pacientes", clientePaciente.listar());
        model.addAttribute("nuevoPaciente", new PacienteDTO());
        return "pacientes";
    }

    @PostMapping("/pacientes/guardar")
    public String guardarPaciente(@ModelAttribute PacienteDTO paciente) {
        // Asignar valores por defecto si es necesario
        if(paciente.getEst() == null) paciente.setEst("Activo");
        clientePaciente.grabar(paciente);
        return "redirect:/pacientes";
    }

    // ==========================================
    // SECCIÓN GESTIÓN HORARIOS (Complejo)
    // ==========================================
    @GetMapping("/horarios/nuevo")
    public String vistaNuevoHorario(Model model) {
        // Cargamos las listas para llenar los <select>
        model.addAttribute("medicos", clienteMedico.listar());
        model.addAttribute("consultorios", clienteConsultorio.listar());
        model.addAttribute("especialidades", clienteEspecialidad.listar());
        model.addAttribute("disponibilidades", new java.util.ArrayList<>()); // Aquí deberías cargar disponibilidades si tuvieras el endpoint listar
        
        model.addAttribute("entrada", new EntradaHorarioDTO());
        return "nuevo_horario";
    }

    @PostMapping("/horarios/procesar")
    public String procesarHorario(@ModelAttribute EntradaHorarioDTO entrada, Model model) {
        try {
            // Llamamos al microservicio orquestador
            SalidaHorarioDTO salida = clienteGestionHorario.procesarYGrabar(entrada);
            model.addAttribute("mensaje", "¡Horario generado con éxito! ID: " + salida.getId());
            model.addAttribute("slotsGenerados", salida.getLisSlo());
        } catch (Exception e) {
            model.addAttribute("error", "Error al procesar horario: " + e.getMessage());
        }
        
        // Recargamos listas para que el formulario no se rompa
        model.addAttribute("medicos", clienteMedico.listar());
        model.addAttribute("consultorios", clienteConsultorio.listar());
        model.addAttribute("especialidades", clienteEspecialidad.listar());
        model.addAttribute("entrada", new EntradaHorarioDTO());
        
        return "nuevo_horario";
    }
}