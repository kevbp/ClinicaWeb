package Clinica.ClinicaWeb.controller;

import clientes.*;
import dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class PortalController {

    // --- CLIENTES ---
    @Autowired
    private ClienteMedico clienteMedico;
    @Autowired
    private ClientePaciente clientePaciente;
    @Autowired
    private ClienteEspecialidad clienteEspecialidad;
    @Autowired
    private ClienteConsultorio clienteConsultorio;
    @Autowired
    private ClienteEmpleado clienteEmpleado;
    @Autowired
    private ClienteDisponibilidad clienteDisponibilidad;
    @Autowired
    private ClienteSlotHorario clienteSlotHorario;
    @Autowired
    private ClienteHorario clienteHorario;
    @Autowired
    private ClienteCita clienteCita;
    @Autowired
    private ClienteHistoria clienteHistoria;
    @Autowired
    private ClienteBoleta clienteBoleta;

    // --- ORQUESTADORES ---
    @Autowired
    private ClienteGestionHorario clienteGestionHorario;
    @Autowired
    private ClienteGestionCita clienteGestionCita;
    @Autowired
    private ClienteGestionHistoria clienteGestionHistoria;
    @Autowired
    private ClienteGestionBoleta clienteGestionBoleta;

    // ==========================================
    // HOME
    // ==========================================
    @GetMapping
    public String index(Model model) {
        model.addAttribute("activeLink", "home");
        return "index";
    }

    // ==========================================
    // LISTADOS GENERALES (NUEVO REQUERIMIENTO)
    // ==========================================
    // 1. LISTAR CITAS
    @GetMapping("/citas")
    public String listarCitas(Model model) {
        model.addAttribute("activeLink", "citas");
        model.addAttribute("citas", clienteCita.listar());
        return "citas_listado"; // Nueva vista
    }

    // 2. LISTAR BOLETAS (PAGOS)
    @GetMapping("/boletas")
    public String listarBoletas(Model model) {
        model.addAttribute("activeLink", "boletas");
        model.addAttribute("boletas", clienteBoleta.listar());
        return "boletas_listado"; // Nueva vista
    }

    // 3. LISTAR HORARIOS Y SUS SLOTS (MAESTRO-DETALLE)
    @GetMapping("/horarios")
    public String listarHorarios(Model model) {
        model.addAttribute("activeLink", "horarios");
        model.addAttribute("horarios", clienteHorario.listar());
        // Inicialmente no mostramos slots, el usuario debe seleccionar uno
        return "horarios_listado";
    }

    @GetMapping("/horarios/{id}/detalle")
    public String verDetalleHorario(@PathVariable Long id, Model model) {
        model.addAttribute("activeLink", "horarios");

        // Cargar lista completa para la barra lateral o tabla principal
        model.addAttribute("horarios", clienteHorario.listar());

        // Cargar el horario seleccionado y sus slots
        HorarioDTO horario = clienteHorario.buscar(id);
        List<SlotHorarioDTO> slots = clienteSlotHorario.listarPorHorario(id);

        model.addAttribute("horarioSeleccionado", horario);
        model.addAttribute("slotsDelHorario", slots);

        return "horarios_listado"; // Reutilizamos la misma vista
    }

    // ==========================================
    // MÓDULOS DE GESTIÓN (YA EXISTENTES)
    // ==========================================
    @GetMapping("/medicos")
    public String listarMedicos(Model model) {
        model.addAttribute("activeLink", "medicos");
        model.addAttribute("medicos", clienteMedico.listar());
        model.addAttribute("especialidades", clienteEspecialidad.listar());
        model.addAttribute("nuevoMedico", new MedicoDTO());
        return "medicos";
    }

    @PostMapping("/medicos/guardar")
    public String guardarMedico(@ModelAttribute MedicoDTO m) {
        clienteMedico.grabar(m);
        return "redirect:/medicos";
    }

    @GetMapping("/medicos/eliminar/{id}")
    public String eliminarMedico(@PathVariable Long id) {
        clienteMedico.eliminar(id);
        return "redirect:/medicos";
    }

    @GetMapping("/pacientes")
    public String listarPacientes(Model model) {
        model.addAttribute("activeLink", "pacientes");
        model.addAttribute("pacientes", clientePaciente.listar());
        model.addAttribute("empleados", clienteEmpleado.listar());
        model.addAttribute("nuevoPaciente", new PacienteDTO());
        return "pacientes";
    }

    @PostMapping("/pacientes/guardar")
    public String guardarPaciente(@ModelAttribute PacienteDTO p) {
        if (p.getEst() == null) {
            p.setEst("Activo");
        }
        clientePaciente.grabar(p);
        return "redirect:/pacientes";
    }

    @GetMapping("/empleados")
    public String listarEmpleados(Model model) {
        model.addAttribute("activeLink", "empleados");
        model.addAttribute("empleados", clienteEmpleado.listar());
        model.addAttribute("nuevoEmpleado", new EmpleadoDTO());
        return "empleados";
    }

    @PostMapping("/empleados/guardar")
    public String guardarEmpleado(@ModelAttribute EmpleadoDTO e) {
        clienteEmpleado.grabar(e);
        return "redirect:/empleados";
    }

    @GetMapping("/empleados/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable Long id) {
        clienteEmpleado.eliminar(id);
        return "redirect:/empleados";
    }

    @GetMapping("/especialidades")
    public String listarEspecialidades(Model model) {
        model.addAttribute("activeLink", "config");
        model.addAttribute("especialidades", clienteEspecialidad.listar());
        model.addAttribute("nuevaEspecialidad", new EspecialidadDTO());
        return "especialidades";
    }

    @PostMapping("/especialidades/guardar")
    public String guardarEspecialidad(@ModelAttribute EspecialidadDTO e) {
        clienteEspecialidad.grabar(e);
        return "redirect:/especialidades";
    }

    @GetMapping("/consultorios")
    public String listarConsultorios(Model model) {
        model.addAttribute("activeLink", "config");
        model.addAttribute("consultorios", clienteConsultorio.listar());
        model.addAttribute("nuevoConsultorio", new ConsultorioDTO());
        return "consultorios";
    }

    @PostMapping("/consultorios/guardar")
    public String guardarConsultorio(@ModelAttribute ConsultorioDTO c) {
        if (c.getEst() == null) {
            c.setEst("Activo");
        }
        clienteConsultorio.grabar(c);
        return "redirect:/consultorios";
    }

    @GetMapping("/disponibilidad")
    public String listarDisponibilidad(Model model) {
        model.addAttribute("activeLink", "procesos");
        model.addAttribute("disponibilidades", clienteDisponibilidad.listar());
        model.addAttribute("medicos", clienteMedico.listar());
        model.addAttribute("especialidades", clienteEspecialidad.listar());
        model.addAttribute("nuevaDisp", new DisponibilidadDTO());
        return "disponibilidad";
    }

    @PostMapping("/disponibilidad/guardar")
    public String guardarDisponibilidad(@ModelAttribute DisponibilidadDTO d) {
        if (d.getEst() == null) {
            d.setEst("Disponible");
        }
        clienteDisponibilidad.grabar(d);
        return "redirect:/disponibilidad";
    }

    @GetMapping("/disponibilidad/eliminar/{id}")
    public String eliminarDisponibilidad(@PathVariable Long id) {
        clienteDisponibilidad.eliminar(id);
        return "redirect:/disponibilidad";
    }

    @GetMapping("/horarios/nuevo")
    public String vistaNuevoHorario(Model model) {
        model.addAttribute("activeLink", "horarios");
        model.addAttribute("medicos", clienteMedico.listar());
        model.addAttribute("consultorios", clienteConsultorio.listar());
        model.addAttribute("especialidades", clienteEspecialidad.listar());
        model.addAttribute("empleados", clienteEmpleado.listar());
        model.addAttribute("disponibilidades", clienteDisponibilidad.listar());
        model.addAttribute("entrada", new EntradaHorarioDTO());
        return "nuevo_horario";
    }

    @PostMapping("/horarios/procesar")
    public String procesarHorario(@ModelAttribute EntradaHorarioDTO entrada, Model model) {
        model.addAttribute("activeLink", "horarios");
        try {
            SalidaHorarioDTO salida = clienteGestionHorario.procesarYGrabar(entrada);
            model.addAttribute("mensaje", "Horario generado. ID: " + salida.getId());
            model.addAttribute("slotsGenerados", salida.getLisSlo());
        } catch (Exception e) {
            model.addAttribute("error", "Error: " + e.getMessage());
        }
        model.addAttribute("medicos", clienteMedico.listar());
        model.addAttribute("consultorios", clienteConsultorio.listar());
        model.addAttribute("especialidades", clienteEspecialidad.listar());
        model.addAttribute("empleados", clienteEmpleado.listar());
        model.addAttribute("disponibilidades", clienteDisponibilidad.listar());
        model.addAttribute("entrada", new EntradaHorarioDTO());
        return "nuevo_horario";
    }

    @GetMapping("/historias")
    public String listarHistorias(Model model) {
        model.addAttribute("activeLink", "historias");
        model.addAttribute("historias", clienteHistoria.listar());
        return "historias";
    }

    @GetMapping("/historias/nueva")
    public String vistaNuevaHistoria(Model model) {
        model.addAttribute("activeLink", "historias");
        model.addAttribute("empleados", clienteEmpleado.listar());
        model.addAttribute("entradaHistoria", new EntradaHistoriaDTO());
        return "nueva_historia";
    }

    @PostMapping("/historias/procesar")
    public String procesarHistoria(@ModelAttribute EntradaHistoriaDTO entrada, Model model) {
        model.addAttribute("activeLink", "historias");
        try {
            SalidaHistoriaDTO salida = clienteGestionHistoria.procesarYGrabar(entrada);
            model.addAttribute("mensaje", "Historia creada con éxito. Nro: " + salida.getIdHis());
            model.addAttribute("historiaCreada", salida);
        } catch (Exception e) {
            model.addAttribute("error", "Error: " + e.getMessage());
        }
        model.addAttribute("empleados", clienteEmpleado.listar());
        model.addAttribute("entradaHistoria", new EntradaHistoriaDTO());
        return "nueva_historia";
    }

    @GetMapping("/citas/nueva")
    public String vistaNuevaCita(Model model) {
        model.addAttribute("activeLink", "citas");
        model.addAttribute("pacientes", clientePaciente.listar());
        model.addAttribute("empleados", clienteEmpleado.listar());
        List<SlotHorarioDTO> todosSlots = clienteSlotHorario.listar();
        List<SlotHorarioDTO> slotsDisponibles = todosSlots.stream()
                .filter(s -> "Disponible".equalsIgnoreCase(s.getEst()))
                .collect(Collectors.toList());
        model.addAttribute("slots", slotsDisponibles);
        model.addAttribute("entradaCita", new EntradaCitaDTO());
        return "citas";
    }

    @PostMapping("/citas/guardar")
    public String guardarCita(@ModelAttribute EntradaCitaDTO entrada, Model model) {
        model.addAttribute("activeLink", "citas");
        try {
            SalidaCitaDTO salida = clienteGestionCita.procesarYGrabar(entrada);
            model.addAttribute("mensaje", "Cita reservada. Ticket: " + salida.getId());
        } catch (Exception e) {
            model.addAttribute("error", "Error: " + e.getMessage());
        }
        return vistaNuevaCita(model);
    }

    @GetMapping("/boletas/nueva")
    public String vistaNuevaBoleta(Model model) {
        model.addAttribute("activeLink", "boletas");
        List<CitaDTO> todasCitas = clienteCita.listar();
        List<CitaDTO> citasPendientes = todasCitas.stream()
                .filter(c -> "Pendiente".equalsIgnoreCase(c.getEstPag()) && "Activo".equalsIgnoreCase(c.getEstCit()))
                .collect(Collectors.toList());
        model.addAttribute("citasPendientes", citasPendientes);
        model.addAttribute("empleados", clienteEmpleado.listar());
        model.addAttribute("entradaBoleta", new EntradaBoletaDTO());
        return "boletas";
    }

    @PostMapping("/boletas/procesar")
    public String procesarBoleta(@ModelAttribute EntradaBoletaDTO entrada, Model model) {
        model.addAttribute("activeLink", "boletas");
        try {
            SalidaBoletaDTO salida = clienteGestionBoleta.procesarYGrabar(entrada);
            model.addAttribute("mensaje", "Pago exitoso. Boleta Nro: " + salida.getId() + " | Total: " + salida.getPreTot());
            model.addAttribute("boletaGenerada", salida);
        } catch (Exception e) {
            model.addAttribute("error", "Error al generar boleta: " + e.getMessage());
        }
        return vistaNuevaBoleta(model);
    }

    @GetMapping("/reportes")
    public String verReportes(Model model) {
        model.addAttribute("activeLink", "reportes");
        model.addAttribute("listaCitas", clienteCita.listar());
        model.addAttribute("listaHistorias", clienteHistoria.listar());
        model.addAttribute("listaBoletas", clienteBoleta.listar());
        model.addAttribute("listaHorarios", clienteHorario.listar());
        return "reportes";
    }
}
