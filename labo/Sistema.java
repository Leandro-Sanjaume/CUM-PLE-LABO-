package com.company;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<persona> personas = new ArrayList<persona>();
    private persona p1 = new persona();

    public void agregarPersona(String nombre, int edad, int Dni, int telefono, String direccion) {

        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.setDni(Dni);
        p1.setTelefono(telefono);
        p1.setDireccion(direccion);
        personas.add(p1);
    }

    public void eliminarPersona(int Dni) {
        for (persona i: personas) {
            if (i.getDni() == Dni) {
                personas.remove(i);
                break;
          }
        }
    }

    public void modificarPersona(String nombre, int edad, int Dni, int telefono, String direccion) {
        for (persona i: personas) {
            if (i.getDni() == Dni) {
                i.setNombre(nombre);
                i.setEdad(edad);
                i.setDni(Dni);
                i.setTelefono(telefono);
                i.setDireccion(direccion);
                break;
            }
        }
    }

    public ArrayList<String> getMayores() {
        ArrayList<String> mayores = new ArrayList<>();
        for (persona i: personas) {
            if (i.esMayorDeEdad()){
                mayores.add(i.getNombre());
            }
        }
        return mayores;
    }

    public void mostrarLista() {
        for (persona i: personas) {
            System.out.println("persona numero " + i);
            System.out.println("nombre: " + i.getNombre());
            System.out.println("edad: " + i.getEdad());
            System.out.println("dni: " + i.getDni());
            System.out.println("telefono: " + i.getTelefono());
            System.out.println("direccion: " + i.getDireccion());
        }
    }

    public void salir() {
        System.out.println("bye!");
    }
}