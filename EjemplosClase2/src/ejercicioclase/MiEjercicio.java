/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

        
/**
 *
 * @author Salas
 */
public class MiEjercicio {
    public static void main(String[] args) {
    
        String nombre;
    String apellido;
    Scanner entrada = new Scanner (System.in);
    int edad;
    String ciudad;
    String pais;
    int nota1;
    int nota2;
    double promedio;
    
    System.out.println("ingrese los nombres");
    nombre = entrada.nextLine();
    
    System.out.println("ingrese los apellidos");
    apellido = entrada.nextLine();
    
    System.out.println("ingrese la edad");
    edad = entrada.nextInt();
    entrada.nextLine();
    
   
    System.out.println("ingrese la ciudad");
    ciudad = entrada.nextLine();
    
    System.out.println("ingrese el pais");
    pais = entrada.nextLine();
    
    System.out.println("ingrese la nota 1");
    nota1 = entrada.nextInt();
    
    System.out.println("ingrese la nota 2");
    nota2 = entrada.nextInt();
    entrada.nextLine();
    
    promedio = (nota1 + nota2)/2;
    
    System.out.printf("Su nombres y apellidos: %s %s \nEdad: %s \nCiudad: %s "
            + "\nPais: %s \nNotas: %s, %s \nPromedio: %s",nombre, apellido,edad,
            ciudad,pais,nota1,nota2,promedio);
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
