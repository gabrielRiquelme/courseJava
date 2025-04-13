package com.mycompany.cursojava.Arreglos;

    public class arreglos {
    public static void main(String[] args) {
        //Arreglos
        //1- Declaramos un arreglo
        
        //int[] enteros;
        
        //2- Inicializamos el arreglo
        //enteros = new int [3];
        
        //Declarar e inicializar un arreglo en misma linea.
        //int[] numeros= new int[2];
        //var enteros = new int[5];
        
        //modificar los elementos;
        //enteros[0]=13;
        //enteros[1]=21;
        //enteros[4]=64;
        
        //leer elementos
        //System.out.println("Valor1 = "+enteros[0]);
        //System.out.println("Valor2 = "+enteros[1]);
        //System.out.println("Valor2 = "+enteros[4]);
        
        //Sintaxis simplificada de arreglos.
        
        //int [] enteros = {100,200,300,400};
        var enteros = new int[]{100,200,300,400,500};
        System.out.println("Valor1 = "+enteros[0]);
        System.out.println("Valor2 = "+enteros[1]);
        System.out.println("Valor4 = "+enteros[4]);
        
        //iterar los elementos del arreglo;
        
        for (int i = 0;i<enteros.length;i++){
            System.out.println("Elemento numero "+ i +"="+ enteros[i]);
        }
    }
}
