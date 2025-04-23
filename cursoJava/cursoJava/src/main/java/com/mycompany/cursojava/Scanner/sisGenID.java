package com.mycompany.cursojava.Scanner;
import java.util.Scanner;
import java.util.Random;

public class sisGenID {
    public static void main(String[] args) {
        //Declaro objetos, tanto scanner como random.
        var consola = new Scanner (System.in);
        var random = new Random();
        //nombre
        System.out.print("Ingrese nombre: ");
        var nombre = consola.nextLine();
        
        //apellido
        System.out.print("Ingrese apellido: ");
        var apellido = consola.nextLine();
        
        //Fecha navimiendo
        System.out.print("Ingrese fecha de nacimiento: ");
        var nacimiento = consola.nextLine();
        
        //numero aleatorio
        var aleatorio = random.nextInt(9999)+1;
        //concateno coracteres
        var id=nombre.substring(0,2)+apellido.substring(0,2)+nacimiento.substring(2);
        id = id.toUpperCase().trim();
        System.out.println("id="+id);
        System.out.printf(
                """
                Bienvenido Juan,
                \tTu nuevo numero de identificacion (ID) generado por el sistema es:
                \t%s%04d
                \t Felicidades!
                """,id,aleatorio);
        
    
       
    
    
    
    
    }
}
