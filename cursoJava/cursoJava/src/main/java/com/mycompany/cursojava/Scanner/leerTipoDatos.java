
package com.mycompany.cursojava.Scanner;
import java.util.Scanner;

public class leerTipoDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        
        //Leer un tipo int
        var consola = new Scanner (System.in); // in - input - enrada de datos
        System.out.print("Escribe su edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad = "+edad);
        
        //Leer un tipo Double
        System.out.print("Ingrese su Altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura = "+altura);
        
        //Cosumir el caracter de salto de linea, los cuales los tipos int o double no lo consumen.
        consola.nextLine();
        
        //Leer un tipo String
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre = " + nombre);
        
        //Conversion de datos
        
        //Tipo de conversion = String A INT
        System.out.println("Proporciona un valor ENTERO: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("Entero= "+entero);
        
        //Tipo de conversion = String A FLOAT
        System.out.println("Proporciona un valor FLOTANTE: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("Entero= "+flotante);
        
        //Double.parseDouble()
        //Boolean.parseBoolean()
        
    }
}
