package emailapp;

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

    public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		
		this.password = randomPasssword(defaultPasswordLenght);
		System.out.println("Tú contraseña es: " + this.password);

    }
}