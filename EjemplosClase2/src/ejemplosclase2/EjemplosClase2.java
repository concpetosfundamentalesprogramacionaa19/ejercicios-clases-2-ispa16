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
public class EjemplosClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre; 
        String apellido;
        Scanner entrada = new Scanner (System.in);
        System.out.println("porfavor ingrese su nombre");
        nombre = entrada.next();
        System.out.println("porfavor ingrese su apellido");
        apellido = entrada.next();
        
       System.out.println ("su nombre es " +nombre+"\n\n\t"
               + "su apellido es " +apellido);
       
    }
    
}
