
package com.mycompany.cursojava.Strings;
public class masConcatenaciones {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en JAVA.
        
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1+" "+cadena2;
        System.out.println("cadena3="+cadena3);
    
        //Metodo concatenacion
        cadena3= cadena1.concat(" ").concat("Mundo");
        System.out.println("Metodo concat = "+cadena3);
    
        //StringBuilder
        var contructorCadenas=new StringBuilder();
        contructorCadenas.append(cadena1);
        contructorCadenas.append(" ");
        contructorCadenas.append(cadena2);
        var resultado = contructorCadenas.toString();
        System.out.println("resultado con StringBuilder= "+resultado);
        
        //StringBuffer - recomandable para cuando trabajamos con hilos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado con StringBuffer= "+stringBuffer);
    
        //JOIN
        
        resultado = String.join(" ",cadena1,cadena2); //primer parametor difinimos el seperador.
        System.out.println("Resultado con JOIN= "+resultado);
    }
}
