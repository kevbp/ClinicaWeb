package dto;

public class LineaRecetaDTO {

    private Long idMto;
    private String nom;
    private String des;
    private double pre;
    private int can;
    private double importe;

    public LineaRecetaDTO() {
    }

    public LineaRecetaDTO(Long idMto, String nom, String des, double pre, int can) {
        this.idMto = idMto;
        this.nom = nom;
        this.des = des;
        this.pre = pre;
        this.can = can;
        this.importe = pre * can;
    }

    public Long getIdMto() {
        return idMto;
    }

    public void setIdMto(Long idMto) {
        this.idMto = idMto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
