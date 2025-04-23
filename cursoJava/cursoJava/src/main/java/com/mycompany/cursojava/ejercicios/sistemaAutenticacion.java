
package com.mycompany.cursojava.ejercicios;

import java.util.Scanner;

public class sistemaAutenticacion {
    public static void main(String[] args) {
        //Defino constantes
        final var USUARIO_FINAL="admin";
        final var PASS_FINAL = "root";
        // Creo objeto tipo SCANNER
        var consola = new Scanner(System.in);
        System.out.println("***Bienvenido al sistema***");
        System.out.print("Ingrese usuario: ");
        var usuario = consola.nextLine().strip();
        
        System.out.print("Ingrese password: ");
        var pass = consola.nextLine().strip();
        
        if(USUARIO_FINAL.equals(usuario) && PASS_FINAL.equals(pass)){
            System.out.println("Bienvenido al sistema "+ usuario);
        }else if(USUARIO_FINAL.equals(usuario)){
            System.out.println("Usuario invalido");
        }else if(PASS_FINAL.equals(pass)){
            System.out.println("Password invalida");
        }else{
            System.out.println("Usuario y password invalido");
        }
    }
    
    //Version con Switch
    /*
    var mensajeAutenticacion = switch (usuario){
            case USUARIO_VALIDO -> {
                if(PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al Sistema!";
                else
                    yield "Password incorrecto, favor de corregirlo!";
            }
            default -> {
                if(PASSWORD_VALIDO.equals(password))
                    yield "Usuario incorrecto, favor de corregirlo!";
                else
                    yield "Usuario y password incorrectos, favor de corregirlos!";
            }
        };
        // Imprimir el mensaje
        System.out.println(mensajeAutenticacion);
    

    */
    
}
