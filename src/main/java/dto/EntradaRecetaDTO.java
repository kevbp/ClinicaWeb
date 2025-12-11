package dto;

public class EntradaRecetaDTO {

    private String fec;
    private String hor;
    private Long idMed;

    public EntradaRecetaDTO() {
    }

    public EntradaRecetaDTO(String fec, String hor, Long idMed) {
        this.fec = fec;
        this.hor = hor;
        this.idMed = idMed;
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

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }
}
