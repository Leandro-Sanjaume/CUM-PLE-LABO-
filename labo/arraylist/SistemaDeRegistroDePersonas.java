package com.company;
import java.util.ArrayList;


public class SistemaDeRegistroDePersonas {
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

    public void eliminarPersona (int Dni){
        for(int i = 0; i < personas.size(); i++){
            if (personas.get(i).getDni() == Dni){
                personas.remove(i);
                break;
            }
        }
    }
    public void modificarPersona (String nombre, int edad, int Dni, int telefono, String direccion){
        for(int i = 0; i < personas.size(); i++){
            if (personas.get(i).getDni() == Dni){
                personas.get(i).setNombre(nombre);
                personas.get(i).setEdad(edad);
                personas.get(i).setDni(Dni);
                personas.get(i).setTelefono(telefono);
                personas.get(i).setDireccion(direccion);
                break;
            }
        }
    }

    public ArrayList <String> getMayores() {
      ArrayList <String> mayores = new ArrayList<>();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).esMayorDeEdad()){
                mayores.add(personas.get(i).getNombre());
            }
        }
        return mayores;
    }

    public void mostrarLista() {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("persona numero " + i);
            System.out.println("nombre: "+personas.get(i).getNombre());
            System.out.println("edad: "+personas.get(i).getEdad());
            System.out.println("dni: "+personas.get(i).getDni());
            System.out.println("telefono: "+personas.get(i).getTelefono());
            System.out.println("direccion: "+personas.get(i).getDireccion());
        }
    }

    public void salir() {
        System.out.println("bye!");
    }
}