
public class App {

    static Novio a;
    static Novio b;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        a = new Novio("Javier");
        b = new NovioConMemoria("Eugenia");

        // Empezamos a sacar del main la funcionalidad....
        // permite parametrizar la función, y ayuda a que pueda ser reutilizada.
        empiezaDialogoDeAcuerdo("uno", "dos");

        System.out.println("Dialogo finalizado");
    }

    static void empiezaDialogoDeAcuerdo(String m1, String m2) {
        String da = "";
        String db = "";
        dialogo: while (true) {
            try {
                da = a.dice();
                b.escucha(da);

                if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                    break dialogo;

                db = b.dice();
                a.escucha(db);

                if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                    break dialogo;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                break dialogo;
            }
        }

    }

}
