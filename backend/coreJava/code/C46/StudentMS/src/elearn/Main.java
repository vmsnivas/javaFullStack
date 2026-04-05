package elearn;

import java.util.Scanner;

public class Main {
	static Student []students = new Student[5];
	static int count = 0;
	
	static void studentRegistration() {
		if(count == 5) {
			System.out.println("No slot available. Try next year.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter name: ");
		student.setName(scanner.nextLine());
		System.out.println("Enter your email: ");
		student.setEmail(scanner.nextLine());
		System.out.println("Enter your mobile number: ");
		student.setMobile(scanner.nextLong());
		
		students[count++] = student;
		
		System.out.println("Form submitted successfully");
	}
	
	static void admin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the admin email");
		String email = scanner.nextLine();
		System.out.println("Enter the admin password");
		String password = scanner.nextLine();
		
		if(email.equals("admin@yahoo.com") && password.equals("India@123")) {
			while(true) {
				System.out.println("1. View all students");
				System.out.println("2. Edit student");
				System.out.println("3. Delete student");
				System.out.println("4. Exit");
				
				int choice = scanner.nextInt();
				if(choice == 1) {
					for(int i = 0; i < count; i++) {
						System.out.println("Student: " + students[i].getId() + " " + students[i].getName() + " " + students[i].getEmail() + " " + students[i].getMobile());
					}
				}
				else if(choice == 2) {
					for(int i = 0; i < count; i++) {
						System.out.println("Student: " + (i+1) + " " + students[i].getName() + " " + students[i].getEmail() + " " + students[i].getMobile());
					}
					
					System.out.println("Enter the number of the student which you want to edit");
					int num = scanner.nextInt();
					
					System.out.println("Enter the new roll number");
					int rollNum = scanner.nextInt();
					
					students[num - 1].setId(rollNum);
					
					System.out.println("Student edited successfully");
				}
				else if(choice == 3) {
					for(int i = 0; i < count; i++) {
						System.out.println("Student: " + (i+1) + " " + students[i].getName() + " " + students[i].getEmail() + " " + students[i].getMobile());
					}
					
					System.out.println("Enter the number of the student which you want to delete");
					int num = scanner.nextInt();
					
					for(int i = num-1; i < count; i++) {
						students[i] = students[i+1];
					}
					
					count--;
					
					System.out.println("Student deleted successfully");
					
				}
				else if(choice == 4) break;
				else System.out.println("Wrong choice");
			}
		}
		else {
			System.out.println("Wrong Credentials");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println("*** Welcome to Student registration portal ***");
		System.out.println("==============================================");
		
		while(true) {
			System.out.println("1. Register yourself as Student");
			System.out.println("2. Login as Admin");
			System.out.println("3. Exit");
			int choice = scanner.nextInt();
			
			if(choice == 1) studentRegistration();
			else if(choice == 2) admin();
			else if(choice == 3) break;
			else System.out.println("Wrong choice");;
		}
	}
}
