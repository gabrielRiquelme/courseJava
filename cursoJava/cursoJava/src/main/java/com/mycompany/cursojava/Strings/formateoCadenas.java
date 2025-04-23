package com.mycompany.cursojava.Strings;
public class formateoCadenas {
    public static void main(String[] args) {
        System.out.println("--- Formateo de cadenas ---");
        var nombre = "Matias";
        var edad= 35;
        var salario = 2000.34;
    
        //String.format
        var mensaje = String.format("nombre: %s, Edad: %d, Salario: %.2f",nombre,edad,salario);
        System.out.println(mensaje);
                
        //Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f",nombre,edad,salario);
        
        //Formateo con text block
        var numeroEmpleado=12;
        mensaje = """
                  %nDetalle Persona:\s
                  ------------------------------------------
                  \tNombre: %s
                  \tNo. Empleado: %04d
                  \tEdad: %d anios
                  \tSalario: $%.2f
                 ------------------------------------------
                  """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println(mensaje);
        
        //Formateo con texblock y printf directamente
        System.out.printf("""
                  %nDetalle Persona:\s
                  ******************************************
                  \tNombre: %s
                  \tNo. Empleado: %04d
                  \tEdad: %d anios
                  \tSalario: $%.2f
                 ******************************************
                  """,nombre,numeroEmpleado,edad,salario);
    }
}
