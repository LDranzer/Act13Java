import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException{
        menu();
    }

    public static void menu() throws IOException{
         AddressBook contactos = new AddressBook();

        System.out.println("Escoge tu opción\n 1. Cargar y mostrar los contactos\n 2.Guardar\n 3. Borrar\n 4. Crear");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch(menu){
            case 1:
            contactos.load();
            contactos.list();
            break;
            case 2:
            contactos.save();
            break;
            case 3:
            contactos.delete();
            break;
            case 4:
            contactos.create();
            main(null);
            break;
        }
    }
}
