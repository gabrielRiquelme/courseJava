package com.mycompany.cursojava.matrices;
public class Matrices {
    public static void main(String[] args) {
    //Definimos una matriz
    var matriz2 = new int[][]{
        {100,200,300},
        {400,500,600}
    };
    //int [][] matriz= new int [2][3];

    final var RENGLONES = 2;
    final var COLUMNAS = 3;
    var matriz = new int[RENGLONES][COLUMNAS];
    
    //Modificar los valores de la matriz
    //Primer renglon
    matriz[0][0]=100;
    matriz[0][1]=200;
    matriz[0][2]=300;
    //Segundo renglon
    matriz[1][0]=400;
    matriz[1][1]=500;
    matriz[1][2]=600;
    
    //Recorrer matriz.
    //1. Ciclo mas externo.Recorrer los renglones
    System.out.println("Matriz 1 : ");
    for(var ren=0;ren < RENGLONES; ren++){
        //2. Ciclo interno. Recorrer las columnas
        for(var col=0;col<COLUMNAS;col++){
            System.out.println("Valor["+ren+"]["+col+"] = "+matriz[ren][col] );
        }
    }
    System.out.println("Matriz 2 : ");
    for(var ren=0;ren < matriz2.length; ren++){
        //2. Ciclo interno. Recorrer las columnas
        for(var col=0;col < matriz2[ren].length;col++){
            System.out.println("Valor["+ren+"]["+col+"] = "+matriz[ren][col] );
        }
    }
    }

    
      
}
