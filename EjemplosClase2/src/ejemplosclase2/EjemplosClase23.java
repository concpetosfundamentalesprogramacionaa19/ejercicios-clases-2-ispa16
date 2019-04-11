/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemplosClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre; 
        String apellido;
        int edad;
        String ciudad;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("porfavor ingrese sus nombres");
        nombre = entrada.nextLine();
        
        
        System.out.println("porfavor ingrese sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("porfavor ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); //limpieza del buffer de entrada de datos 
        System.out.println("porfavor ingrese el nombre de la ciudad donde reside ");
        ciudad = entrada.nextLine();
       /* 
       System.out.println ("sus nombres son " +nombre+"\n\n\t"
               + "sus apellidos son " +apellido +", edad: "+edad +"\n"+ "ciudad: "+ciudad);
       */
        System.out.printf("su nombre es %s\n\n\t Su apellido es %s, edad: %s "
                + "\n ciudad: %s",nombre,apellido,edad,ciudad);
    }
    
}
