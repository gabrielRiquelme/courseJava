package com.mycompany.cursojava.ejercicios;

import java.util.Scanner;

public class sistemaCalificaciones {
    public static void main(String[] args) {
        //Declaro Scanner;
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese la nota a convertir: ");
        var notaNumerica = Integer.parseInt(consola.nextLine());
        
        if(notaNumerica >=9 && notaNumerica <= 10){
            System.out.println("La nota es equivalente a una 'A'");
        }else if(notaNumerica >=8 && notaNumerica < 9){
            System.out.println("La nota es equivalente a una 'B'");
        }else if(notaNumerica >=7 && notaNumerica < 8){
            System.out.println("La nota es equivalente a una 'C'");
        }else if(notaNumerica >=6 && notaNumerica < 7){
            System.out.println("La nota es equivalente a una 'D'");
        }else if (notaNumerica >=0 && notaNumerica < 6){
            System.out.println("La nota es equivalente a una 'F'");
        }else{
            System.out.println("Valor Desconocido");
        }
    
    }
}
