/*
Funcion recurisiva=Funcion que se llama asi misma.
Reglas:
1- Debe llamarse a si misma.
2- Debe avanzar hacia un caso base, de lo contrario caemos en ciclos infinitos.

*/
package com.mycompany.cursojava.funciones;
public class funcionRecursiva {
    //Imprimir del 1 al 5 usaando funcion recursiva.
    static void funcionRecursiva(int numero){
        //Caso base
        if(numero == 1){
            System.out.print(numero+" ");
        }else{
            //Caso recursivo.
            funcionRecursiva(numero-1);
            System.out.print(numero + " ");
        }
    }
    public static void main(String[] args) {
        funcionRecursiva(5);
       
        
    }
}
