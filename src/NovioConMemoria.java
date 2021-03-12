
public class NovioConMemoria extends Novio {
    String dicho = "Estás equivocado";
    String escuchado = "";

    NovioConMemoria(String nombre, int intensidad) {
        super(nombre, intensidad);
    }

    NovioConMemoria(String nombre) {
        super(nombre, 9);
    }

    @Override
    String dice() {
        System.out.println("No me escuchas, yo te dije <" + dicho + ">");
        dicho = super.dice();
        return dicho;
    }

    @Override
    Persona escucha(String palabras) throws Exception {

        escuchado = palabras;
        return super.escucha(palabras);
    }
}
