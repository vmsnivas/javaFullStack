package elearn;

class Student{
	String name;
	
	static Student s = new Student();
	
	private Student() {
		
	}
	
	static Student getObject() {
		return s;
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = Student.getObject();
		s1.name = "Sai";
		
		Student s2 = Student.getObject();
		s2.name = "Arjun";
		
		System.out.println("Student 1: " + s1.name);
		System.out.println("Student 2: " + s2.name);
		
		
	}
}
