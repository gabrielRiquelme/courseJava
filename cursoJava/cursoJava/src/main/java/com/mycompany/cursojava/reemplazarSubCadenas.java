
package com.mycompany.cursojava;
public class reemplazarSubCadenas {
    public static void main(String[] args) {
        //Reemplazar subcadeanas
        var cadena = "Hola Mundo";
        System.out.println("Cadena Original= "+ cadena);
        
        //Reemplazar subcadeanas
        var nuevaCadena = cadena.replace("Mundo","a todos");
        System.out.println("Cadena utilizando replace= "+ nuevaCadena);
        
        nuevaCadena = cadena.replace("Hola","Saludos");
        System.out.println("Cadena utilizando replace= "+ nuevaCadena);
        
    }
}
