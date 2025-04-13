package com.mycompany.cursojava.Strings;

public class caracteresEspeciales {
    public static void main(String[] args) {
        //Caracateres Especiales
        // '\n' - Imprimir un salto de linea
        var cadena1 = "Hola \nmundo";
        System.out.println("cadena1="+cadena1);
        
        // '\t' - Imprimir un tabulado
        var cadena2 = "Hola \t mundo";
        System.out.println("cadena3="+cadena2);
        
        //'\'' - Agrega una comilla simple
        var cadena3 = "Hola \' mundo";
        System.out.println("cadena3="+cadena3);
        
        //'\"' - Agrega una comilla dole
        var cadena4 = "Hola \" mundo";
        System.out.println("cadena4="+cadena4);
        
        // '\\' - Agrega barra inversa
        var cadena5 = "Hola \\ mundo";
        System.out.println("cadena5="+cadena5);
    }
    
}
