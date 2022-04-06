import java.util.ArrayList;

public class Clientes {
    private int id;
    private int edad;
    private String nombre;
    private ArrayList<Libros> librosComprados = new ArrayList<Libros>();

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libros> getLibrosComprados() {
        return librosComprados;
    }

}

