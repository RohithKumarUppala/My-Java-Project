package array;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int i;
		try(Scanner s =new Scanner(System.in)){
		System.out.println("Enter the Size of the Array");
		int n= s.nextInt();
		String name[] = new String[n+1];
		System.out.println("Enter Names one by one");
		for(i=0;i<name.length;i++) 
			name[i] = s.nextLine();
		
		System.out.println("Enter 'Yes' to print the Array Elements");
		String check = s.nextLine();
		
		if(check.equals("yes"))
			for(i=0;i<name.length;i++)
				System.out.print(name[i]+" ");
		}
	}

}
