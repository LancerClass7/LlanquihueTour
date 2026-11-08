/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mapache
 */
public class Direccion {
    private String calle; // 
    private int numero; // 
    private String comuna; //
    private String region;

    public Direccion() {
    }

    public Direccion(String calle, int numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle = " + calle + ", numero = " + numero + ", comuna = " + comuna + ", region = " + region + '}';
    }
    
    
  
    
    
    
    
}
