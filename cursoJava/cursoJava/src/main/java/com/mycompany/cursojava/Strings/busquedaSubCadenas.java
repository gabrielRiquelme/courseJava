
package com.mycompany.cursojava.Strings;
public class busquedaSubCadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOF - Devuelve el indice de la primera aparicion de la subcadena;
        var cadena1= "Hola Mundo";
        //subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("Indice1 = "+indice1);
        
        //LastIndexOF - Devuelve el indie de la ultima aparicion de la subcadena
        //subcadena de Mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("Indice2 ="+indice2);
        
        
    }
}
