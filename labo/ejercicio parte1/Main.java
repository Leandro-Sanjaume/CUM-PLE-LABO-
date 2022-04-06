package com.company;

public class Main {

    public static void main(String[] args) {
        persona p1 = new persona("jorge",23,23232,23232332,"hola");
        persona p2 = new persona("Julio",45,24424,424242424,"maro");
        persona p3 = new persona("Yumeko otku",9,46245123,666666,"ninguna porque no existe son dibujos de un gordo japones de mierda todo sidoso");

        p1.setEdad(46);
        p2.setTelefono(11111111);
        System.out.println("Nombre: " + p3.getNombre());
        System.out.println("Edad: " + p3.getEdad());
        System.out.println("DNI: " + p3.getDni());
        System.out.println("Tel: " + p3.getTelefono());
        System.out.println("Dir: " + p3.getDireccion());


    }
}
