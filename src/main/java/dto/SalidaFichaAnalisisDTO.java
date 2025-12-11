package dto;

import java.util.List;

public class SalidaFichaAnalisisDTO {

    private Long id;
    private String fec;
    private String hor;
    private SalidaAtencionDTO ate;
    private List<DetalleFichaAnalisisDTO> detFic; // Ojo al nombre
    private MedicoDTO med;
    private double tot;

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

    public SalidaAtencionDTO getAte() {
        return ate;
    }

    public void setAte(SalidaAtencionDTO ate) {
        this.ate = ate;
    }

    public List<DetalleFichaAnalisisDTO> getDetFic() {
        return detFic;
    }

    public void setDetFic(List<DetalleFichaAnalisisDTO> detFic) {
        this.detFic = detFic;
    }

    public MedicoDTO getMed() {
        return med;
    }

    public void setMed(MedicoDTO med) {
        this.med = med;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }
}
