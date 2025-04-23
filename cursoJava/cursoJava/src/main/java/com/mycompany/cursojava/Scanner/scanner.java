package com.mycompany.cursojava.Scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //Introducir por consola.
        var consola = new Scanner (System.in); // in - input - enrada de datos
        System.out.print("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre ="+nombre);
        
        
    }
}
