public class Hijo extends Persona{
    private String escuelaAsistida;
    private String juegoFavorito;

    public Hijo() {
        this.escuelaAsistida = "politecnico de sufrimiento n°12";
        this.juegoFavorito = "elden rong";
    }

    public Hijo(String nombre, String apellido, int edad, int dni, int telefono, String escuelaAsistida, String juegoFavorito) {
        super(nombre, apellido, edad, dni, telefono);
        this.escuelaAsistida = escuelaAsistida;
        this.juegoFavorito = juegoFavorito;
    }
}
