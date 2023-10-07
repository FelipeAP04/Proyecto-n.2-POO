package emailapp; //meter archivo en el paquete

import java.util.Scanner; //importar Java Scanner

public class EmailApp { //Declarar clase

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //crear nuevo scaner
        
        System.out.print("Ingrese su primer nombre: ");
        String firstName = scanner.nextLine(); //pedir nombre de usuario
        
        System.out.print("Ingrese su apellido: ");
        String lastName = scanner.nextLine(); // pedir apellido de usuario
        
        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInfo()); //crear correo con datos inscritos
        
        scanner.close(); // cerrar scaner cuando se termina de usar
    }
}
