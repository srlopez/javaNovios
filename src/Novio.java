public class Novio extends Persona {
    int intensidad;

    Novio(String nombre, int intensidad) {
        super(nombre);
        this.intensidad = intensidad;
    }

    Novio(String nombre) {
        this(nombre, 10);
    }
}
