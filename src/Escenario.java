public class Escenario {
    Persona a;
    Persona b;

    Escenario(Persona a, Persona b) {
        this.a = a;
        this.b = b;
    }

    public void run(String m1, String m2, Celestina c) {
        try {
            a.escucha("dime qué dialogo quieres ejecutar");
            String dialogo = a.dice().toLowerCase();
            switch (dialogo) {
            case "1":
                b.escucha("Vamos a interpretar el dialogo infinito");
                dialogoInfinito();
                break;
            case "2":
                b.escucha("Vamos a interpretar el dialogo de Acuerdo");
                dialogoDeAcuerdo(m1, m2);
            case "3":
                b.escucha("Vamos a interpretar con Celestina");
                dialogoConCelestina(m1, m2, c);
                break;
            default:
                break;
            }
        } catch (Exception e) {
            // Sólo lo pongo ya que me obliga el modelo de Excepciones java
        }
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
                b.escucha(da);

                if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                    break dialogo;
//System.out.println("1 " + da.contains(m1)+ " "+ db.contains(m2)+ " "+da.contains(m2)+ " "+ db.contains(m1) + ": "+((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1))));

                db = b.dice();
                a.escucha(db);
                if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                    break dialogo;
//System.out.println("2 " + da.contains(m1)+ " "+ db.contains(m2)+ " "+da.contains(m2)+ " "+ db.contains(m1) + ": "+((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1))));

            } catch (Exception e) {
                System.out.println(e.getMessage());
                break dialogo;
            }
        }
    }

    public void dialogoConCelestina(String m1, String m2, Celestina c) {
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
