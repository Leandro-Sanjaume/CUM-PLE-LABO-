package com.company;

public class Producto {
    private String name;
    private float precio;

    public Producto(){
        this.name = "teclado";
        this.precio = 2.76f;
    }
    public String getName() {
        return this.name;
    }
    public float getPrecio() {
        return this.precio;
    }
    public void setName(String nombre) {
        this.name = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}