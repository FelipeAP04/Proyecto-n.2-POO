package emailapp;//meter archivo en el paquete

import java.util.Scanner;//importar Java Scanner

public class Email { //definir clase
    //crear variables de la clase
    private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLenght = 10;
	private String alternateEmail;
	private String companySuffix = "UNI.com";

    public Email(String firstName, String lastName){ //Constructor de la clase
		//llama firstName, lastName y department en el constructor
        this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment(); //pregunta por el departamento del usuario
		
        //define una contraseña
		this.password = randomPasssword(defaultPasswordLenght);
		System.out.println("Tú contraseña es: " + this.password);

        //cra email personalizado
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Tu correo es: " + email);
    }
	private String setDepartment() {
		
		
	}
}