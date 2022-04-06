package com.company;
import java.util.ArrayList;
import   java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SistemaDeRegistroDePersonas sistema = new SistemaDeRegistroDePersonas();
        Scanner oboe = new Scanner(System.in);
        boolean sesion = true;
        while (sesion == true) {
            System.out.println("1.agregar persona.");
            System.out.println("2.eliminar persona.");
            System.out.println("3.modificar datos de la persona.");
            System.out.println("4.ver los mayores de edad.");
            System.out.println("5.ver a todas las personas.");
            System.out.println("6.salir.");
            int opcion = oboe.nextInt();
            if (opcion == 1){
                System.out.println("ingrese el nombre");
                String nombre = ingresoDeNombre();
                System.out.println("ingrese la edad");
                int edad = ingresoDeNumero();
                System.out.println("ingrese el dni");
                int dni = ingresoDeNumero();
                System.out.println("ingrese el telefono");
                int telefono = ingresoDeNumero();
                System.out.println("ingrese la direccion");
                String direccion = ingresoDeNombre();
                sistema.agregarPersona(nombre, edad, dni, telefono, direccion);
            }else if (opcion == 2){
                System.out.println("escriba el dni de la persona");
                int dni = ingresoDeNumero();
                sistema.eliminarPersona(dni);
            }else if (opcion == 3){
                System.out.println("ingrese todos los datos de la persona");
                System.out.println("ingrese el nuevo nombre");
                String nombre = ingresoDeNombre();
                System.out.println("ingrese la nueva edad");
                int edad = ingresoDeNumero();
                System.out.println("ingrese el nuevo dni");
                int dni = ingresoDeNumero();
                System.out.println("ingrese el nuevo telefono");
                int telefono = ingresoDeNumero();
                System.out.println("ingrese la nueva direccion");
                String direccion = ingresoDeNombre();
                sistema.modificarPersona(nombre, edad, dni, telefono, direccion);
            }else if (opcion == 4){
                ArrayList<String> nombres = sistema.getMayores();
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println(nombres.get(i));
                }
            }else if (opcion == 5){
                sistema.mostrarLista();
            }else if (opcion == 6) {
                sistema.salir();
                sesion = false;
            }
        }
    }
    public static  String ingresoDeNombre() {
        Scanner oboe = new Scanner(System.in);
        String dato1 = oboe.nextLine();
        return dato1;
    }
    public static int ingresoDeNumero() {
        Scanner oboe = new Scanner(System.in);
        int dato2 = oboe.nextInt();
        return dato2;
    }
}