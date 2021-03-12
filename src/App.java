
public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona a = new Novio("Jhon");
        Persona b = new NovioConMemoria("Pocahontas");

        // Creamos un escenario para nuestros actores
        Escenario escenario = new Escenario(a, b);

        //Lanzamos el diálogo que nos interese parametrizado
        escenario.dialogoDeAcuerdo("uno", "dos");
        //escenario.dialogoInfinito();

        System.out.println("Goodbye, World!");
    }
}
