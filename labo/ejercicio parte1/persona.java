package com.company;

public class persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public persona() {
        this.nombre = "Julian";
        this.edad = 20;
        this.dni = 23933354;
        this.telefono = 23324;
        this.direccion = "Alvear 1342";
    }

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public persona(String nombre, int edad, int dni, int telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getDni() {
        return this.dni;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean esMayorDeEdad() {
        return this.edad > 18;
    }

    public boolean sonLaMismaPersona(persona p) {
        return this.dni == p.dni;
    }

    public boolean tienenMismaEdad(persona p) {
        return this.edad == p.edad;
    }
}