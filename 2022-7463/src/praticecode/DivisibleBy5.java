package praticecode;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		int num,qu;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = s.nextInt();
		s.close();
		if(num>0) {
			if(num%5==0) {
				qu=num/5;
				System.out.println("Given number "+num+" is Divisible by 5 and qutioent "+qu); 
			}
			else
				System.out.println("Given number "+num+" is not Divisible by 5");
		}
		else
			System.out.println(num+" is an Negitive Number");
	}

}