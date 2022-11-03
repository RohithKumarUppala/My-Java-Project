package looplingStatement;

import java.util.Scanner;

class SumOfNumber{
	int sum=0;
	int add(int n)
	{
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		return sum;
	}
}
public class Whileloop {

	public static void main(String[] args) {
		SumOfNumber N = new SumOfNumber();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to sum of upto number :");
		int n = s.nextInt();
		s.close();
		System.out.println("Sum of numbers upto "+n+" is "+N.add(n));
	}

}
