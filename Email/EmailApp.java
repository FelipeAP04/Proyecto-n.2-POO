package EmailApp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su primer nombre: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Ingrese su apellido: ");
        String lastName = scanner.nextLine();
        
        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInfo());
        
        scanner.close(); // Cierra el Scanner cuando hayas terminado de usarlo.
    }
}
