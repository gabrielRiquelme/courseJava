package com.mycompany.cursojava;
public class comparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas (Pool de cadenas);
        
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java"); //Reserva nuevo espacio y guarda aparte el valor "JAVA";
        //Comparacion de cadenas.(==) comparan referencia en memoria;
        
        System.out.print("Cadena1 es igual a la REFERENCIA de cadena 2?:");
        System.out.println(cadena1 == cadena2);
        
        //Comparacion cadena1 con cadena3 .
        System.out.print("Cadena1 es igual a la REFERENCIA de cadena 3?:");
        System.out.println(cadena1 == cadena3);
        
        //Comparar contenido = .equals
        
        System.out.print("Cadena1 es igual a contenido de cadena 3?:");
        System.out.println(cadena1.equals(cadena3));
    }
}
