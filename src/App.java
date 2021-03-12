public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Novio a = new Novio("Santi", 7);
        Persona b = new Persona("Ramóm");

        while (true) {
            a.escucha(b.escucha(a.dice()).dice());
        }
    }
}
