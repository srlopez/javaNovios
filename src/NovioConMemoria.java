
public class NovioConMemoria extends Novio {
    String dicho = "Estás equivocado";

    NovioConMemoria(String nombre, int intensidad) {
        super(nombre, intensidad);
    }

    NovioConMemoria(String nombre) {
        this(nombre, 9);
    }

    @Override
    String dice() {
        System.out.println("No me escuchas, yo te dije <" + dicho + ">");
        dicho = super.dice();
        return dicho;
    }
}
