package looplingStatement;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int i=1;
		Scanner s = new Scanner(System.in);
		System.out.println("print numbers not divible by 3 upto :");
		int n = s.nextInt();
		s.close();
		while(i<=n) {
			if(i%3==0)
				break;//Exit From LOOP
			else
				System.out.println(i);
			i++;
		}
	}

}
