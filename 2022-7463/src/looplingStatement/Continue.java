package looplingStatement;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		int i=1;
		Scanner s = new Scanner(System.in);
		System.out.println("print numbers not divible by 3 upto :");
		int n = s.nextInt();
		s.close();
		while(i<=n) {
			if(i%3==0) {
				i++;
				continue; //Skiping THe Iteration
				}
			System.out.println(i);
			i++;
		}
	}

}
