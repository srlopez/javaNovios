public class Celestina extends Persona {
    String escuchado = "";
    String m1 = "";
    String m2 = "";

    Celestina(String nombre, String m1, String m2) {
        super(nombre);
        this.m1 = m1;
        this.m2 = m2;
    }

    String dice() {
        return adornar(escuchado);
    }

    private String adornar(String msg) {
        // https://emojikeyboard.top/es/
        int love = (int) (Math.random() * 10);
        switch (love) {
        case 1:
            return msg + " mucho";
        case 2:
            return "y tanto " + msg;
        case 3:
            return "si cariño. " + msg;
        case 4:
            return msg + " no mucho";
        case 5:
            return msg + " " +m1;
        case 6:
            return m2+ " " + msg;
        case 9:
            return msg + " otra vez!!";
        default:
            return msg;
        }
    }

    Persona escucha(String palabras) throws Exception {
        escuchado = palabras;
        return this;
    }

}
