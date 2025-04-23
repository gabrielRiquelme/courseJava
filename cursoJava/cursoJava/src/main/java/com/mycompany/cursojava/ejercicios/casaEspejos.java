
package com.mycompany.cursojava.ejercicios;

import java.util.Scanner;

public class casaEspejos {
    public static void main(String[] args) {
        System.out.println("Casa de los espejos");
        var consola = new Scanner(System.in);
         
        System.out.print("Cual es tu edad?");
        var edad = Integer.parseInt(consola.nextLine());
        
        System.out.print("Tienes miedo a la oscuridad? (true/false) ");
        var miedo = Boolean.parseBoolean(consola.nextLine());
    
        if (edad >= 10 && !miedo){
            System.out.println("Usted puede ingresar");
        }else{
            System.out.println("No puede ingresar es menor o le tiene miedo a la oscuridad");
        }
    
    }
}
