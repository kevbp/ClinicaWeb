package dto;

public class DisponibilidadDTO {

    private Long id;
    private Long idMed;
    private Long idEsp;
    private String fec;    // Cambiado a String para evitar error 400 en formulario
    private String horIni; // Cambiado a String
    private String horFin; // Cambiado a String
    private String est;

    public DisponibilidadDTO() {
    }

    public DisponibilidadDTO(Long id, Long idMed, Long idEsp, String fec, String horIni, String horFin, String est) {
        this.id = id;
        this.idMed = idMed;
        this.idEsp = idEsp;
        this.fec = fec;
        this.horIni = horIni;
        this.horFin = horFin;
        this.est = est;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }

    public Long getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(Long idEsp) {
        this.idEsp = idEsp;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHorIni() {
        return horIni;
    }

    public void setHorIni(String horIni) {
        this.horIni = horIni;
    }

    public String getHorFin() {
        return horFin;
    }

    public void setHorFin(String horFin) {
        this.horFin = horFin;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }
}
