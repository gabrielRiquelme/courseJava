package com.mycompany.cursojava.ciclos;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
        boolean bandera = true;
        var consola = new Scanner(System.in);
        Float resultado;
        while (bandera) {
            System.out.println("""
                    Bienvenido al sistema de calculadora
                    1- Sumar.
                    2- Restar.
                    3- Dividir.
                    4- Multiplicar.
                    5- Salir.
                    Ingrese una opcion:
                    """);
            var dato = Integer.parseInt(consola.nextLine());
            
            System.out.println("Ingrese el numero 1: ");
            var operando1 = Float.parseFloat(consola.nextLine());
            
            System.out.println("Ingrese el numero 2: ");
            var operando2 = Float.parseFloat(consola.nextLine());
            
            switch (dato) {
                case 1:
                    System.out.println("Operacion de suma");
                    resultado = operando1 + operando2;
                    System.out.println("Resultado= "+operando1+" + "+operando2+" = "+resultado);
                    break;
                case 2:
                    System.out.println("Operacion de resta");
                    resultado = operando1 - operando2;
                    System.out.println("Resultado= "+operando1+" - "+operando2+" = "+resultado);
                    break;
                case 3:
                    System.out.println("Operacion de division");
                    if(operando1 == 0.0 || operando2 == 0.0){
                        System.out.println("No se puede dividir por cero, ingresar numeros validos para la division");
                    }else{
                        resultado = operando1 / operando2;
                        System.out.println("Resultado= "+operando1+" / "+operando2+" = "+resultado);
                    };
                    break;
                case 4:
                    System.out.println("Operacion de multiplicacion");
                    resultado = operando1 * operando2;
                    System.out.println("Resultado= "+operando1+" * "+operando2+" = "+resultado);
                    break;
                case 5:
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

