
package com.mycompany.cursojava;
public class generadorEmail {
    public static void main(String[] args) {
        String nombre= "Juan Riquelme";
        String empresa="Const jar";
        String dominio= ".com.ar";
                
        var email = nombre.toLowerCase();//Lo paso a minuscula
        email = email.replace(" ",".");  //Agrego puntos
        email=email + "@";               //Agrego @
        empresa=empresa.replace(" ",""); //Elimino espacios
        empresa = empresa.toLowerCase(); //convierto a minuscula
        email=email+empresa+dominio;     //Concateno todo
        System.out.println(email);
        
        
    }
}
