package dto;

public class SalidaNuevaRecetaDTO {

    private SalidaAtencionDTO ate; // Usa tu DTO de atención existente

    public SalidaAtencionDTO getAte() {
        return ate;
    }

    public void setAte(SalidaAtencionDTO ate) {
        this.ate = ate;
    }
}
