package com.mycompany.cursojava.matrices;

import java.util.Scanner;

public class pMatrices {
    public static void main(String[] args) {
        //Introducir valores a una matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        //DEfinir la matriz
        System.out.println("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        
        var matriz=new int[renglones][columnas];
        //Solicitamos los valores.
        for (var ren=0;ren < renglones;ren++){
            for(var col=0;col < columnas; col++){
                System.out.print("Valor["+ren+"]["+col+"] = ");
                matriz[ren][col]=Integer.parseInt(consola.nextLine());
            }
        }
        
        //iterar los valores de la matriz
        
        for(var ren=0;ren < renglones;ren++){
            for(var col=0;col < columnas; col++){
                System.out.println("Matriz["+ren+"]["+col+"] = "+matriz[ren][col]);
            }
        }
    }
}