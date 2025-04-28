package com.mycompany.cursojava.ciclos;
import java.util.Scanner;

public class cajeroAutomatico {

    public static void main(String[] args) {
        float saldo = 600000;
        boolean bandera = true;
        var consola = new Scanner(System.in);

        while (bandera) {
            System.out.println("""
                    Bienvenido al sistema de cajero
                    1- Ingresar dinero.
                    2- Retirar dinero.
                    3- Depositar dinero.
                    4- Salir.
                    Ingrese una opcion:
                    """);
            var dato = Integer.parseInt(consola.nextLine());

            switch (dato) {
                case 1:
                    System.out.println("Su saldo es de " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    float retiro = Float.parseFloat(consola.nextLine());
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo);
                    } else {
                        System.out.println("Cantidad inválida o saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar:");
                    float deposito = Float.parseFloat(consola.nextLine());
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Su nuevo saldo es: " + saldo);
                    } else {
                        System.out.println("Cantidad inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción del menú.");
            }
            System.out.println("Gracias vuelvas prontos");
            System.out.println(); // Agregar una línea en blanco para mejor legibilidad
        }
        consola.close();
    }
}