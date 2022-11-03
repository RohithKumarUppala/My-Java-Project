package praticecode;

import java.util.Scanner;

public class Mean {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Elements");
		int sum=0,count=0;
		
		while(s.hasNextInt()&&count<10) {
			int num = s.nextInt();
			sum+=num;
			count++;
		}
		float mean=(float)sum/count;
		System.out.println("Sum of total is: "+sum+" \nNumer of Elements is :"+count+" \nmean is: "+mean);
		s.close();
	}
}
