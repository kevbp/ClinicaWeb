/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

public class DetalleFichaAnalisisDTO {

    private Long id;
    private Long idFicAna;
    private Long idTipAna;
    private String nomFicAna;
    private String desFicAna;
    private double pre;
    private int can;
    private double imp;

    public DetalleFichaAnalisisDTO() {
    }

    public DetalleFichaAnalisisDTO(Long id, Long idFicAna, Long idTipAna, String nomFicAna, String desFicAna, double pre, int can, double imp) {
        this.id = id;
        this.idFicAna = idFicAna;
        this.idTipAna = idTipAna;
        this.nomFicAna = nomFicAna;
        this.desFicAna = desFicAna;
        this.pre = pre;
        this.can = can;
        this.imp = imp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFicAna() {
        return idFicAna;
    }

    public void setIdFicAna(Long idFicAna) {
        this.idFicAna = idFicAna;
    }

    public Long getIdTipAna() {
        return idTipAna;
    }

    public void setIdTipAna(Long idTipAna) {
        this.idTipAna = idTipAna;
    }

    public String getNomFicAna() {
        return nomFicAna;
    }

    public void setNomFicAna(String nomFicAna) {
        this.nomFicAna = nomFicAna;
    }

    public String getDesFicAna() {
        return desFicAna;
    }

    public void setDesFicAna(String desFicAna) {
        this.desFicAna = desFicAna;
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
