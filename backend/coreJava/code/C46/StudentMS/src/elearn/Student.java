package elearn;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String email;
	private long mobile;
	
	public void setId(int id) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("For setting the roll number, please enter admin password");
		String pass = scanner.next();
		
		if(pass.equals("India@123")) {
			this.id = id;
		}
		else System.out.println("Wrong password!!!");
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	public long getMobile() {
		return mobile;
	}
}
