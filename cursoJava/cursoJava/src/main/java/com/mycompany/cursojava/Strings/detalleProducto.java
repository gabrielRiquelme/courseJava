
package com.mycompany.cursojava.Strings;

public class detalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "Azucar";
        double precio = 1500.00;
        int cantidadDisponible =10;
        boolean disponibile = true;
        
        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(disponibile);
        
        System.out.println("-------------ASIGNO NUEVOS VALORES --------------");
        
        nombreProducto="Azucar Mascabo";
        precio=1250.00;
        cantidadDisponible=0;
        disponibile=false;
        
        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(disponibile);
    }
}
