public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona a = new Persona("Leire");
        String dicho= a.dice();
        a.escucha("he dicho '"+dicho+"'");

        Novio b = new Novio("Luisa",7);
        dicho = b.escucha(dicho).dice();

        System.out.println("Palabras finales "+dicho);
    }
}
