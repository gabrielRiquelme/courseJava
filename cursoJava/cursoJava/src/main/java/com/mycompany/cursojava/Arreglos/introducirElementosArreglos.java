package com.mycompany.cursojava.Arreglos;
import java.util.Scanner;
        
public class introducirElementosArreglos {
    public static void main(String[] args) {
        //Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        
        //Declarar arreglo
        System.out.println("Proporciona el largo del arreglo; ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        
        //Creamos de manera dinamica el arreglo
        var enteros = new int[largoArreglo];
        
        //Solicitar los valores del arreglo
        for (int i=0;i< largoArreglo;i++){
            System.out.print("Proporciona enteros ["+i+"]=");
            enteros[i]=Integer.parseInt(consola.nextLine());
        }
        
        //imprimir valores
        
        for(int i=0;i<largoArreglo;i++){
            System.out.println("Valor de arreglo="+enteros[i]);
        }
    
    }
}
