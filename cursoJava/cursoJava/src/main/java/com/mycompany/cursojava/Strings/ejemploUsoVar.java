
package com.mycompany.cursojava.Strings;

public class ejemploUsoVar {
    public static void main(String[] args) {
        //SIN USO DE VAR
        System.out.println("Uso de variables declaradas con VAR");
        String nombre1="Juan";
        System.out.println("nombre1 = "+nombre1);
        //USO DE VAR
        var nombre2 = "Carlos";
        System.out.println("nombre2 = "+nombre2);
        
        var edad = 30;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F;
        var esCasado = true;
    
    }
}
