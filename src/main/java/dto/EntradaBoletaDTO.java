package dto;

public class EntradaBoletaDTO {

    private Long idCit;
    private Long idPac;
    private Long idEmp;

    public EntradaBoletaDTO() {
    }

    public EntradaBoletaDTO(Long idCit, Long idPac, Long idEmp) {
        this.idCit = idCit;
        this.idPac = idPac;
        this.idEmp = idEmp;
    }

    public Long getIdCit() {
        return idCit;
    }

    public void setIdCit(Long idCit) {
        this.idCit = idCit;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

}
