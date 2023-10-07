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
	// Pregunta el departamento
	
	private String setDepartment() { 
		System.out.print("CÓDIGOS DE DEPARTAMENTO\n1 para estudiantes\n2 para profesor\n3 ninguno de los 			anteriores\ncódigo aquí: " );
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();int depChoice = in.nextInt();
		if(depChoice == 1) { return "estudiante"; }
		else if (depChoice == 2) { return "profesor"; }
		else if (depChoice == 2) { return "ninguno de los anteriores"; }
		else { return ""; }	
    }
}