package com.mycompany.cursojava.ciclos;

public class cicloWhile_for {
    public static void main(String[] args) {
        //Sintaxis while
        var i =1;
        while(i <= 3){
            System.out.println(i);
            i++;
        }
        
        //sintaxis for
        for(i=1;i<=3;i++){
            System.out.println(i);
        }
        
        // sintaxis do while - Nos aseguramos que se va a realizar una ejecucin.

        var x = 1;
        do{
            System.out.println(x++);
        }while (x<=3);
    }
}
