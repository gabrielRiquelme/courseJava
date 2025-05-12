package com.mycompany.cursojava.ciclos;


import java.util.Random;
import java.util.Scanner;

public class advininzas {
    public static void main(String[] args) {
        //VARS
        var consola = new Scanner(System.in);
        final int NUMERO_SECRETO = new Random().nextInt(51);
        final int MAX_INTENTOS = 10;
        var contador = 0;
        boolean adivino=false;
        int numero=0;
        
        //DATOS
        System.out.println("NUMERO_SECRETO="+NUMERO_SECRETO);
        
        //FLUJO PROGRAMA
        while(adivino != true && contador < MAX_INTENTOS){
            System.out.print("Ingrese un numero para adivinar el secreto: ");
            numero = Integer.parseInt(consola.nextLine());
            if(numero != NUMERO_SECRETO){
                if(numero > NUMERO_SECRETO){
                    System.out.println("Numero incorrecto, el numero secreto es MENOR");
                    contador = contador +1;
                }else{
                    System.out.println("Numero incorrecto, el numero secreto es MAYOR");                
                    contador = contador +1;
                }
            }else{
                System.out.println("Felicidades usted a ganado y lo logro con "+contador+" intentos.");
                adivino=true;
            }
        }
    }
}
