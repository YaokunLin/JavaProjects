package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternativeEmail;
	private String companyName = "xyzcompany.com";
	
	// Object constructor to receive the first name and last name
	public Email(String firstName_LocalString, String lastName_LocalString) {
		this.firstName = firstName_LocalString;
		this.lastName=lastName_LocalString;
		//System.out.println("Email Created:"+this.firstName + " " + this.lastName);
		
		this.department = setDepartment(); // setting the department string
		//System.out.println("Department: " + this.department);
		// call a method asking for the department = return the department
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your Default Password is: "+this.password);
		
		//Combine elements to generate email
		if (department=="") {
			email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+companyName;	
		}
		else {
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+'.'+companyName;}
		//System.out.println ("Your email is: " + email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("Enrer the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int deptChoice=in.nextInt();
		//System.out.print(deptChoice);
		
		if(deptChoice == 1) {return "sales";}
		else if (deptChoice == 2) {return "dev";}
		else if (deptChoice == 3) {return "acctg";}
		else {return "";}
	}
	
	//Generate a random password
	private String randomPassword(int length_LocalInt) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*abcdefghijklmnoprrstuvwxyz";
		char[] password = new char[length_LocalInt];
		for (int i = 0; i<length_LocalInt;i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity (int capacity_LocalInt) {
		this.mailboxCapacity = capacity_LocalInt;
	}
	
	// Set the alternate email
	public void setAlternateEmail (String altEmail_LocalString) {
		this.alternativeEmail = altEmail_LocalString;
	}
	
	// Change the mailbox password
	public void changePassword(String password_LocalString) {
		this.password = password_LocalString;
	}
	
	public int getMailboxCapcity(){
		return this.mailboxCapacity;
	}
	
	public String getAlterEmail() {
		return this.alternativeEmail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String showInfo() {
		return "\nDISPLAY NAME: " + this.firstName+" " + this.lastName
				+"\nCOMPANY EMAIL:" + this.email
				+"\nMAILBOX CAPACITY:" + this.mailboxCapacity + "MB"
				+"\nDEFAULT PW:" + this.password
		        +"\nALTER. EMAIL:" + this.alternativeEmail;
		
	}
	
	
	
}
