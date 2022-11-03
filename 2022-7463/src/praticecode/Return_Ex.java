package praticecode;

import java.util.Scanner;

public class Return_Ex {
	int value;
	Scanner s = new Scanner(System.in);
	void repeat(int n) {
		int i=1;
		while(i<=n) {
			System.out.print(" "+i);
			i++;
		}
		if(i>n)
			return;       //return statement without value to exit from method
		System.out.println("N value is "+n);
	}
	String name(){
		System.out.println("\n\nEnter the Name");
		String name=s.nextLine();
		return name;        //returning datatype value
	}
	Return_Ex value() {
		Return_Ex obj = new Return_Ex();
		obj.value=250;       
		return obj;               //returning object to class to store values 
	}
	public static void main(String[] args) {
		
		Return_Ex obj1 = new Return_Ex();
		obj1.repeat(10);
		System.out.println("Entered Name is "+obj1.name());
		
		Return_Ex obj2=obj1.value();// refernce to returned object;
		
		System.out.println("\n\nValues is"+obj2.value);
	}

}
