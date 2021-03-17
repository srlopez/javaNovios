
public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String m1 = "uno";
        String m2 = "dos";
        
        Persona a = new Novio("Jhon");
        Persona b = new NovioConMemoria("Pocahontas");
        Celestina c = new Celestina("Jaime", m1, m2);


        // Creamos un escenario para nuestros actores
        Escenario escenario = new Escenario(a, b);

        //Lanzamos el diálogo que nos interese parametrizado
        //escenario.dialogoInfinito();
        //escenario.dialogoDeAcuerdo(m1, m2);
        //escenario.dialogoConCelestina(m1, m2, c);
        escenario.run(m1, m2, c);

        System.out.println("Goodbye, World!");
    }
}
