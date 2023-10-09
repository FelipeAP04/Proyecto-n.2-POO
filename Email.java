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