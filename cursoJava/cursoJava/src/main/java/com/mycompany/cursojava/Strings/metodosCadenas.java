
package com.mycompany.cursojava.Strings;
public class metodosCadenas {
    public static void main(String[] args) {
        //Metodo de cadenas
        var cadena1= "Hola Mundo";
        
        //obtener el largo de la cadenas
        
        var longitud=cadena1.length();
        System.out.println("Longitud cadena = "+longitud);
        
        //Remplazar caracters
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("Cadena nueva = "+nuevaCadena);
        
        //convertir Mayusculas
        var mayuscCadena = cadena1.toUpperCase();
        System.out.println("Cadena en mayuscula = "+mayuscCadena);
        
        //convertir Minuscula
        System.out.println("Cadena en Minuscula = "+cadena1.toLowerCase());  
        
        //Eliminar espacios al inicio y al final
        var cadena2 = "  LEO MESSI     ";
        System.out.println("Cadena original = " + cadena2); 
        System.out.println("Cadena sin espacios = " + cadena2.trim()); 
                
        }
}
