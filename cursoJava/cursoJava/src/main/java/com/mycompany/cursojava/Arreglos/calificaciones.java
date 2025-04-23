package com.mycompany.cursojava.Arreglos;
import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args) {
        //Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        
        //Declarar arreglo
        System.out.println("Proporciona la cantidad de notas a agregar: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        
        //Creamos de manera dinamica el arreglo
        var enteros = new int[largoArreglo];
        
        //Solicitar los valores del arreglo
        for (int i=1;i< largoArreglo;i++){
            System.out.print("Proporciona notas a sumar:["+i+"]=");
            enteros[i]=Integer.parseInt(consola.nextLine());
        }
        
        //imprimir valores
        int acumulador=0;
        for(int i=0;i<largoArreglo;i++){
            System.out.println("Valor de arreglo="+enteros[i]);
            acumulador = acumulador + enteros[i];
        }
        int promedio = acumulador / largoArreglo;
        System.out.println("El Promedio de las notas agregadas es: "+promedio);
    }
}
