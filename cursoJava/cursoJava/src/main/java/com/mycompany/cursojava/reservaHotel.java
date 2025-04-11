package com.mycompany.cursojava;
public class reservaHotel {
    public static void main(String[] args) {
        String nombreCliente="Juan Gabriel Riquelme";
        int diasHospedaje=7;
        double tarifaDiaria=35.000;
        final var vistAlMar= true;
        
        System.out.println(nombreCliente);
        System.out.println(diasHospedaje);
        System.out.println(tarifaDiaria);
        System.out.println(vistAlMar);
        
        diasHospedaje = 10;
        tarifaDiaria = 25.000;
        
        System.out.println(nombreCliente);
        System.out.println(diasHospedaje);
        System.out.println(tarifaDiaria);
        System.out.println(vistAlMar);
    }
    
}
