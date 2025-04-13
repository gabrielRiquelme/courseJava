
package com.mycompany.cursojava;

public class indicesCadenas {
    public static void main(String[] args) {
        var cadena1= "Hola Mundo";
        
        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("Primer letra="+primerCaracter);
        
        //Ultimo caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("Ultima letra="+ultimoCaracter);
        
        //Ultimo caracter
        var caracter = cadena1.charAt(5);
        System.out.println("Letra solicitada="+caracter);
    }
}
