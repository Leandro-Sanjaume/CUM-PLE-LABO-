package com.company;
import java.sql.Array;
import java.util.Arrays;
import   java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oboe = new Scanner(System.in);
        boolean sesion = true;
        Producto prods = new Producto();
        float precios = 0;
        while (sesion == true) {
            System.out.println("Ingrese el nombre del producto");
            prods.setName(ingresoDeNombre());
            System.out.println("Ingrese el precio del producto");
            prods.setPrecio(ingresoDeNumero());
            precios = precios + prods.getPrecio();
            System.out.println("Desea agregar mas productos?");
            System.out.println("si o no");
            String opcion = ingresoDeNombre();
            if (opcion.equals("no") ){
                sesion = false;
            }
        }
        System.out.println("el valor de su compra es: "+precios);
    }
    public static  String ingresoDeNombre() {
        Scanner oboe = new Scanner(System.in);
        String dato1 = oboe.nextLine();
        return dato1;
    }
    public static float ingresoDeNumero() {
        Scanner oboe = new Scanner(System.in);
        float dato2 = oboe.nextFloat();
        return dato2;
    }
}