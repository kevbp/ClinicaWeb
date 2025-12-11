/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author broncake
 */
public class LineaFichaAnalisisDTO {

    private Long idTipAna;
    private String nom;
    private String des;
    private double pre;
    private int can;

    public LineaFichaAnalisisDTO() {
    }

    public LineaFichaAnalisisDTO(Long idTipAna, String nom, String des, double pre, int can) {
        this.idTipAna = idTipAna;
        this.nom = nom;
        this.des = des;
        this.pre = pre;
        this.can = can;
    }

    public Long getIdTipAna() {
        return idTipAna;
    }

    public void setIdTipAna(Long idTipAna) {
        this.idTipAna = idTipAna;
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
        return pre * can;
    }
}
