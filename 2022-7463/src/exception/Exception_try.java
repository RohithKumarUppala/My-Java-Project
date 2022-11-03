package exception;

import java.util.Scanner;

public class Exception_try {

	public static void main(String[] args) {
		int Arr[]=new int[10];
		Scanner s = new Scanner(System.in); 
		try {
			for(int i=Arr.length;i>=0;i++) {
				Arr[i]=s.nextInt();
			}
		}catch(Exception e) {
			System.out.println("Array is starting with out of box"+e);
		}
		s.close();
	}

}
