package Emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLenght = 10;
	private String alternateEmail;
	private String companySuffix = "UNI.com";
	
	// Constructor que recibe el primer nombre y el apellido
	
		public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Pregunta por el método del departamento - lo regresa
		
		this.department = setDepartment();
		
		
		// método de contraseña aleatoria
		
		this.password = randomPasssword(defaultPasswordLenght);
		System.out.println("Tú contraseña es: " + this.password);
		
		// Combinar elemementos para generar el email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Tu correo es: " + email);
	}
	
	// Pregunta el departamento
	
	private String setDepartment() {
		System.out.print("CÓDIGOS DE DEPARTAMENTO\n1 para estudiantes\n2 para profesor\n3 ninguno de los anteriores\ncódigo aquí: " );
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "estudiantes"; }
		else if (depChoice == 2) { return "profesor"; }
		else if (depChoice == 2) { return "ninguno de los anteriores"; }
		else { return ""; }	
		
	}
	
	
	// Genera una contraseña aleatoria
	   
	private String randomPasssword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ1234567890!@#$%^&*+";
		char[] password = new char[length];
		for (int i=0; i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}


	// Genera un mailbox

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	
	// Genera el correo alternativo
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Cambio de contraseña
	
	public void changepassword(String password) {
		this.password = password; 
	}
	public int getmMailboxCapacity() {return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() { return password;}
	
	public String showInfo() {
		return "NOMBRE:	" + firstName + " " + lastName + 
				" \nCORREO DE: " + email + " " +
				" \nCAPACIDAD DEL BUZÓN: " + mailboxCapacity + " " +"mb";
								
	}
}