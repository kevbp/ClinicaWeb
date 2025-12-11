package dto;

public class DetalleRecetaDTO {

    private Long id;
    private Long idRec;
    private Long idMto;
    private String nomMto;
    private String desMto;
    private double pre;
    private int can;
    private double imp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRec() {
        return idRec;
    }

    public void setIdRec(Long idRec) {
        this.idRec = idRec;
    }

    public Long getIdMto() {
        return idMto;
    }

    public void setIdMto(Long idMto) {
        this.idMto = idMto;
    }

    public String getNomMto() {
        return nomMto;
    }

    public void setNomMto(String nomMto) {
        this.nomMto = nomMto;
    }

    public String getDesMto() {
        return desMto;
    }

    public void setDesMto(String desMto) {
        this.desMto = desMto;
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

    public double getImp() {
        return imp;
    }

    public void setImp(double imp) {
        this.imp = imp;
    }
}
