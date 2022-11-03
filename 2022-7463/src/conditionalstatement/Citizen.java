package conditionalstatement;
import java.util.Scanner;

class Citizenship{

	void Details(String name,int age) {
		if(age<18 && age>0) 
			System.out.println(name+" is a Childern because your age is "+age);
	
		else if(age>=18 && age<60 )
		 	System.out.println(name+" is an Adult because your age is "+age);
		
		else if(age>=60) 
			System.out.println(name+" is an Senior Citizen because the person age is "+age);
		
		else
			System.out.println("Invalid Data");
	}
}
public class Citizen {
	
	public static void main(String arg[]) {
		
		Citizenship C = new Citizenship();
		try(Scanner s = new Scanner(System.in)){
		
		System.out.println("Enter your name: ");
		String a = s.nextLine();
		
		System.out.println("Enter your Age :");
		int b = s.nextInt();
		
		C.Details(a, b);
		}
	}
}
// Uppala Rohith Kumar
