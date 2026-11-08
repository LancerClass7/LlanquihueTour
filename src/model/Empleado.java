/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mapache
 */
public class Empleado extends Persona{
        private String cargo;
        private String area;

    public Empleado() {
    }

    public Empleado(String cargo, String area) {
        this.cargo = cargo;
        this.area = area;
    }

    public Empleado(String rut, String nombre, String correo, String telefono, Direccion direccion, String cargo, String area) {
        super(rut, nombre, correo, telefono, direccion);
        this.cargo = cargo;
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString()+ "cargo = " + cargo + ", area = " + area + '}';
    }


    
    }

    

   
        
                

