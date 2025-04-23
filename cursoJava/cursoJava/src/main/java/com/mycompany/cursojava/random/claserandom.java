package com.mycompany.cursojava.random;
import java.util.Random;

public class claserandom {
    public static void main(String[] args) {
        System.out.println("---Numeros aleatorios---");
        var random = new Random();
        
        //Generar un numero aleatorio entre 0 y 9.
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Numero aleatorio entre 0 y 9 = "+numeroAleatorio);
        
        //Generar un numero aleatorio entre 1 y 10.
        var numeroAleatorio2 = random.nextInt(10)+1;
        System.out.println("Numero aleatorio entre 1 y 10 = "+numeroAleatorio2);
        
        //Generar un numero aleatorio entre 0.0 y 0.1
        var flotanteAleatorio = random.nextFloat();
        System.out.println("Numero flotante aleatorio entre 0.0 y 1.0 = "+flotanteAleatorio);
        
        //Generar un numero aleatorio entre 1 y 10.
        var dado = random.nextInt(6)+1;
        System.out.println("Numero aleatorio entre 1 y 6 = "+dado);        
    }
}
