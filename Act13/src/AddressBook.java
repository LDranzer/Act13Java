import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class AddressBook {

    String outputFilename = "src/com/act13/tecmilenio/output.txt";
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> contactos = new HashMap<String, String>();
    BufferedReader bufferedReader = null;
    BufferedWriter bufferedWriter = null;
    

    public void load(){//Carga contactos

        System.out.println(outputFilename);
        list();
    }

    public void save() throws IOException{//Guarda cambios
                String line;
                line = contactos.toString();
                line = outputFilename.formatted();
                bufferedWriter.write(line);
                

    }

    public void list(){//Muestra contactos
        System.out.println(outputFilename);
    }

    public void create(){//Crea contactos
        System.out.println("Qué número tiene?");
        String phone = sc.nextLine();
        System.out.println("Qué nombre tiene?");
        String name = sc.nextLine();
        contactos.put(phone, name);
        load();
        list();
    }

    public void delete(){//Borra contactos
        System.out.println("Qué número quieres borrar?");
        String phone = sc.nextLine();
        System.out.println("Qué nombre quieres borrar?");
        String name = sc.nextLine();
        contactos.remove(phone, name);
        load();
        list();
    }




}
