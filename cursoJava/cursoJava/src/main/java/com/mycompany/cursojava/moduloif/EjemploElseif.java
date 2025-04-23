package com.mycompany.cursojava.moduloif;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** 
 *
 * @author Juan G. Riquelme
 */
public class EjemploElseif {
    public static void main(String[] args) {

        // Uso de la sentencia if
        var edad = 10;

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else if(edad >= 13 && edad < 18){
            System.out.println("Eres un adolescente");
        }
        else{
            System.out.println("Eres un niño");
        }
    }
}

    
    

