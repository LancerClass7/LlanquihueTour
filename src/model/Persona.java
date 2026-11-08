/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mapache
 */
public class Persona {
    private String rut;
    private String nombre;
    private String correo;
    private String telefono;
    
    // relacion de compacicion, llama a la clase licencia
    private Direccion direccion; 

    public Persona() {
    }

    public Persona(String rut, String nombre, String correo, String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut = " + rut + ", nombre = " + nombre + ", correo = " + correo + ", telefono = " + telefono + ", direccion = " + direccion + '}';
    }

   
}