
package com.mycompany.cursojava;

public class manejoSubCadenas {
    public static void main(String[] args) {
        //SUB CADENAS
        
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1= "+cadena1);
        
        //Sub cadena
        var subcadena1= cadena1.substring(0,4);        
        System.out.println("Subcadena1 ="+subcadena1);
              
        var subcadena2= cadena1.substring(5,10);        
        System.out.println("Subcadena2 ="+subcadena2);
    }
}
