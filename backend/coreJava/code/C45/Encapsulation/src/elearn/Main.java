package elearn;

import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private String email;
	
	public void setId(int id) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("For setting the roll number, please enter admin password");
		String pass = scanner.next();
		
		if(pass.equals("admin@123")) {
			this.id = id;
		}
		else System.out.println("Wrong password!!!");
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		if(email.length() < 13) System.out.println("Please provide a valid email!!");
		else {
			this.email = email;
		}
	}
	
	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}
	
	public String getEmail() {
		return email;
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setId(101);
		s1.setName("Arjun");
		s1.setEmail("arju@gmail.com");
		
		System.out.println("Student ID: " + s1.getId() + "\n" + "Student Name: " + s1.getName() + "\n" + "Student Email: " + s1.getEmail());
	}
}
