
package com.mycompany.cursojava.Scanner;
import java.util.Scanner;

public class sisRecetas {
    public static void main(String[] args) {
        var consola = new Scanner (System.in);
        
        //Receta
        System.out.print("Ingrese nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        
        //Ingredientes
        System.out.print("Ingrese ingredientes (Separar con comas): ");
        var ingredientes = consola.nextLine();

        //Minutos de coccion
        System.out.print("Ingrese minutos de coccion: ");
        var coccion = Integer.parseInt(consola.nextLine());

        //Dificultad de preparacion
        System.out.print("Ingrese dificultad (BAJA - MEDIA - ALTA): ");
        var dificultad = consola.nextLine();
        
        System.out.println("RECETA: ");
        System.out.println("\tNombre = " + nombreReceta);
        System.out.println("\tedad = " + ingredientes);
        System.out.println("\tSalario = " + coccion);
        System.out.println("\tEs Jefe de departamento? = " + dificultad);        
    }
}
