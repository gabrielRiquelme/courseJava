
package com.mycompany.cursojava.Strings;
public class inmutabilidadCadenas {
    public static void main(String[] args) {
        //Inmutabilidad Cadenas
        
        var cadena1="Hola";
        System.out.println("Cadena1="+cadena1);
        var cadena2 = cadena1;
        cadena1="Adios";
        System.out.println("Cadena1 MODIFICADO="+cadena1);
        System.out.println("Cadena2="+cadena2);
    }
}
