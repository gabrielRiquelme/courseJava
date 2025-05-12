package com.mycompany.cursojava.objetos.Animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }
    
    protected void dormir(){
        System.out.println("Duermo mucho");
    }
}

class Perro extends Animal {
    public void hacerSonido(){
        System.out.print("Puedo ladrar");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo herencia **");
        System.out.println("Clase Padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
    } 
}