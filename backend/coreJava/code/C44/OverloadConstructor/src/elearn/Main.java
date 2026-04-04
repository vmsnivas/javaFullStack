package elearn;

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		System.out.println("New Student object created");
	}

	public Student(int id) {
		
	}

	public Student(String name) {
		
	}

	public Student() {
		
	}

}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sai");
		
		Student s2 = new Student(102);
		
		Student s3 = new Student("Arjun");
		
		Student s4 = new Student();
		
	}
}
