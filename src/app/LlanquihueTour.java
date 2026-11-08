/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import model.*;


        

/**
 *
 * @author Mapache
 */
public class LlanquihueTour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Base de datos - Turismo Llanquigue Tour");
        System.out.println("-------------------------------------\n");
        
        Direccion direccion1=new Direccion ("Francisco colane",4398,"Calbuco","Los lagos");
        Direccion direccion2=new Direccion ("Santa Corina",101,"Frutillar","Los lagos");
        Direccion direccion3=new Direccion ("Avenida siempre viva",123,"Cochamo","Los lagos");
        
        Persona persona1=new Persona("12.333.444-8","Cosme Fulatino","asdf@gmail.com","97026185", direccion1);
 
        
        Empleado empleado1=new Empleado ("13.444.555-6","Armando Barrera","qwerty@gmail.com","985426832",direccion2,"guia turistico","terreno");
        Empleado empleado2=new Empleado ("14.555.666-7","Roberto Guillermo","ultramar@gmail.com","99741747",direccion3,"Proveedor de alojamiento","operaciones");

        
     // Despliegue de resultados por consola utilizando System.out.println() y toString()
        System.out.println(" REGISTRO #1: CONTACTO CLIENTE ");
        System.out.println(persona1.toString());

        System.out.println("\n REGISTRO #2: EMPLEADO 1 ");
        System.out.println(empleado1.toString());

        System.out.println("\n REGISTRO #3: EMPLEADO 2");
        System.out.println(empleado2.toString());

     

        System.out.println("\n=================================================================");
        System.out.println("Ejecucion finalizada con exito.");
    }
    
}
