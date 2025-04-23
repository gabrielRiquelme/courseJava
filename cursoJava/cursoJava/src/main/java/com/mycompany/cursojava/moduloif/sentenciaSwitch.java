package com.mycompany.cursojava.moduloif;

public class sentenciaSwitch {
    public static void main(String[] args) {
        /*
        Sintaxis SWITCH:
        switch(valor_a_evaluar){
        case1:
            -
            -
            -
            break;
        case2:
            -
            -
            -
            break:;
        Default:
            -
            -
            -
        }fin switch
        
        */
        //Ejemplo
        System.out.println("Dia de la semana - SWITCH");
        var dia = 0;
        
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalida:"+dia);
        }
        //Sintaxis Mejorada de SWITCH
        System.out.println("*** SWITCH MEJORADO ***");
        var nombreDia = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";
        };
        
        System.out.println(nombreDia);
        
}
}
