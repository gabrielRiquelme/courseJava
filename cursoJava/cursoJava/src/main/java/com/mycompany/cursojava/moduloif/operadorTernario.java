package com.mycompany.cursojava.moduloif;
public class operadorTernario {
    public static void main(String[] args) {
        //Sintaxis
        // CONDICION ? EXP1 : EXP2
        
        //Determinar si un numero es par o no
        
        var numero = 4;
        var resultado = (numero %2 == 0) ? "PAR":"IMPAR"; 
        System.out.println("El numero "+numero+" es "+resultado);
        
        //Determinar edad
        var edad = 17;
        var mensaje = (edad >=18) ? "Es mayor de edad":"Es menor de edad"; 
        System.out.println(mensaje);
        

        //Valor positivo,negativ o cero
        numero = -2;
        resultado = (numero > 0) ? "Positivo":(numero < 0)?"Negativo":"Cero"; 
        System.out.print("El numero "+ numero +" es un numero "+resultado);
    }
}
