// Deep Copy
package elearn;

class Student{
	String name;
	String email;
	long mobile;
	String address;
	
	public Student() {
		
	}
	
	public Student(Student stu) {
		this.name = stu.name;
		this.email = stu.email;
		this.mobile = stu.mobile;
		this.address = stu.address;
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Arjun";
		s1.email = "arjun@gmail.com";
		s1.mobile = 9876543210L;
		s1.address = "Hyderabad";
		
		Student s2 = new Student(s1);
		s2.name = "Mallik";
		
		Student s3 = new Student(s1);
		s3.name = "Shri";
		
		
		System.out.println("Student1 Name: " + s1.name);
		System.out.println("Student2 Name: " + s2.name);
		System.out.println("Student3 Name: " + s3.name);
		
		
	}
}
