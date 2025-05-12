package com.mycompany.cursojava.objetos.Persona;

public class Persona {
    
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
    
    //Mostrar nombre
    public String getNombre() {
        return this.nombre;
    }
    //Modificar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Mostrar nombre
    public String getApellido() {
        return this.apellido;
    }
    //Modificar nombre
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
