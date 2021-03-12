import java.util.Scanner;

public class Persona {
    String nombre;
    protected Scanner scn = new Scanner(System.in);

    Persona(String nombre) {
        this.nombre = nombre;
    }

    String dice() {
        System.out.print(nombre + " dice: ");
        return scn.nextLine();
    }

    Persona escucha(String palabras) throws Exception {
        System.out.println(nombre + " escucha: '" + palabras + "' ");
        return this;
    }
}

/*
 import java.io.BufferedWriter;
 import java.io.FileWriter; 
 import java.io.Writer;
 
  
 Writer output; 
 output = new BufferedWriter(new FileWriter(my_file_name,true)); 
 output.append("New Line!"); 
 output.close();
 
 */