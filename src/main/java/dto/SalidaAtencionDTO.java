package dto;

public class SalidaAtencionDTO {

    private Long idAte;
    private String fec;
    private String hor;
    private SalidaHistoriaDTO hisPac;
    private SalidaCitaDTO cit;
    private MedicoDTO med;
    private String dgn;
    private String trt;

    public SalidaAtencionDTO() {
    }

    public SalidaAtencionDTO(Long idAte, String fec, String hor, SalidaHistoriaDTO hisPac, SalidaCitaDTO cit, MedicoDTO med, String dgn, String trt) {
        this.idAte = idAte;
        this.fec = fec;
        this.hor = hor;
        this.hisPac = hisPac;
        this.cit = cit;
        this.med = med;
        this.dgn = dgn;
        this.trt = trt;
    }

    public Long getIdAte() {
        return idAte;
    }

    public void setIdAte(Long idAte) {
        this.idAte = idAte;
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

    public SalidaHistoriaDTO getHisPac() {
        return hisPac;
    }

    public void setHisPac(SalidaHistoriaDTO hisPac) {
        this.hisPac = hisPac;
    }

    public SalidaCitaDTO getCit() {
        return cit;
    }

    public void setCit(SalidaCitaDTO cit) {
        this.cit = cit;
    }

    public MedicoDTO getMed() {
        return med;
    }

    public void setMed(MedicoDTO med) {
        this.med = med;
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

}
