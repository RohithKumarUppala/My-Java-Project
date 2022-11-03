package looplingStatement;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  a number to sum reverse order :");
		int num = s.nextInt();
		int n=num;
		s.close();
		do {
			sum+=n;
			System.out.print(n+"+");
			n--;
		}while(n>0);
		
		System.out.println("0 = "+sum);
	}
}
