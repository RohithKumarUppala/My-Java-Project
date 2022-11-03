package praticecode;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) throws ClassCastException{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the double Number");
		double d = s.nextDouble();
		s.nextLine();
		System.out.println("Press con_int to convert double to int ");
		System.out.println("Press con_long to convert double to long ");
		System.out.println("Press con_float to convert double to float ");
		String con = s.nextLine();
		if(con.equals("con_int")) {
			System.out.println("Double value:-"+d);
			int a = (int)d;
			System.out.println("Integer value:-"+a);
		}
		else if(con.equals("con_long")) {
		 	System.out.println("Double value:-"+d);
			long b = (long)d;
			System.out.println("Long value:-"+b);
		}
		else if(con.equals("con_float")) {
			System.out.println("Double value:-"+d);
			float c = (float)d;
			System.out.println("float value:-"+c);	
		}
		else
			System.out.println("Invalid Statement");
		s.close();
	}

}
