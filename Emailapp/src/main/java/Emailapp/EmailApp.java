package Emailapp; //meter archivo en el paquete

import java.util.Scanner; //importar Java Scanner

public class EmailApp { //declara la clase EmailApp

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = scanner.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = scanner.nextLine();

    System.out.print("Enter your department (1 for students, 2 for professors, 3 for others): ");
    String department = scanner.nextLine();
    
    String institucion = scanner.nextLine();

    Email em1 = new Email(firstName, lastName, department, institucion);
    System.out.println(em1.showInfo());

    scanner.close();
}

}