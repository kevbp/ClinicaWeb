package dto;

public class SalidaAtencionDTO {

    private Long idAte;
    private String dgn;
    // Agrega más campos si deseas mostrar algo más en el mensaje de éxito

    public Long getIdAte() {
        return idAte;
    }

    public void setIdAte(Long idAte) {
        this.idAte = idAte;
    }

    public String getDgn() {
        return dgn;
    }

    public void setDgn(String dgn) {
        this.dgn = dgn;
    }
}
