public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Novio a = new Novio("Esperanza", 7);
        Persona b = new Novio("Luis", 8);

        String da = ""; // dicho por A
        String db = ""; // dicho por B

        String m1 = "te quiero";
        String m2 = "yo tambien";

        // coloco una etiqueta 'dialogo' para indicar a qué ciclo 
        // salgo cuando invoco break
        // No es necesario ya que sólo manejamos un ciclo
        // Pero es para que lo conozcáis.

        dialogo: while (true) {
            // a.escucha(b.escucha(a.dice()).dice());
            // Para salir del ciclo tenemos que recoger los mensjaes que se dicen
            // y mirar si cumplen las condiciones de salida del ciclo

            da = a.dice();
            b.escucha(da);

            //System.out.println("> " + da + "/" + db);
            if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                break dialogo;

            db = b.dice();
            a.escucha(db);

            //System.out.println("> " + da + "/" + db);
            if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                break;

        }

        System.out.println("Wonderful World!");
        System.out.println("Pareja arreglada!");
    }
}
