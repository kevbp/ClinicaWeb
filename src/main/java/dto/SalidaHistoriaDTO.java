
package dto;

public class SalidaHistoriaDTO {
    private Long idHis;
    private String fecCre;
    private String horCre;
    private PacienteDTO pac;
    private EmpleadoDTO emp;

    public SalidaHistoriaDTO() {
    }

    public SalidaHistoriaDTO(Long idHis, String fecCre, String horCre, PacienteDTO pac, EmpleadoDTO emp) {
        this.idHis = idHis;
        this.fecCre = fecCre;
        this.horCre = horCre;
        this.pac = pac;
        this.emp = emp;
    }

    public Long getIdHis() {
        return idHis;
    }

    public void setIdHis(Long idHis) {
        this.idHis = idHis;
    }

    public String getFecCre() {
        return fecCre;
    }

    public void setFecCre(String fecCre) {
        this.fecCre = fecCre;
    }

    public String getHorCre() {
        return horCre;
    }

    public void setHorCre(String horCre) {
        this.horCre = horCre;
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
    
    
}
