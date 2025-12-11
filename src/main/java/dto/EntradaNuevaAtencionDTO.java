package dto;

public class EntradaNuevaAtencionDTO {

    private Long idCita;

    public EntradaNuevaAtencionDTO() {
    }

    public EntradaNuevaAtencionDTO(Long idCita) {
        this.idCita = idCita;
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }
}
