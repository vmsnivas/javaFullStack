package elearn;

class Employee{
	String workingDays = "MON-SAT";
	String workingHours = "9-6";
	int paidLeave = 1;
	
	void goal() {
		System.out.println("Perform well and take elearn to next heights.");
	}
}

class Trainer extends Employee{
	String role = "Teach Students";
}

class JavaTrainer extends Trainer{
	
}

public class Main {
	public static void main(String[] args) {
		JavaTrainer t = new JavaTrainer();
		
		System.out.println(t.workingDays);
		System.out.println(t.workingHours);
		System.out.println(t.paidLeave);
		System.out.println(t.role);
	}
}
