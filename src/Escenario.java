public class Escenario {
    Persona a;
    Persona b;
    Persona c;

    Escenario(Persona a, Persona b, Persona c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Recuperamos el diálogo infinito del paso 1
    public void dialogoInfinito() {
        while (true) {
            try {
                a.escucha(b.escucha(a.dice()).dice());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Pero la paciencia es infinita");
            }
        }
    }

    public void dialogoDeAcuerdo(String m1, String m2) {
        String da = "";
        String db = "";
        dialogo: while (true) {
            try {
                da = a.dice();
                c.escucha(da);
                da = c.dice();
                b.escucha(da);

                if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                    break dialogo;

                db = b.dice();
                c.escucha(db);
                db = c.dice();
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
