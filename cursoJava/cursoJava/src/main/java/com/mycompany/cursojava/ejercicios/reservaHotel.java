package com.mycompany.cursojava.ejercicios;
import java.util.Scanner;

public class reservaHotel {
        public static void main(String[] args) {
        //Constantes - Obejitvos
        final var CUARTO_SIN_VISTA_AL_MAR = 150.50;
        final var CUARTO_CON_VISTA_MAR = 190.50;
        var totalEstadia= 0.0;
        //Declaro objeto
        var consola = new Scanner(System.in);
        
        //Pido nombre & datos
        System.out.println("Ingrese su nombre: ");
        var nombre = consola.nextLine();
    
        System.out.print("Ingrese los dias de estadia: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());       
        
        System.out.print("El cuarto tiene vista al mar? (true/false): ");
        var cuarto = Boolean.parseBoolean(consola.nextLine());  
        
        //Funciones
        if(cuarto){
            totalEstadia =  diasEstadia * CUARTO_CON_VISTA_MAR;
        }else{
           totalEstadia = diasEstadia * CUARTO_SIN_VISTA_AL_MAR;
        }
        System.out.println("Bienvenido al sistem de reserva "+nombre);
            System.out.println("Debe abonar un total de: "+ totalEstadia);
    }
}
