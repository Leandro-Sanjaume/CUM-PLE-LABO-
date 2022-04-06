import java.util.ArrayList;

public class Madre extends Persona{
   private String nombreDeEmpresa;
   private ArrayList<Hijo> hijos;

    public Madre() {
        this.nombreDeEmpresa = "Arfox";
        this.hijos = new ArrayList<Hijo>();

    }

    public Madre(String nombre, String apellido, int edad, int dni, int telefono, String nombreDeEmpresa, ArrayList<Hijo> hijos) {
        super(nombre, apellido, edad, dni, telefono);
        this.nombreDeEmpresa = nombreDeEmpresa;
        this.hijos = hijos;
    }

    public ArrayList<Hijo> hijosMenores(){
        for (Hijo i:hijos) {
            if(i.getEdad() < 18){
                hijosMenores().add(i);
            }
        }
        return hijosMenores();
    }
}

