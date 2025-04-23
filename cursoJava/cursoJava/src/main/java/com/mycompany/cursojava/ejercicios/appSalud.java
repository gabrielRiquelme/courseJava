package com.mycompany.cursojava.ejercicios;
import java.util.Scanner;
public class appSalud {
    public static void main(String[] args) {
        //Constantes - Obejitvos
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        
        //Declaro objeto
        var consola = new Scanner(System.in);
        
        //Pido nombre & pasos caminados
        System.out.println("Ingrese su nombre: ");
        var nombre = consola.nextLine();
    
        System.out.print("Ingrese los pasos caminados: ");
        var pasos = Integer.parseInt(consola.nextLine());       
        
        //Funciones
        var calorias_quemedas = pasos * CALORIAS_POR_PASO;
        var meta_alcanzada = (pasos >= META_PASOS_DIARIOS) ? "Cumpliste la meta": "No has alcanzo la meta aun, pero animo estas cerca";
        System.out.println("Bienvenido al sistem de Salud: "+nombre);
        System.out.println("Calorias quemeadas: "+calorias_quemedas+"KCAL");
        System.out.println(meta_alcanzada);
    }
}
