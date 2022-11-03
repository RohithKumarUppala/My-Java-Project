package praticecode;

import java.util.Scanner;

public class palindrone {
	public static void main(String[] args) {
		int i,num,temp=0,rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = s.nextInt();
		int n=num;
		s.close();
		
		for(i=1;i<=n;i++) {
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		if(num==rev)
			System.out.println(num+" is an palindrone number because revserse of number also "+rev);
		else
			System.out.println(num+" is an not palindrone number because revserse of number also "+rev);
	}
}
