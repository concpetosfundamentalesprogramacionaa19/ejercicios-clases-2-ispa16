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
public class EjemplosClase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre; 
        String apellido;
        Scanner entrada = new Scanner (System.in);
        System.out.println("porfavor ingrese sus nombres");
        nombre = entrada.nextLine();
        
        
        System.out.println("porfavor ingrese sus apellidos");
        apellido = entrada.nextLine();
        
       System.out.println ("sus nombres son " +nombre+"\n\n\t"
               + "sus apellidos son " +apellido);
       
    }
    
}
