package dto;

public class RecetaResumenDTO {

    private Long id;
    private String fec;
    private String hor;
    private Long idAte;
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

    public Long getIdAte() {
        return idAte;
    }

    public void setIdAte(Long idAte) {
        this.idAte = idAte;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }
}
