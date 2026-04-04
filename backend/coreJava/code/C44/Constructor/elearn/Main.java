package elearn;

class Account{
	String name;
	double age;
	String gender;
	String pan;
	long aadhar;
	
	Account(String name, double age, String gender, String pan, long aadhar){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.pan = pan;
		this.aadhar = aadhar;
	}
	
	void show(){
		System.out.println("Account details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("PAN: " + pan);
		System.out.println("Aadhar: " + aadhar);		
	}
}

public class Main {
	public static void main(String[] args){
		Account ac1 = new Account("Arjun", 39.1, "Male", "ABCDEF1234Q", 908070605040L);
		ac1.show();
	}
}
