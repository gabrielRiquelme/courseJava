package com.mycompany.cursojava.ciclos;

import java.util.Scanner;

public class validarPass {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese contraseña: ");
        String pass = consola.nextLine();
        
        while (pass.length() <6){
            System.out.println("Password incorrecta, debe tener minimo 6 caracteres");
            
            System.out.println("Ingrese una nueva contraseña: ");
            pass = consola.nextLine();
        }
    }
 
}
