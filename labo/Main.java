package com.company;
import   java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner oboe = new Scanner(System.in);
        persona p1 = new persona();

        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(oboe.nextLine());
        System.out.println("Ingrese la direccion de la persona");
        p1.setDireccion(oboe.nextLine());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(oboe.nextInt());
        System.out.println("Ingrese el dni de la persona");
        p1.setDni(oboe.nextInt());
        System.out.println("Ingrese el telefono de la persona");
        p1.setTelefono(oboe.nextInt());
                                    
            System.out.println("Nombre: " + p1.getNombre());
            System.out.println("Dir: " + p1.getDireccion());
            System.out.println("Edad: " + p1.getEdad());
            System.out.println("DNI: " + p1.getDni());
            System.out.println("Tel: " + p1.getTelefono());
          
            System.out.println("desea cambiar:");
            System.out.println("1.nombre");
            System.out.println("2.edad");
            System.out.println("3.dni");
            System.out.println("4.telefono");     
            System.out.println("5.direccion");
            System.out.println("6.ninguna");
            int cambio = oboe.nextInt();

            if (cambio == 1) {
                System.out.println("Ingrese el nuevo nombre de la persona");
                String nuevoN = ingresoDePalabras();
                p1.setNombre(nuevoN);
            }
                if (cambio == 2) {
                    System.out.println("Ingrese la nueva edad de la persona");
                    int nuevaE = ingresoDeNumeros();
                    p1.setEdad(nuevaE);
                }
                  if (cambio == 3) {
                      System.out.println("Ingrese el nuevo dni de la persona");
                      int nuevoD = ingresoDeNumeros();
                      p1.setDni(nuevoD);
                  }
                   if (cambio == 4) {
                       System.out.println("Ingrese el nuevo telefono de la persona");
                        int nuevoT = ingresoDeNumeros();
                       p1.setTelefono(nuevoT);
                   }
                   if (cambio == 5) {
                       System.out.println("Ingrese la nueva direccion de la persona");
                       String nuevaD = ingresoDePalabras();
                       p1.setDireccion(nuevaD);
                   }
                   if (cambio == 6) {
                       System.out.println("Ningun dato de la persona fue modificado");
                   }

                   System.out.println("Nombre: " + p1.getNombre());
                   System.out.println("Dir: " + p1.getDireccion());
                   System.out.println("Edad: " + p1.getEdad());
                   System.out.println("DNI: " + p1.getDni());        
                   System.out.println("Tel: " + p1.getTelefono());
    }
      public static  int ingresoDeNumeros() {
                  Scanner oboe = new Scanner(System.in);
                  int dato = oboe.nextInt();
                  return dato;
      }
      public static  String ingresoDePalabras() {
                  Scanner oboe = new Scanner(System.in);
                  String dato2 = oboe.nextLine();
                  return dato2;
      }

}

