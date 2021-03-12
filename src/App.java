public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Novio a = new Novio("Peter");
        NovioConMemoria b = new NovioConMemoria("Maider");

        String da = ""; // dicho por A
        String db = ""; // dicho por B

        String m1 = "te quiero";
        String m2 = "yo tambien";

        dialogo: while (true) {
            try {
                da = a.dice();
                b.escucha(da);

                System.out.println("> " + da + "/" + db);
                if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                    break;

                db = b.dice();
                a.escucha(db);

                System.out.println("> " + da + "/" + db);
                if ((da.contains(m1) && db.contains(m2)) || (da.contains(m2) && db.contains(m1)))
                    break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                break dialogo;
            }

        }

        System.out.println("No sabemos cómo acaba el tema!");
    }
}
