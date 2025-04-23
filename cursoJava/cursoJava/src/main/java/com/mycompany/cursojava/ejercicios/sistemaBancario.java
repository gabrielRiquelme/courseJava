package com.mycompany.cursojava.ejercicios;

import java.util.Scanner;

public class sistemaBancario {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema Bancario");
        var consola = new Scanner(System.in);
        
        System.out.print("Deseas salir del sistema? (true/false) ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());
    
        if(!salirSistema){
            System.out.print("Continuamos dentro del sistema...");
        }else{
            System.out.print("Saliendo del sistema...");
        }
    }
}
