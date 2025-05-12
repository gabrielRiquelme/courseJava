package com.mycompany.cursojava.funciones;

public class funciones {
    static void saludar(String mensaje){
        System.out.println("Mensaje: "+mensaje);
    }
    static int sumar(int a,int b){
        var resultado = a +b;
        return resultado;
    }
    
    static boolean esPar(int numero){
        /*
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        } 
        */
        //Operador ternario
        return (numero % 2 == 0) ? true : false;
    }
    
    public static void main(String[] args) {
        saludar("Hola bosteros");
        System.out.println(sumar(10,10));
        
        System.out.println(esPar(20));
        
    }
}
  