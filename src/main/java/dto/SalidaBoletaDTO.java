package dto;

public class SalidaBoletaDTO {

    private Long id;
    private String fec;
    private String hor;
    private CitaDTO cit;
    private PacienteDTO pac;
    private EmpleadoDTO emp;
    private double preTot;

    public SalidaBoletaDTO() {
    }

    public SalidaBoletaDTO(Long id, String fec, String hor, CitaDTO cit, PacienteDTO pac, EmpleadoDTO emp, double preTot) {
        this.id = id;
        this.fec = fec;
        this.hor = hor;
        this.cit = cit;
        this.pac = pac;
        this.emp = emp;
        this.preTot = preTot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHor() {
        return hor;
    }

    public void setHor(String hor) {
        this.hor = hor;
    }

    public CitaDTO getCit() {
        return cit;
    }

    public void setCit(CitaDTO cit) {
        this.cit = cit;
    }

    public PacienteDTO getPac() {
        return pac;
    }

    public void setPac(PacienteDTO pac) {
        this.pac = pac;
    }

    public EmpleadoDTO getEmp() {
        return emp;
    }

    public void setEmp(EmpleadoDTO emp) {
        this.emp = emp;
    }

    public double getPreTot() {
        return preTot;
    }

    public void setPreTot(double preTot) {
        this.preTot = preTot;
    }

    
}
