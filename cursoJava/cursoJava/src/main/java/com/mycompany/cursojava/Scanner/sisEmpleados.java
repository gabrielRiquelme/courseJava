package com.mycompany.cursojava.Scanner;
import java.util.Scanner;

public class sisEmpleados {
    public static void main(String[] args) {
        //Creo la instancia de objeto scanner.
       
        var consola = new Scanner (System.in);
        
        //Leo nombre
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        
        //Leo edad
        System.out.print("Ingresar edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        //Leo salario
        System.out.print("Ingresar salario: ");
        var salario = Float.parseFloat(consola.nextLine());

        //Leo puesto
        System.out.print("Ingresar si es jefe de departamento o no: ");
        var puesto = Boolean.parseBoolean(consola.nextLine());

        
        System.out.println("Datos: ");
        System.out.println("Nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("Salario = " + salario);
        System.out.println("Es Jefe de departamento? = " + puesto);
    }
    
}
