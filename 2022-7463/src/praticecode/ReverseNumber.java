package praticecode;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,temp=0,rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = s.nextInt();
		s.close();
		
		for(;num!=0;) {
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println("Reverse of the number :"+rev);

	}

}
