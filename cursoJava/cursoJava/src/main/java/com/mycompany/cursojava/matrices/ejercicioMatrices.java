package com.mycompany.cursojava.matrices;

public class ejercicioMatrices {
     public static void main(String[] args) {
        //Introducir valores de la matriz
        int renglones = 3;
        int columnas= 3;
        int suma=0;
        //Definir la matriz
        
        var matriz=new int[renglones][columnas];
        
        //Ingresamos valores
        //Primer renglon
        matriz[0][0]=100;
        matriz[0][1]=200;
        matriz[0][2]=300;
        //Segundo renglon
        matriz[1][0]=400;
        matriz[1][1]=500;
        matriz[1][2]=600;
        //Tercer renglon
        matriz[2][0]=700;
        matriz[2][1]=800;
        matriz[2][2]=900;
        
        //iterar los valores de la matriz
        
        for(var ren=0;ren < renglones;ren++){
            for(var col=0;col < columnas; col++){
                
                if(ren == col){
                    suma = suma + matriz[ren][col];
                }
                
                System.out.println("Matriz["+ren+"]["+col+"] = "+matriz[ren][col]);
     
            }
        }
         System.out.println("Suma en diagonal= "+suma);
    }
}
