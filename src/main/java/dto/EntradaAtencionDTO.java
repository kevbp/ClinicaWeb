package dto;

public class EntradaAtencionDTO {

    private String fec;
    private String hor;
    private String dgn;
    private String trt;
    private Long idMed;

    // Getters y Setters
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

    public String getDgn() {
        return dgn;
    }

    public void setDgn(String dgn) {
        this.dgn = dgn;
    }

    public String getTrt() {
        return trt;
    }

    public void setTrt(String trt) {
        this.trt = trt;
    }

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }
}
